package testcases;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginValidationTest extends BaseClass

{	
	public WebDriver driver;
	
	@Test(priority=1)
	public  void IncorrectUsername() throws Exception 
	{
		driver = Driver();
		
		LoginPage Lg = new LoginPage(driver);	
			Lg.username().sendKeys(prop.getProperty("Invalidusername"));
			Lg.password().sendKeys(prop.getProperty("password"));
			Lg.login().click();
			
			Assert.assertEquals(Lg.alertmsg().getText(),"Incorrect username or password.");
			
	}
	
	@Test(priority=2)
	public  void IncorrectPassword() throws Exception 
	{
		driver = Driver();
		LoginPage Lg = new LoginPage(driver);	
			Lg.username().sendKeys(prop.getProperty("username"));
			Lg.password().sendKeys(prop.getProperty("Invalidpassword"));
			Lg.login().click();
			
			Assert.assertEquals(Lg.alertmsg().getText(),"Incorrect username or password.");
			
	}
	
	@Test(priority=3)
	public  void ValidLogin() throws Exception 
	{
		driver = Driver();
		LoginPage Lg = new LoginPage(driver);	
			Lg.username().sendKeys(prop.getProperty("username"));
			Lg.password().sendKeys(prop.getProperty("password"));
			Lg.login().click();		
		
	}
	
	@AfterTest
	public void driveClose() {
		driver.close();
	}

}
