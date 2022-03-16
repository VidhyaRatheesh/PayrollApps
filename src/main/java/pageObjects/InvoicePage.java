package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	WebDriver driver;

	public InvoicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement client_no;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/span[1]")
	WebElement pdf;

	public WebElement client_no() {
		return client_no;
	}

	public WebElement pdf() {
		return pdf;
	}

}
