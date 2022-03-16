package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Dashboard']")
	WebElement dashBoard;

	@FindBy(xpath = " //a[normalize-space()='Company']")
	WebElement company;

	@FindBy(xpath = "//a[normalize-space()='Clients']")
	WebElement clients;

	@FindBy(xpath = "//a[normalize-space()='Workers']")
	WebElement workers;

	@FindBy(xpath = "//a[normalize-space()='Deduction']")
	WebElement deduction;

	@FindBy(xpath = "//a[normalize-space()='TimeSheet']")
	WebElement timesheet;

	@FindBy(xpath = "//a[normalize-space()='Payslip']")
	WebElement payslip;

	@FindBy(xpath = " //a[normalize-space()='Invoice']")
	WebElement invoice;

	@FindBy(xpath = "//a[normalize-space()='Report']")
	WebElement report;

	@FindBy(xpath = "//a[normalize-space()='Create Client']")
	WebElement newClient;

	@FindBy(xpath = "//td[normalize-space()='Amal xaviour']")
	WebElement client_name;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/span[1]")
	WebElement client_view;

	@FindBy(xpath = "//tbody/tr[3]/td[2]")
	WebElement client_edit_Name;

	@FindBy(xpath = "//tbody/tr[3]/td[6]/a[2]/span[1]")
	WebElement client_edit;
	
	@FindBy(xpath = "  //h1[normalize-space()='Amal xaviour']")
	WebElement viewClient;
	
	@FindBy(xpath = "//h1[normalize-space()='Sam']")
	WebElement editClient;	
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath = "//h1[normalize-space()='Invoice']")
	WebElement Invoicepage;
	
	@FindBy(xpath = "//h1[normalize-space()='Payslips']")
	WebElement reports;
	
	@FindBy(xpath = " //td[normalize-space()='Vidhya']")
	WebElement searchWorker;

	public WebElement client_name() {
		return client_name;
	}

	public WebElement client_view() {
		return client_view;
	}

	public WebElement client_edit_Name() {
		return client_edit_Name;
	}

	public WebElement client_edit() {
		return client_edit;
	}

	public WebElement dashBoard() {
		return dashBoard;
	}

	public WebElement company() {
		return company;
	}

	public WebElement clients() {
		return clients;
	}

	public WebElement workers() {
		return workers;
	}

	public WebElement deduction() {
		return deduction;
	}

	public WebElement timesheet() {
		return timesheet;
	}

	public WebElement payslip() {
		return payslip;
	}

	public WebElement invoice() {
		return invoice;
	}

	public WebElement report() {
		return report;
	}

	public WebElement newClient() {
		return newClient;
		
	}

	public WebElement clientpage() {
		return clients;
	}

	public WebElement workerpage() {
		return workers;
	}

	public WebElement clientDetails() {
		return clients;
	}

	public WebElement viewClient() {		
		return viewClient;
	}

	public WebElement editClient() {	
		return editClient;
	}

	public WebElement save() {		
		return save;
	}

	public WebElement Invoicepage() {		
		return Invoicepage;
	}

	public WebElement reports() {
		return reports;
	}

	
	public WebElement searchWorker() {		
		return searchWorker;
	}

	
}
