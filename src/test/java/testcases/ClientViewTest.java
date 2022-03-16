package testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ClientPage;
import pageObjects.MenuPage;
import resources.BaseClass;
import resources.ExcelData;

public class ClientViewTest extends BaseClass {

	public WebDriver driver;

	@Test(groups = { "SmokeTest" }, priority = 1)
	public void ViewClient() throws Exception {
		driver = login();
		MenuPage m1 = new MenuPage(driver);
		m1.clients().click();
		m1.client_name().isSelected();
		m1.client_view().click();
		Assert.assertEquals(m1.viewClient().getText(), "AMAL XAVIOUR");

	}

	@Test(priority = 2)
	public void EditClient() throws Exception {
	
		MenuPage m1 = new MenuPage(driver);
		m1.clients().click();
		m1.client_edit_Name().isSelected();
		m1.client_edit().click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement save= driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		js.executeScript("arguments[0].click()", save);
		
		Assert.assertEquals(m1.editClient().getText(), "SAM");
	}

	@Test(priority = 3)
	public void SearchClient() throws Exception {
	
		MenuPage m1 = new MenuPage(driver);
		m1.clients().click();
		ClientPage cp = new ClientPage(driver);
		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("searchClient");
		cp.SearchclientName().sendKeys(exceldata.get(0));
		cp.clientId().sendKeys(exceldata.get(1));
		cp.searchClient().click();
		
		Assert.assertEquals(m1.clientpage().getText(), "Clients");

	}

	@AfterTest(groups = { "SmokeTest" })
	public void driverClose() {
		driver.close();
	}
}
