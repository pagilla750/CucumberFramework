package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;

public class OfferPageStepDefinition {
	
public String offerpageproductname;
TestContextSetup textcontextsetup;
PageObjectManager pageobjectmanager;	

	public OfferPageStepDefinition(TestContextSetup textcontextsetup) {
		this.textcontextsetup = textcontextsetup;
		
	}
	
	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_prodcut_exist(String shortname) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		swithToOffersPage();
//		OfferPage offerpage = new OfferPage(textcontextsetup.driver);
//		pageobjectmanager = new PageObjectManager(textcontextsetup.driver);
		OfferPage offerpage = textcontextsetup.pageobjectmanager.getOfferingPage();
		offerpage.searchItem(shortname);
		//textcontextsetup.driver.findElement(By.id("search-field")).sendKeys(shortname);
		Thread.sleep(2000);
		//offerpageproductname = textcontextsetup.driver.findElement(By.xpath("//td[1]")).getText();
		offerpageproductname = offerpage.getProductName();
		
		    
	}
	
	public void swithToOffersPage() {
		
//		textcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
//		LandingPage landingpage = new LandingPage(textcontextsetup.driver);
//		pageobjectmanager = new PageObjectManager(textcontextsetup.driver);
		
		LandingPage landingPage = textcontextsetup.pageobjectmanager.getLandingPage();
		landingPage.selecttopDealsPage();
		textcontextsetup.genericutils.switchWindowToChild();
	}
	
	@Then("validate product name matches with offer name")
	public void validate_product_name_matches_with_offer_name() {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(offerpageproductname, textcontextsetup.landingpageproductname);
		
	}

}
