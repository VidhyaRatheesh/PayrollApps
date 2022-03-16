package testcases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.ClientPage;
import pageObjects.MenuPage;
import resources.BaseClass;
import resources.ExcelData;

public class ClientPageTest extends BaseClass {

	public WebDriver driver;

	@Test(groups = { "SmokeTest" }, priority = 1)
	public void ClientPageCheck() throws Exception {
		driver = login();

		MenuPage m1 = new MenuPage(driver);
		m1.clients().click();

		Assert.assertEquals(m1.clientpage().getText(), "Clients");
	}

	@Test(priority = 2)
	public void createNewClient() throws Exception {
		ClientPage cp = new ClientPage(driver);
		cp.createClient().click();
		Assert.assertEquals(cp.createclientpage().getText(), "Create Client");
	}

	@Test(priority = 3,enabled=false)
	public void createNewClientValue() throws Exception {

		ClientPage cp = new ClientPage(driver);
		cp.createClient().click();
		ExcelData data = new ExcelData();
		ArrayList<String> exceldata = data.getData("createClient");
		cp.branchId().click();
		cp.client_ref().sendKeys(exceldata.get(0));
		cp.client_invoice_order().click();
		cp.divisionId().click();
		cp.client_invoice().sendKeys(exceldata.get(1));
		cp.client_invoice_delivery().click();
		cp.client_Name().sendKeys(exceldata.get(2));
		cp.client_phone().sendKeys(exceldata.get(3));
		cp.client_address().sendKeys(exceldata.get(4));
		cp.client_settlement().sendKeys(exceldata.get(5));
		cp.client_email().sendKeys(exceldata.get(6));
		cp.postcode().sendKeys(exceldata.get(7));
		cp.company_reg().sendKeys(exceldata.get(8));
		cp.client_master_document().click();
		cp.client_vat_rate().click();
		cp.Require_po().click();
		cp.save().click();
		
		Assert.assertEquals(cp.createnewClientValue().getText(), "RISHI");

	}

	@AfterTest(groups = { "SmokeTest" })
	public void driveClose() {
		driver.close();
	}
}
