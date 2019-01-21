package Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class scrolltest {
	
	WebDriver driver;
	@BeforeTest
	public void initialize()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
	
	JavascriptExecutor je=(JavascriptExecutor)driver;    /*javascript is used for scrolling. hence initialize javascript executor*/
	
	 
	WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]"));
	
	je.executeScript("argument[0].scrollIntoView();",element);    /*command to scroll to the element mentioned*/
	
	}

}
