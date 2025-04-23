package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	

	By search = By.xpath("//input[@type='search']");
	By productName = By.xpath("//h4[@class='product-name']");
	By topDealsPage = By.linkText("Top Deals");
	By increment = By.cssSelector("a[class=\"increment\"]");
	By addtocart = By.xpath("//button[contains(text(),'ADD TO CART')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void selecttopDealsPage() {
		driver.findElement(topDealsPage).click();
		
	}
	
	public void increment(int qty) 
	{
		while(qty-1>0) {
			driver.findElement(increment).click();			
			qty--;
		}
			
	}
	
	public void addtocart() {
		driver.findElement(addtocart).click();
	}
	
	
}
