package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;

public class LandingPageStepDefinition {
TestContextSetup textcontextsetup;
LandingPage landingPage;
	

	public LandingPageStepDefinition(TestContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		this.landingPage = textcontextsetup.pageobjectmanager.getLandingPage();
	}


	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
			Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
			}
	
	@When("^User searched with shortname (.+) and extract actual name of product$")
	public void user_searched_with_shortname_and_extract_actual_name_of_product(String shortname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		LandingPage landingpage = new LandingPage(textcontextsetup.driver);
//		PageObjectManager pageobjectmanager = new PageObjectManager(textcontextsetup.driver);
		
		landingPage.searchItem(shortname);
		Thread.sleep(2000);
		textcontextsetup.landingpageproductname = landingPage.getProductName();
		System.out.println("Actual prodcut name on homepage is: "+textcontextsetup.landingpageproductname);
		 
	}
	
	@When("Added {string} items of the selected product to cart")
	public void  Added_items_of_the_selected_product_to_cart(String qty) throws InterruptedException
	{
		landingPage.increment(Integer.parseInt(qty));
		Thread.sleep(2000);
		landingPage.addtocart();
	}


	
	
	
	
}
