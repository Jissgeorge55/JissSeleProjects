package com.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ProductSort2 {
	
	WebDriver driver;

	@BeforeMethod
    public void stast() {

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
    public void LowestPriceTest() throws InterruptedException {
        WebElement Sort = driver.findElement(By.xpath("//select[@class='a-spacing-top-mini']"));
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(Sort));

        Select sortby = new Select(Sort);
        sortby.selectByVisibleText("Price: Low to High");
        // resultsCol
//s-result-item  celwidget
//*[@class='a-size-base a-color-price s-price a-text-bold']
        List<WebElement> price = driver.findElements(By.xpath("//*[@class='s-result-item  celwidget  ']"));

        int x = price.size();

        System.out.println(x);

        for (int i = 0; i <= x; i++) {
            List<WebElement> price1 = driver.findElements(By.xpath(".//*[@class='a-size-base a-color-price s-price a-text-bold']"));
            Thread.sleep(10000);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@class='a-size-base a-color-price s-price a-text-bold']"))));
            
            

            //WebElement price1 = driver.findElement(By.xpath("//div[@id='atfResults']/ul/li/div[1]/div[5]/div[1]/a/span[2]"));

            //WebElement price2=driver.findElement(By.className("a-size-base a-color-price s-price a-text-bold"));

            System.out.println(price1.size());

            for (WebElement a : price1) {
            	
          

                String test = a.getText();

                System.out.println(test);

            }
        }
    }
	
}
