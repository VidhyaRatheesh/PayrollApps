package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "dropdown-toggle")
	WebElement carol;

	@FindBy(className = "logout-btn")
	WebElement logout;
	
	@FindBy(xpath= "//h1[normalize-space()='Login']")
	WebElement logoutpage;


	public WebElement carol() {
		return carol;
	}

	public WebElement logout() {
		return logout;
	}

	public WebElement logoutpage() {
			return logoutpage;
	}

}