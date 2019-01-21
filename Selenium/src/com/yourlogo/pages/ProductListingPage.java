/**
 * 
 */
package com.yourlogo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * @author hp
 *
 */
public class ProductListingPage {
	
	WebDriver driver;

	By Addtocart=By.xpath("\"//div[@class='button-container']//a[@data-id-product='1']//span[text()='Add to cart']\"");
	By Proceedtochkout=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	
	String Title = "Order - My Store";
	
	//public ProductListingPage(WebDriver driver)                                    /*constructor*/
	//{
		//this.driver=driver;
	//}
	
	

	public ProductListingPage(WebDriver driver) {
		this.driver=driver;
	}



	public void clickaddtocart()
	{
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView(true);",Addtocart);    /*command to scroll to the element mentioned*/
		driver.findElement(Addtocart).click();
		
	}
	
	public void clickproceed()
	{
		driver.findElement(Proceedtochkout).click();
		
	}
}
