package pages;

import org.testng.Reporter;

import constants.AppiumEmaarOneHomeScreenRepo;
import constants.AppiumEmaarOneLoginScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tests.BaseTest;

public class AppiumEmaarOneLoginScreen extends BaseTest {

	public static  AndroidDriver<AndroidElement> loginEmaarOne( AndroidDriver<AndroidElement> driver, String userName, String password) throws Throwable 
	{

		driver = waitUntilAndClick(driver, AppiumEmaarOneLoginScreenRepo.UserNameTextView, 30);
		driver = waitUntilAndType(driver, AppiumEmaarOneLoginScreenRepo.UserName, userName, 30);
		
		driver = waitUntilAndClick(driver, AppiumEmaarOneLoginScreenRepo.PasswordTextView, 30);
		driver = waitUntilAndType(driver, AppiumEmaarOneLoginScreenRepo.Password, password, 30);
		driver.hideKeyboard();
		driver = waitUntilAndClick(driver, AppiumEmaarOneLoginScreenRepo.SignIN, 30);
		
		boolean isHomeScreenLoaded = waitForPresence(driver, AppiumEmaarOneHomeScreenRepo.CheckUpdatesButton, 30);
		
		if (isHomeScreenLoaded==false)
		{
			Reporter.log("Some issue in login. Please check the login credentials.");
			System.out.println("Some issue in login. Please check the login credentials.");

		}

		return driver;

	}


}
