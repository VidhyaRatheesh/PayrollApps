package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement login;

	@FindBy(xpath = "//p[normalize-space()='Incorrect username or password.']")
	WebElement alertmsg;

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}

	public WebElement alertmsg() {
		return alertmsg;
	}

}
