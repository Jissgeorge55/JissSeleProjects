package Selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("jissge");
		driver.findElement(By.name("password")).sendKeys("test@123");
        //Actions action=new Actions(driver);
        //action.moveToElement(driver.findElement(By.xpath("//input[@type='submit']"))).click().build().perform();
        
        //driver.quit();
		
		WebElement invisible= driver.findElement(By.id("preloader"));
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		Boolean cover=wait.until(ExpectedConditions.invisibilityOf(invisible));
        
	if (cover)
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		takeScreenshot("test");
	}
		
		
		
		
		
	}
		public static void takeScreenshot(String filename) throws IOException
		{
			File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\hp\\eclipse-workspace\\Selenium\\src\\Output\\"+filename+".jpg"));
		}
		
		
	
		
		
		
		
	}


