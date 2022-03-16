package testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.MenuPage;
import pageObjects.WorkersPage;
import resources.BaseClass;
import resources.ExcelData;

public class WorkerViewTest extends BaseClass {

	public WebDriver driver;

	@Test(priority = 1)
	public void SearchWorker() throws Exception {
		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.workers().click();
		WorkersPage wp = new WorkersPage(driver);
		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("searchWorker");
		wp.WorkerFirstname().sendKeys(exceldata.get(0));
		wp.WorkerLastName().sendKeys(exceldata.get(1));
		wp.WorkerPostcode().sendKeys(exceldata.get(2));
		wp.WorkerNiNumber().sendKeys(exceldata.get(3));
		wp.searchWorker().click();

		Assert.assertEquals(wp.searchWorkername().getText(), "WORKERS");

	}

	@Test(priority = 2)
	public void ViewWorker() throws Exception {
		WorkersPage wp = new WorkersPage(driver);
		wp.select_worker().isSelected();
		wp.view_worker().click();

		Assert.assertEquals(wp.ViewWorker().getText(), "Tom");

	}

	@Test(priority = 3)
	public void updateWorker() throws Exception {

		MenuPage m1 = new MenuPage(driver);
		m1.workers().click();
		WorkersPage wp = new WorkersPage(driver);
		wp.select_new_worker().click();
		wp.select_worker().isSelected();
		wp.next_submit().click();
		wp.saveworker().click();

	}

	@Test(priority = 4)
	public void DeleteWorker() throws Exception {
		WorkersPage wp = new WorkersPage(driver);

		wp.select_worker().isSelected();
		wp.delete_worker().click();
		driver.switchTo().alert().accept();
		Assert.assertEquals(wp.searchWorkername().getText(), "WORKERS");

	}

	@AfterTest
	public void driveClose() {
		driver.close();
	}

}
