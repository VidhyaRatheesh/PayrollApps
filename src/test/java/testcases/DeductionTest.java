package testcases;

import java.util.ArrayList;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.DeductionPage;
import pageObjects.MenuPage;
import resources.BaseClass;
import resources.ExcelData;

public class DeductionTest extends BaseClass {

	public WebDriver driver;

	@Test(priority = 1)
	public void deduction() throws Exception {
		driver = login();

		MenuPage m1 = new MenuPage(driver);
		m1.deduction().click();
		DeductionPage dp = new DeductionPage(driver);
		dp.deductions().click();
		
		Assert.assertEquals(dp.deductionpage().getText(), "DEDUCTIONS");
	}

	@Test(priority = 2)
	public void Viewdeduction() throws Exception {

		DeductionPage dp = new DeductionPage(driver);
		dp.deductions().click();
		dp.deductionName().click();
		dp.viewDeduction().click();
		Assert.assertEquals(dp.deductionpageview().getText(), "AMIR");
	}

	@Test(priority = 3)
	public void Editdeduction() throws Exception {

		DeductionPage dp = new DeductionPage(driver);
		dp.deductions().click();
		dp.deductionName().click();
		dp.EditDeduction().click();
		dp.submit().click();
		Assert.assertEquals(dp.editdeductionpage().getText(), "AMIR");

	}

	@Test(priority = 4)
	public void AddDeduction() throws Exception {
		

		MenuPage m1 = new MenuPage(driver);
		m1.deduction().click();

		DeductionPage dp = new DeductionPage(driver);
		dp.add_deduction().click();

		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("deduction");

		dp.deduction_worker_id().click();
		dp.deduction_worker_name().sendKeys(exceldata.get(0));
		dp.deduction_worker_name().sendKeys(Keys.ENTER);	
		dp.deduction_type().click();
		dp.amount().sendKeys(exceldata.get(1));
		dp.effective_form().sendKeys(exceldata.get(2));
		dp.effective_form().sendKeys(Keys.ENTER);
		dp.submit().click();
		
		Assert.assertEquals(dp.adddeductionview().getText(), "AMIR");

	}

	@AfterTest()
	public void driveClose() {

		driver.close();

	}
}
