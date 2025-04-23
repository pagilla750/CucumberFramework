package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	

	By cartbag = By.cssSelector("img[alt=\"Cart\"]");
	By checkoutbutton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promocode = By.cssSelector("input[class=\"promoCode\"]");
	By apply = By.cssSelector("button[class=\"promoBtn\"]");
	
	
	
	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void proceedtocheckout() throws InterruptedException
	{
		driver.findElement(cartbag).click();
		Thread.sleep(2000);
		driver.findElement(checkoutbutton).click();
	}
	
	public boolean verifypromobutton() 
	{
		driver.findElement(promocode).sendKeys("sam");
		driver.findElement(apply).click();
		return driver.findElement(apply).isDisplayed();
		
	}
	
	
	
}
