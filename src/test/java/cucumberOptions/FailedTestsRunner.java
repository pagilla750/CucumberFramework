package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//html, xml, json, extent reprots

@CucumberOptions(features="@target/failed_scenarios.txt",
glue="stepDefinitions",
monochrome=true,
tags="",
dryRun=false,
plugin= {"pretty","html:target/Results.html","json:target/Results.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class FailedTestsRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
}
