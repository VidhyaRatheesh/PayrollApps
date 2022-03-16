
package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	@SuppressWarnings("deprecation")
	public static WebDriver Driver() throws Exception {

		prop = new Properties();
		// file opening
		FileInputStream fil = new FileInputStream(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Carol\\src\\main\\java\\resources\\File");
		prop.load(fil);
		String B = prop.getProperty("browser");
		String u = prop.getProperty("url");

		if (B.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome successfully ");
			driver.get(u);

		}

		else if (B.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("firefox successfully");
			driver.get(u);

		} else 
		{
			System.out.println("No browser");

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}

	public WebDriver login() throws Exception {

		driver = Driver();
		LoginPage log = new LoginPage(driver);

		try {
			log.username().sendKeys(prop.getProperty("username"));
			log.password().sendKeys(prop.getProperty("password"));
			log.login().click();
			return driver;
		} catch (Exception e) {
			return driver;
		}

	}

	
	public String getScreenshot(String TestcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + TestcaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}

}
