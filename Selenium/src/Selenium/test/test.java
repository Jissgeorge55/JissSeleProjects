package Selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class test {
	
	WebDriver driver;
	@BeforeTest
	public void initialize()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	WebElement elem=driver.findElement(By.xpath("//div[@class='button-container']//a[@data-id-product='1']//span[text()='Add to cart']"));
	
	je.executeScript("arguments[0].scrollIntoView(true);",elem);
	
	elem.click();
	}
	
	
	//div[@class='button-container']//a[@data-id-product='1']//span[text()='Add to cart']
}
