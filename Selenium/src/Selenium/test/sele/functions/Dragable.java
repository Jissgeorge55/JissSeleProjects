package Selenium.test.sele.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://way2automation.com/way2auto_jquery/droppable.php");
		
		WebElement drags=driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.doubleClick(drags); 
		
		action.dragAndDrop(drags, drop);
		
	}

}
