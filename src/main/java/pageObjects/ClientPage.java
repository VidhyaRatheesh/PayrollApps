package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientPage {
	WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Create Client']")
	WebElement create_Client;
	@FindBy(name = "Client[branch_id]")
	WebElement branch_Id;
	@FindBy(xpath = "//input[@id='client-your_ref']")
	WebElement client_ref;
	@FindBy(xpath = "//select[@id='client-division_id']")
	WebElement division_Id;
	@FindBy(xpath = "//input[@id='client-client_name']")
	WebElement client_Name;
	@FindBy(name = "Client[client_address]")
	WebElement client_address;
	@FindBy(name = "Client[invoice_contact]")
	WebElement client_invoice;
	@FindBy(xpath = "//input[@id='client-phone']")
	WebElement client_phone;
	@FindBy(name = "Client[email]")
	WebElement client_email;
	@FindBy(name = "Client[company_reg]")
	WebElement company_reg;
	@FindBy(name = "Client[invoice_order]")
	WebElement client_invoice_order;
	@FindBy(name = "Client[invoice_delivery_method]")
	WebElement client_invoice_delivery;
	@FindBy(name = "Client[master_document]")
	WebElement client_master_document;
	@FindBy(name = "Client[settilement_days]")
	WebElement client_settlement;
	@FindBy(name = "Client[vat_rate]")
	WebElement client_vat_rate;
	@FindBy(xpath = "//label[normalize-space()='Require Po']")
	WebElement Require_po;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@id='client-postcode']")
	WebElement postcode;
	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
	WebElement SearchclientName;
	@FindBy(xpath = "//input[@id='clientsearch-id']")
	WebElement clientId;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;
	@FindBy(xpath = "//h1[normalize-space()='Update Client: Rishi']")
	WebElement createnewClientValue;

	public WebElement createClient() {
		return create_Client;
	}

	public WebElement branchId() {
		Select option1 = new Select(branch_Id);
		option1.selectByVisibleText("Alpha_new");
		return branch_Id;
	}

	public WebElement client_ref() {

		return client_ref;
	}

	public WebElement divisionId() {
		Select option2 = new Select(division_Id);
		option2.selectByVisibleText("NewAlpha");
		return division_Id;
	}

	public WebElement client_Name() {
		return client_Name;
	}

	public WebElement client_address() {
		return client_address;
	}

	public WebElement client_invoice() {
		return client_invoice;
	}

	public WebElement client_phone() {
		return client_phone;
	}

	public WebElement client_email() {
		return client_email;
	}

	public WebElement company_reg() {
		return company_reg;
	}

	public WebElement client_invoice_order() {
		Select option3 = new Select(client_invoice_order);
		option3.selectByVisibleText("By PO Number");
		return client_invoice_order;
	}

	public WebElement client_invoice_delivery() {
		Select option4 = new Select(client_invoice_delivery);
		option4.selectByVisibleText("Electronic");
		return client_invoice_delivery;
	}

	public WebElement client_master_document() {
		Select option5 = new Select(client_master_document);
		option5.selectByVisibleText("PDF");
		return client_master_document;
	}

	public WebElement client_settlement() {
		return client_settlement;
	}

	public WebElement client_vat_rate() {
		Select option6 = new Select(client_vat_rate);
		option6.selectByVisibleText("VAT 20.00%");
		return client_vat_rate;
	}

	public WebElement Require_po() {
		return Require_po;
	}

	public WebElement save() {
		return save;
	}

	public WebElement createclientpage() {
		return create_Client;
	}

	public WebElement postcode() {
		return postcode;

	}

	public WebElement SearchclientName() {
		return SearchclientName;
	}

	public WebElement clientId() {
		return clientId;
	}

	public WebElement searchClient() {
		return search;
	}

	public WebElement createnewClientValue() {	
		return createnewClientValue;
	}

}
