package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayslipPage {
	WebDriver driver;

	public PayslipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='2781']")
	WebElement payslip_id;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]/span[1]")
	WebElement pdf1;

	public WebElement payslip_id() {
		return payslip_id;
	}

	public WebElement pdf1() {
		return pdf1;
	}

}
