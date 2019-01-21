package com.amazon.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductSort {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.get("https://www.amazon.in");
	driver.get("https://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=phone");
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	//driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
	
	}
	
	@Test
	public void LowestPrice()
	{
		
		
		WebElement sort= driver.findElement(By.xpath("//select[@class='a-spacing-top-mini']"));
		Select sortby = new Select(sort);
		sortby.selectByVisibleText("Price: Low to High");
	
		List <WebElement> product = driver.findElements(By.id("s-results-list-atf"));
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[5]/div[1]/a")).getText());
		
		//*[@id="result_0"]/div/div[5]/div[1]/a
		//*[@id=\"result_0\"]/div/div[5]/div[1]/a/span[2]/span
		
		
		
		List <WebElement> price = driver.findElements(By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']"));
		
		
		int size=price.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			List<String> Original_price_lst = new ArrayList<String>();
	           Original_price_lst.add(price.get(i).getText());
	           System.out.println(price.get(i).getText());
		}
		/*for (WebElement a:product)
		{
			String test=a.getText();
			System.out.println(test);
		}
		
		
		*/
		
	}

}
