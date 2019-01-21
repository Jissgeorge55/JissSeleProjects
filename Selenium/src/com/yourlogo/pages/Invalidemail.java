package com.yourlogo.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invalidemail {
	
	WebDriver driver;
	JavascriptExecutor je;
	@BeforeTest
	
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		
		je=(JavascriptExecutor)driver;
	    
	}
	
	@Test
	public void test() throws InterruptedException
	
	{
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String path = "//button[@id=\"SubmitCreate\"]";
		System.out.println("path = " + path);
//		List<WebElement> items = driver.findElements(By.xpath(path));
//		for(WebElement element1 : items) {
//			System.out.println(element1.getText());
//			System.out.println(element1.getTagName());
//			System.out.println(element1.getAttribute("class"));
//			System.out.println(element1.getAttribute("id"));
//			System.out.println(element1.getAttribute("name"));
//		}
		
		
		
		WebElement element=driver.findElement(By.xpath(path));
		element.click();
//		je.executeScript("argument[0].click();",element);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		WebElement error=driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]"));
		
		String errormsg=error.getText();
		if(error != null)
			System.out.println("Message found");
		
		System.out.println("Mesage = " + errormsg);
	}
	
	
}