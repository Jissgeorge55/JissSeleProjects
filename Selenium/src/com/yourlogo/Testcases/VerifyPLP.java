package com.yourlogo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.yourlogo.pages.ProductListingPage;

public class VerifyPLP {
	
	@Test
	public void VerifyPLPpage()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		ProductListingPage plp=new ProductListingPage(driver);
		plp.clickaddtocart();
		plp.clickproceed();
				
	}

}
