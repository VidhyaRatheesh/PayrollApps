package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeductionPage {
	WebDriver driver;

	public DeductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Add Deduction")
	WebElement add_deduction;

	@FindBy(xpath = "//span[@class='select2-selection__placeholder']")
	WebElement worker_id;

	@FindBy(xpath = "//select[@id='deduction-type']")
	WebElement deduction_type;

	@FindBy(xpath = "//input[@id='deduction-amount']")
	WebElement amount;

	@FindBy(xpath = "//input[@id='deduction-effective_from']")
	WebElement effective_form;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//a[normalize-space()='Deductions']")
	WebElement deductions;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement deductionName;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]/span[1]")
	WebElement viewDeduction;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[2]/span[1]")
	WebElement EditDeduction;

	@FindBy(xpath = "//span[@id='select2-deduction-worker_id-container']")
	WebElement deduction_worker_id;

	@FindBy(xpath = "//input[@role='textbox'][1]")
	WebElement deduction_worker_name;
	
	@FindBy(xpath = " //h1[normalize-space()='Deductions']")
	WebElement deductionpage;
	
	@FindBy(xpath = "//h1[normalize-space()='Amir']")
	WebElement deductionpageview;
	
	@FindBy(xpath = "//h1[normalize-space()='Amir']")
	WebElement adddeductionview;
	
	@FindBy(xpath = "//h1[normalize-space()='Amir']")
	WebElement editdeductionpage;
	
	@FindBy(xpath = "//input[@role='treeitem']")
	List<WebElement> workernameselect;	
	
	

	public WebElement add_deduction() {
		return add_deduction;
	}

	public WebElement worker_id() {
		return worker_id;
	}

	public WebElement deduction_worker_id() {
		return deduction_worker_id;
	}

	public WebElement deduction_type() {
		Select option = new Select(deduction_type);
		option.selectByVisibleText("Tools");
		return deduction_type;
	}

	public WebElement amount() {
		return amount;
	}

	public WebElement effective_form() {
		return effective_form;
	}

	public WebElement submit() {
		return submit;
	}

	public WebElement deductions() {
		return deductions;
	}

	public WebElement deductionName() {

		return deductionName;
	}

	public WebElement viewDeduction() {
		return viewDeduction;
	}

	public WebElement EditDeduction() {
		return EditDeduction;
	}

	public WebElement deduction_worker_name() {
		return deduction_worker_name;
	}

	public WebElement deductionpage() {		
		return deductionpage;
	}

	public WebElement deductionpageview() {	
		return deductionpageview;
	}

	public WebElement adddeductionview() {
			return adddeductionview;
	}

	public WebElement editdeductionpage() {
		return editdeductionpage;
	}

	public List<WebElement> workernameselect() {		
		return workernameselect;
	}
}
