package testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.InvoicePage;
import pageObjects.MenuPage;
import resources.BaseClass;

public class InvoicePageTest extends BaseClass {

	public WebDriver driver;


	@Test(groups = { "regression" }, priority = 1)
	public void InvoicePage() throws Exception {
		
		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.invoice().click();
		
		Assert.assertEquals(m1.Invoicepage().getText(), "INVOICE");
	}
	

	@Test(priority = 2)
	public void downloadInvoice() throws Exception {
		
		
		MenuPage m1 = new MenuPage(driver);
		m1.invoice().click();
		InvoicePage Ip = new InvoicePage(driver);
		Ip.client_no().click();
		Ip.pdf().click();
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);		
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(10000);
		@SuppressWarnings("unused")
		File pdf = new File("Downloads\\filename");
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Assert.assertEquals(pdf.exists(),true );
	} 

	@AfterTest(groups = { "regression" })
	public void driveClose() {

		driver.close();

	}
}