package com.amazon.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gettetxtExample {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in");
	
	}

	@Test
	public void test()
	{
		String text=driver.findElement(By.xpath("//*[@id=\"Xf2V-FnNwm7Cw_dFZPRa1w\"]/div[1]/h2")).getText();
		System.out.println(text);
	}
	
}
