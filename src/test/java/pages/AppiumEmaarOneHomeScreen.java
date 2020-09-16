package pages;

import constants.AppiumEmaarOneHomeScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tests.BaseTest;

public class AppiumEmaarOneHomeScreen extends BaseTest {
	
	public static  AndroidDriver<AndroidElement> selectRaiseServiceReq( AndroidDriver<AndroidElement> driver) throws Throwable 
	{
		boolean isRaiseSRButtonPresent = waitForPresence(driver, AppiumEmaarOneHomeScreenRepo.RaiseSRButton , 30);
		
		if (isRaiseSRButtonPresent == true)
		{
			driver = waitUntilAndClick(driver, AppiumEmaarOneHomeScreenRepo.RaiseSRButton, 10);
		}
		
		else {
			driver = dragDownAndClick(driver, AppiumEmaarOneHomeScreenRepo.RaiseSRText, 30);
		}
		
		return driver;
	
	}


}