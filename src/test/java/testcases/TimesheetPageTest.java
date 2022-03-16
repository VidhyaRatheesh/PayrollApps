package testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.TimesheetPage;
import resources.BaseClass;
import resources.ExcelData;

public class TimesheetPageTest extends BaseClass {

	public WebDriver driver;

	@Test(priority = 1)
	public void TimeSheetCheck() throws Exception {
		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.timesheet().click();
		Assert.assertEquals(m1.timesheet().getText(), "TimeSheet");
	}

	@Test(priority = 2)
	public void CreateTimeSheet() throws Exception {
		TimesheetPage tp = new TimesheetPage(driver);
		tp.create_timesheet().click();

		Assert.assertEquals(tp.create_timesheet().getText(), "Create Timesheet");
	}

	@Test(priority = 3)
	public void uploadTimeSheet() throws Exception {
		TimesheetPage tp = new TimesheetPage(driver);
		tp.create_timesheet().click();
		tp.select_File().sendKeys("C:\\Users\\LENOVO\\Downloads\\ROSE.jpg");
		tp.Upload_File().click();

		Assert.assertEquals(tp.uploadTimeSheet().getText(), "Create Timesheet");

		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("Timesheet");

		tp.branchid().click();
		tp.clientname().click();
		List<WebElement> lists = tp.workernameselect();
		for (WebElement list : lists) {
			if (list.getText().equalsIgnoreCase("AMAL")) {
				list.click();
				break;
			}
		}

		tp.workername().click();
		List<WebElement> lists1 = tp.workernameselect();
		for (WebElement list : lists1) {
			if (list.getText().equalsIgnoreCase("jose  Stephen")) {
				list.click();
				break;
			}
		}

		tp.employeeType().click();
		tp.timesheet_division_id().click();
		tp.timesheet_date().sendKeys(exceldata.get(2));
		tp.timesheet_date().sendKeys(Keys.ENTER);
		tp.timesheet_category().click();
		tp.timesheet_number().sendKeys(exceldata.get(3));
		tp.description().click();
		tp.frequency().click();
		tp.units().sendKeys(exceldata.get(4));
		tp.pay().sendKeys(exceldata.get(5));
		tp.bill().sendKeys(exceldata.get(6));
		tp.AddDeduction().click();
		tp.Dtype().click();
		tp.Damount().sendKeys(exceldata.get(10));
		tp.save().click();

		Assert.assertEquals(tp.timesheet().getText(), "TimeSheet");
	}

	@Test(priority = 4)
	public void generatePayslip() throws Exception {
		MenuPage m1 = new MenuPage(driver);
		m1.timesheet().click();
		TimesheetPage tp = new TimesheetPage(driver);
		tp.pendingTp().click();
		tp.generatePS().click();
		driver.switchTo().alert().dismiss();
	}

	@Test(priority = 5)
	public void generateInvoice() throws Exception {
		MenuPage m1 = new MenuPage(driver);
		m1.timesheet().click();
		TimesheetPage tp = new TimesheetPage(driver);
		tp.pendingTp().click();
		tp.generateIn().click();
		driver.switchTo().alert().dismiss();
	}

	@Test(priority = 6)
	public void ApprovedtimeSheet() throws Exception {
		MenuPage m1 = new MenuPage(driver);
		m1.timesheet().click();
		TimesheetPage tp = new TimesheetPage(driver);
		tp.approvedTs().click();
		tp.clientTs().click();
		tp.viewTs().click();

		
		Assert.assertEquals(tp.approvedtimesheet().getText(), "TIMESHEETS");
	}

	@AfterTest
	public void driveClose() {
		driver.close();
	}

}
