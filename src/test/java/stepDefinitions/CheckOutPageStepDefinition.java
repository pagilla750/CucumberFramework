package stepDefinitions;

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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;

public class CheckOutPageStepDefinition {
	TestContextSetup textcontextsetup;
	public CheckOutPage checkoutpage;
	

	public CheckOutPageStepDefinition(TestContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		checkoutpage = textcontextsetup.pageobjectmanager.getCheckOutPage();
		
	}


	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout_and_validate_the_items_in_checkout_pagesearched_for_shortname_in_offers_page(String name) throws InterruptedException
	{
//		checkoutpage = textcontextsetup.pageobjectmanager.getCheckOutPage();
		checkoutpage.proceedtocheckout();
	}
	
	
	
	@Then("Verify user has ability to enter promo code and palce the order")
	public void Verify_user_has_ability_to_enter_promo_code_and_palce_the_order()
	{
//		checkoutpage = textcontextsetup.pageobjectmanager.getCheckOutPage();
		Assert.assertTrue(checkoutpage.verifypromobutton());
	}
	
	
	
	
	
	
	
	
}
