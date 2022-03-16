package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.LogoutPage;
import resources.BaseClass;

public class LogoutTest extends BaseClass {

	@Test
	public void Logout() throws Exception {

		driver = login();

		LogoutPage lp = new LogoutPage(driver);
		lp.carol().click();
		lp.logout().click();
		Assert.assertEquals(lp.logoutpage().getText(), "Login");

	}

	@AfterMethod()
	public void driveClose() {

		driver.quit();

	}
}
