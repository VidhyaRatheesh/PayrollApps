
package testcases;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.BaseClass;

public class LoginTest extends BaseClass {
	
	public WebDriver driver;

	@Test(dataProvider = "testdata")
	public void HomeLog(String uname, String password) throws Exception {

		driver = Driver();
		LoginPage Lg = new LoginPage(driver);

		Lg.username().sendKeys(uname);
		Lg.password().sendKeys(password);
		Lg.login().click();

	}


	@DataProvider(name = "testdata")
	public Object[][] testDataField() {
		Object[][] data = new Object[1][2];
		data[0][0] = "carol";
		data[0][1] = "1q2w3e4r";
		return data;
	}
	
	

	 @AfterMethod ()
	  public void driveClose() 
	  {

			driver.close();

		}
	}
	


