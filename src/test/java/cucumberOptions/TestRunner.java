package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//html, xml, json, extent reprots

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",
monochrome=true,
tags="@PlaceOrder or @OffersPage",
dryRun=false,
plugin= {"pretty","html:target/Results.html","json:target/Results.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})



public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
}
