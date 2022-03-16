package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.BaseClass;

public class Listener extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result) {

		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}
		try {
			getScreenshot(testMethodName, driver);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
