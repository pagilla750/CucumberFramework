package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
TestContextSetup tectcontextsetup;

	public hooks(TestContextSetup tectcontextsetup) {
		this.tectcontextsetup=tectcontextsetup;
		
	}
	
	@Before("@netbanking")
	public void netbankingSetup() {
		System.out.println("@Before ---setup entries for Netbanking setup");		
				
	}
	
	@Before("@brokerbanking")
	public void brokerbankSetuo() {
		System.out.println("@Before ----setup entries for brokerbankingsetup");
		
	}
	@After
	public void AfterScenario() throws IOException{
		
		tectcontextsetup.testbase.WebDriverManager().close();
//		driver.close();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver = tectcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			//take screenshot
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(filecontent, "image/png","image");
			//New lines of code1
			//New lines of code2
		}
		
	}

}
