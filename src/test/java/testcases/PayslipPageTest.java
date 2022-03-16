
package testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.PayslipPage;
import resources.BaseClass;

public class PayslipPageTest extends BaseClass {

	public WebDriver driver;

	@Test(groups = { "regression" }, priority = 1)
	public void payslipPage() throws Exception {
		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.payslip().click();

		Assert.assertEquals(m1.payslip().getText(), "Payslip");

	}

	@Test(priority = 2)
	public void downloadInvoice() throws Exception {

		MenuPage m1 = new MenuPage(driver);
		m1.payslip().click();
		PayslipPage pp = new PayslipPage(driver);
		pp.payslip_id().click();
		pp.pdf1().click();
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		@SuppressWarnings("unused")
		File pdf = new File("Downloads\\filename");
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Assert.assertEquals(pdf.exists(), true);

	}

	@AfterTest(groups = { "regression" })
	public void driveClose() {
		driver.close();
	}
}
