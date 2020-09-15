package pages;

import org.openqa.selenium.By;

import constants.AppiumEmaarOneLogoutScreen;
import constants.AppiumEmaarOneRaiseSRScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AppiumEmaarOneRaiseSRScreen extends BasePage {

	public static  AndroidDriver<AndroidElement> clickRaiseSR( AndroidDriver<AndroidElement> driver) throws Throwable 
	{
		
		

		boolean isRaiseSRPresent = waitForPresence(driver,AppiumEmaarOneRaiseSRScreenRepo.RaiseSR , 30);
		if (isRaiseSRPresent == true)
		{
			driver = waitUntilAndClick(driver,  AppiumEmaarOneRaiseSRScreenRepo.RaiseSR, 30);
		}
		else {
			System.out.println("Some issue locating \' New Service Request \' Button");

		}
		
		return driver;
	}
}