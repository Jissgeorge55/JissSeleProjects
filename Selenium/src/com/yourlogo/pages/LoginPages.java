/**
 * 
 */
package com.yourlogo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiss_george
 *
 */
public class LoginPages {
	
	WebDriver driver;
	
	/*Object Repo*/

	By username=By.id("email");                                          /*locators*/
	By password=By.xpath("//*[@id=\"passwd\"]");
	By signinbutton=By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
public LoginPages(WebDriver driver)                                     /*constructor*/
	{
		this.driver=driver;
	}
	
	
   public void Usernme()                                              /*method1*/

   {
	 driver.findElement(username).sendKeys("sele1.test@gmail.com");
	
   }
   public void Password()                                            /*method2*/
   {
	driver.findElement(password).sendKeys("seletest");
   }

   public void Clickbutton()                                          /*method3*/
   {
	driver.findElement(signinbutton).click();
	
   }
}
