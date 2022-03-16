package testcases;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.WorkersPage;
import resources.BaseClass;
import resources.ExcelData;

public class WorkerTest extends BaseClass {
	
	public WebDriver driver;

	@Test(priority = 1)
	public void WorkerPageCheck() throws Exception {
		driver = login();

		MenuPage m1 = new MenuPage(driver);
		m1.workers().click();

		Assert.assertEquals(m1.workerpage().getText(), "Workers");
	}

	@Test(priority = 2)
	public void NewWorker() throws Exception {
		WorkersPage wp = new WorkersPage(driver);
		wp.create_worker().click();
		Assert.assertEquals(wp.createWorker().getText(), "Create Worker");

	}

	@Test(priority = 3)
	public void CreateNewWorker() throws Exception {
		WorkersPage wp = new WorkersPage(driver);
		wp.create_worker().click();

		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("createWorker");

		wp.worker_title().click();
		wp.gender().click();
		wp.branch_id().click();
		wp.division_id().click();
		wp.employment_type().click();
		wp.payslip_method().click();
		wp.first_name().sendKeys(exceldata.get(0));
		wp.middle_name().sendKeys(exceldata.get(1));
		wp.last_name().sendKeys(exceldata.get(2));
		wp.worker_dob().sendKeys(exceldata.get(3));
		wp.worker_dob().sendKeys(Keys.ENTER);
		wp.address1().sendKeys(exceldata.get(4));
		wp.phone().sendKeys(exceldata.get(5));
		wp.ni_number().sendKeys(exceldata.get(6));
		wp.mobile().sendKeys(exceldata.get(7));
		wp.email().sendKeys(exceldata.get(8));
		wp.postcode().sendKeys(exceldata.get(9));
		wp.next_submit().click();

		wp.accountName().sendKeys(exceldata.get(10));
		wp.accountNumber().sendKeys(exceldata.get(11));
		wp.sortCode().sendKeys(exceldata.get(12));
		wp.startDate().sendKeys(exceldata.get(13));
		wp.startDate().sendKeys(Keys.ENTER);
		wp.saveworker().click();

		Assert.assertEquals(wp.workerpage().getText(), "Vidhya");

	}

	@AfterTest
	public void driveClose() {
		driver.close();
	}
}
