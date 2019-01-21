/**
 * 
 */
package com.yourlogo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.yourlogo.pages.LoginPages;

/**
 * @author jiss_george
 *
 */
public class VerifyLogin {
	
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		LoginPages login=new LoginPages(driver);
		login.Usernme();
		login.Password();
		login.Clickbutton();
		
	}

}
