package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {

	WebDriver driver;

	public ReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/report/invoice']")
	WebElement invoice;
	@FindBy(xpath = "//input[@id='invoicesearch-client_name']")
	WebElement clientname;
	@FindBy(xpath = "//input[@id='invoicesearch-client_id']")
	WebElement clientNo;
	@FindBy(xpath = "//input[@id='invoicesearch-id']")
	WebElement invoice_id;
	@FindBy(xpath = "//input[@id='invoicesearch-po_number']")
	WebElement po_number;
	@FindBy(xpath = "//input[@id='invoicesearch-created_at_range']")
	WebElement startRange;
	@FindBy(xpath = "//input[@id='invoicesearch-duedate_range']")
	WebElement endRange;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public WebElement invoice() {
		return invoice;
	}

	public WebElement clientname() {
		return clientname;
	}

	public WebElement clientNo() {
		return clientNo;
	}

	public WebElement invoice_id() {
		return invoice_id;
	}

	public WebElement po_number() {
		return po_number;
	}

	public WebElement startRange() {
		return startRange;
	}

	public WebElement endRange() {
		return endRange;
	}

	public WebElement submit() {
		return submit;
	}
}
