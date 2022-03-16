package testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.ReportPage;
import resources.BaseClass;
import resources.ExcelData;

public class ReportPageTest extends BaseClass {
	public WebDriver driver;

	@Test(priority = 1)
	public void Reports() throws Exception {
		driver = login();

		MenuPage m1 = new MenuPage(driver);
		m1.report().click();
		
		Assert.assertEquals(m1.reports().getText(), "PAYSLIPS");

	}

	@Test(priority = 2)
	public void InvoiceSearch() throws Exception {
		ReportPage cp = new ReportPage(driver);
		cp.invoice().click();
		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("Report");
		cp.clientname().sendKeys(exceldata.get(0));
		cp.clientNo().sendKeys(exceldata.get(1));
		cp.invoice_id().sendKeys(exceldata.get(2));
	//	cp.po_number().sendKeys(exceldata.get(3));
		cp.startRange().sendKeys(exceldata.get(3));
		cp.endRange().sendKeys(exceldata.get(4));
		cp.submit().click();
		
		Assert.assertEquals(cp.invoice().getText(), "Invoice");

	}

	@AfterTest
	public void driveClose() {

		driver.close();

	}
}
