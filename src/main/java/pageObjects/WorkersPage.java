package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkersPage {
	WebDriver driver;

	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Create Worker']")
	WebElement create_worker;

	@FindBy(xpath = "//select[@id='worker-title']")
	WebElement worker_title;

	@FindBy(xpath = "//input[@id='worker-first_name']")
	WebElement first_name;

	@FindBy(xpath = " //input[@id='worker-middle_name']")
	WebElement middle_name;

	@FindBy(xpath = "//input[@id='worker-last_name']")
	WebElement last_name;

	@FindBy(xpath = "//input[@id='worker-phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@id='worker-mobile']")
	WebElement mobile;

	@FindBy(xpath = "//input[@id='worker-email']")
	WebElement email;

	@FindBy(xpath = "//select[@id='worker-gender']")
	WebElement gender;

	@FindBy(xpath = "//input[@id='worker-dob']")
	WebElement worker_dob;

	@FindBy(xpath = "//input[@id='worker-address1']")
	WebElement address1;
	@FindBy(xpath = "//input[@id='worker-postcode']")
	WebElement postcode;

	@FindBy(xpath = "//select[@id='worker-branch_id']")
	WebElement branch_id;

	@FindBy(xpath = "//select[@id='worker-division_id']")
	WebElement division_id;

	@FindBy(xpath = "//select[@id='worker-employment_type']")
	WebElement employment_type;
	@FindBy(xpath = "//select[@id='worker-payslip_method']")
	WebElement payslip_method;

	@FindBy(xpath = "//input[@id='worker-ni_number']")
	WebElement ni_number;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement next_submit;

	@FindBy(xpath = " //td[normalize-space()='Tom']")
	WebElement select_worker;

	@FindBy(xpath = "//a[@href='/payrollapp/worker']")
	WebElement select_new_worker;

	@FindBy(xpath = "//tbody/tr[3]/td[8]/a[3]/span[1]")
	WebElement delete_worker;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]/span[1]")
	WebElement view_worker;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-pencil']")
	WebElement update_worker;

	@FindBy(xpath = "//input[@id='workersearch-first_name']")
	WebElement WorkerFirstname;

	@FindBy(xpath = "//input[@id='workersearch-last_name']")
	WebElement WorkerLastName;

	@FindBy(xpath = "//input[@id='workersearch-postcode']")
	WebElement WorkerPostcode;

	@FindBy(xpath = "//input[@id='workersearch-ni_number']")
	WebElement WorkerNiNumber;

	@FindBy(xpath = " //button[@type='submit']")
	WebElement searchWorker;

	@FindBy(xpath = "//select[@id='worker-payment_method']")
	WebElement paymentMethod;

	@FindBy(xpath = "//input[@id='worker-start_date']")
	WebElement startDate;

	@FindBy(xpath = "//select[@id='worker-ac_type']")
	WebElement accountType;

	@FindBy(xpath = "//input[@id='worker-ac_name']")
	WebElement accountName;

	@FindBy(xpath = "//input[@id='worker-ac_no']")
	WebElement accountNumber;

	@FindBy(xpath = "//input[@id='worker-sort_code']")
	WebElement sortCode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveworker;
	
	@FindBy(xpath = " //td[normalize-space()='Vidhya']")
	WebElement workerpage;

	@FindBy(xpath = "//input[@id='worker-roll_no']")
	WebElement Worker_rollno;
	
	@FindBy(xpath = "//h1[normalize-space()='Tom Mathew Xaviour']")
	WebElement ViewWorker;

	@FindBy(xpath = "//h1[normalize-space()='Workers']")
	WebElement searchWorkername;

	public WebElement select_new_worker() {
		return select_new_worker;
	}

	public WebElement paymentMethod() {
		Select option = new Select(worker_title);
		option.selectByVisibleText("BACS");
		return paymentMethod;
	}

	public WebElement startDate() {
		return startDate;
	}

	public WebElement accountType() {
		Select option = new Select(worker_title);
		option.selectByVisibleText("Building Society");
		return accountType;
	}

	public WebElement accountName() {
		return accountName;
	}

	public WebElement accountNumber() {
		return accountNumber;
	}

	public WebElement sortCode() {
		return sortCode;
	}

	public WebElement create_worker() {
		return create_worker;
	}

	public WebElement worker_title() {
		Select option1 = new Select(worker_title);
		option1.selectByVisibleText("Ms");
		return worker_title;
	}

	public WebElement first_name() {
		return first_name;
	}

	public WebElement middle_name() {
		return middle_name;
	}

	public WebElement last_name() {
		return last_name;
	}

	public WebElement phone() {
		return phone;
	}

	public WebElement timesheet() {
		return mobile;
	}

	public WebElement email() {
		return email;
	}

	public WebElement gender() {
		Select option2 = new Select(gender);
		option2.selectByVisibleText("Female");
		return gender;
	}

	public WebElement worker_dob() {
		return worker_dob;
	}

	public WebElement address1() {
		return address1;
	}

	public WebElement postcode() {
		return postcode;
	}

	public WebElement branch_id() {
		Select option3 = new Select(branch_id);
		option3.selectByVisibleText("Alpha_new");
		return branch_id;
	}

	public WebElement division_id() {
		Select option4 = new Select(division_id);
		option4.selectByVisibleText("NewAlpha");
		return division_id;
	}

	public WebElement employment_type() {
		Select option5 = new Select(employment_type);
		option5.selectByVisibleText("Contractor");
		return employment_type;
	}

	public WebElement payslip_method() {
		Select option6 = new Select(payslip_method);
		option6.selectByVisibleText("Paper");
		return payslip_method;
	}

	public WebElement ni_number() {
		return ni_number;
	}

	public WebElement next_submit() {
		return next_submit;
	}

	public WebElement createWorker() {
		return create_worker;
	}

	public WebElement mobile() {
		return mobile;
	}

	public WebElement select_worker() {
		return select_worker;
	}

	public WebElement delete_worker() {
		return delete_worker;
	}

	public WebElement view_worker() {
		return view_worker;
	}

	public WebElement update_worker() {
		return update_worker;
	}

	public WebElement WorkerFirstname() {
		return WorkerFirstname;
	}

	public WebElement WorkerLastName() {
		return WorkerLastName;
	}

	public WebElement WorkerPostcode() {
		return WorkerPostcode;
	}

	public WebElement WorkerNiNumber() {
		return WorkerNiNumber;
	}

	public WebElement searchWorker() {
		return searchWorker;
	}

	public WebElement saveworker() {
		return saveworker;
	}

	public WebElement workerpage() {		
		return workerpage;
	}

	public WebElement ViewWorker() {		
		return ViewWorker;
	}

	public WebElement Worker_rollno() {
		return Worker_rollno;
	}

	public WebElement searchWorkername() {	
		return searchWorkername;
	}

}
