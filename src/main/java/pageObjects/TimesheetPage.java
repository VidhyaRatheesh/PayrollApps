package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TimesheetPage {

	WebDriver driver;

	public TimesheetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Create Timesheet']")
	WebElement create_timesheet;
	@FindBy(xpath = "//input[@id='file-logo']")
	WebElement select_File;
	@FindBy(xpath = "//span[normalize-space()='Upload']")
	WebElement Upload_File;
	@FindBy(xpath = "//button[@value='playslip']")
	WebElement generatePS;
	@FindBy(xpath = "//a[normalize-space()='Pending Timesheets']")
	WebElement pendingTp;
	@FindBy(xpath = "//button[@value='invoice']")
	WebElement generateIn;
	@FindBy(xpath = "//a[normalize-space()='Approved Timesheets']")
	WebElement approvedTs;
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement clientTs;
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/span[1]")
	WebElement viewTs;
	@FindBy(xpath = "//select[@id='timesheet-branch_id']")
	WebElement branchid;
	@FindBy(xpath = "//span[@id='select2-timesheet-client_id-container']")
	WebElement clientid;
	@FindBy(xpath = "//span[@id='select2-timesheet-worker_id-container']")
	WebElement workerid;
	@FindBy(xpath = "//select[@id='timesheet-division_id']")
	WebElement timesheet_division_id;
	@FindBy(xpath = "//input[@id='timesheet-date']")
	WebElement timesheet_date;
	@FindBy(xpath = "//select[@id='timesheet-category']")
	WebElement timesheet_category;
	@FindBy(xpath = "//input[@id='timesheet-timesheet_number']")
	WebElement timesheet_number;
	@FindBy(xpath = "//select[@id='rate-0-type_id']")
	WebElement type_id;
	@FindBy(xpath = "//select[@id='rate-0-frequency']")
	WebElement frequency;
	@FindBy(xpath = "//input[@id='rate-0-units']")
	WebElement units;
	@FindBy(xpath = "//input[@id='rate-0-pay']")
	WebElement pay;
	@FindBy(xpath = "//input[@id='rate-0-bill']")
	WebElement bill;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;
	@FindBy(xpath = "//select[@id='rate-0-type_id']")
	WebElement description;
	@FindBy(xpath = "//select[@id='timesheet-employment_type']")
	WebElement employeeType;
	@FindBy(xpath = " //input[@role='textbox']")
	WebElement clientname;
	@FindBy(xpath = "(//input[@role='textbox'])[1]")
	WebElement workername;
	@FindBy(xpath = "//input[@role='treeitem']")
	List<WebElement> workernameselect;
	@FindBy(xpath = "//select[@id='expense-0-type_id']")
	WebElement Adhoc;
	@FindBy(xpath = "//input[@id='expense-0-units']")
	WebElement Eunits;
	@FindBy(name = "Expense[0][pay]")
	WebElement Epay;
	@FindBy(xpath = "//input[@id='expense-0-bill']")
	WebElement Ebill;
	@FindBy(xpath = "//select[@id='deduction-0-type']")
	WebElement Dtype;
	@FindBy(xpath = "//input[@id='deduction-0-amount']")
	WebElement Damount;
	@FindBy(xpath = "//button[normalize-space()='Add Expense']")
	WebElement AddExpense;
	@FindBy(xpath = "//button[normalize-space()='Add Deduction']")
	WebElement AddDeduction;
	@FindBy(xpath = "//a[normalize-space()='TimeSheet']")
	WebElement timesheet;
	@FindBy(xpath = "//h1[normalize-space()='Timesheets']")
	WebElement approvedtimesheet;


	public WebElement save() {
		return save;
	}

	public WebElement description() {
		Select option = new Select(description);
		option.selectByVisibleText("Monday Day");
		return description;
	}

	public WebElement type_id() {
		return type_id;
	}

	public WebElement frequency() {
		Select option = new Select(frequency);
		option.selectByVisibleText("Hourly");
		return frequency;
	}

	public WebElement units() {
		return units;
	}

	public WebElement pay() {
		return pay;
	}

	public WebElement bill() {
		return bill;
	}

	public WebElement branchid() {
		Select option = new Select(branchid);
		option.selectByVisibleText("Alpha_new");
		return branchid;
	}

	public WebElement clientid() {
		return clientid;
	}

	public WebElement timesheet_division_id() {
		Select option = new Select(timesheet_division_id);
		option.selectByVisibleText("NewAlpha");
		return timesheet_division_id;
	}

	public WebElement timesheet_category() {
		Select option = new Select(timesheet_category);
		option.selectByVisibleText("Employee");
		return timesheet_category;
	}

	public WebElement timesheet_number() {
		return timesheet_number;
	}

	public WebElement create_timesheet() {
		return create_timesheet;
	}

	public WebElement select_File() {
		return select_File;
	}

	public WebElement Upload_File() {
		return Upload_File;
	}

	public WebElement uploadTimeSheet() {
		return create_timesheet;
	}

	public WebElement generatePS() {
		return generatePS;
	}

	public WebElement pendingTp() {
		return pendingTp;
	}

	public WebElement generateIn() {
		return generateIn;
	}

	public WebElement approvedTs() {
		return approvedTs;
	}

	public WebElement clientTs() {
		return clientTs;
	}

	public WebElement viewTs() {
		return viewTs;
	}

	public WebElement timesheet_date() {
		return timesheet_date;
	}

	public WebElement employeeType() {
		Select option = new Select(employeeType);
		option.selectByVisibleText("Paye");
		return employeeType;
	}

	public WebElement clientname() {
		return clientname;
	}

	public WebElement workerid() {
		return workerid;
	}

	public WebElement workername() {
		return workername;
	}

	public WebElement Adhoc() {
		Select option = new Select(Adhoc);
		option.selectByVisibleText("Safety Bonus");
		return Adhoc;
	}

	public WebElement Eunits() {
		return Eunits;
	}

	public WebElement Epay() {
		return Epay;
	}

	public WebElement Ebill() {
		return Ebill;
	}

	public WebElement Dtype() {
		Select option = new Select(Dtype);
		option.selectByVisibleText("Boots");
		return Dtype;
	}

	public WebElement Damount() {
		return Damount;
	}

	public WebElement AddExpense() {
		return AddExpense;
	}

	public WebElement AddDeduction() {
		return AddDeduction;
	}

	public List<WebElement> workernameselect() {
		return workernameselect;
	}

	public WebElement timesheet() {
		return timesheet;
	}

	public WebElement approvedtimesheet() {		
		return approvedtimesheet;
	}

}
