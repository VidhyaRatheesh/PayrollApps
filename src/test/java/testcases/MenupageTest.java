
package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import resources.BaseClass;

public class MenupageTest extends BaseClass {
	
	public WebDriver driver;

	@Test(priority = 1)
	public void ClientLog() throws Exception {

		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.clients().click();

		Assert.assertEquals(m1.clients().getText(), "Clients");
	}

	@Test(priority = 2)
	public void companyLog() throws Exception {

		
		MenuPage m2 = new MenuPage(driver);
		m2.company().click();
		Assert.assertEquals(m2.company().getText(), "Company");
	}

	@Test(priority = 3)
	public void DashboardLog() throws Exception {

		
		MenuPage m2 = new MenuPage(driver);
		m2.company().click();
		Assert.assertEquals(m2.dashBoard().getText(), "Dashboard");
	}

	@AfterTest()
	public void driverClose() {

		driver.close();

	}

}
