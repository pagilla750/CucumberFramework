package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OfferPage offerPage;
	public CheckOutPage checkoutPage;
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() 
	{
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferingPage() 
	{
		offerPage = new OfferPage(driver);
		return offerPage;
	}
	
	public CheckOutPage getCheckOutPage()
	{
		checkoutPage = new CheckOutPage(driver);
		return checkoutPage;
	}
	
}
