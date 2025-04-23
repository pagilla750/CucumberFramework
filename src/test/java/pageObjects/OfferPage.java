package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
public WebDriver driver;
	

	By search = By.id("search-field");
	By productName = By.xpath("//td[1]");
	
	

	public OfferPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	
	
}
