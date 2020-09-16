package pages;

import constants.AppiumEmaarOneLogoutScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tests.BaseTest;

public class AppiumEmaarOneLogout extends BaseTest {

	public static  void logout( AndroidDriver<AndroidElement> driver , String appName) throws Throwable 
	{
		boolean isHomeButtonPresent = waitForPresence(driver, AppiumEmaarOneLogoutScreen.HomeButton, 30);
		System.out.println("isHomeButtonPresent is "+ isHomeButtonPresent);

		if (isHomeButtonPresent == true)
		{

			driver = waitUntilAndClick(driver,  AppiumEmaarOneLogoutScreen.HomeButton, 30);
		}
		else {
			System.out.println("Some issue in identifying Home Button");
		}

		boolean isProfileButtonPresent = waitForPresence(driver, AppiumEmaarOneLogoutScreen.ProfileButton, 30);

		System.out.println("isProfileButtonPresent is "+ isProfileButtonPresent);
		if (isProfileButtonPresent == true)
		{
			driver = waitUntilAndClick(driver,  AppiumEmaarOneLogoutScreen.ProfileButton, 30);
		}
		else {
			System.out.println("Some issue in identifying Profile Button");
		}
		//Scroll down the control till the Log Out button is visible
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Log Out"+"\").instance(0))").click();

		driver = dragDownAndClick(driver, AppiumEmaarOneLogoutScreen.LogoutText, 30);
		
//		boolean isLogoutButtonPresent = waitForPresence(driver, AppiumEmaarOneLogoutScreen.LogoutButton, 30);
//		System.out.println("isLogoutButtonPresent is "+ isLogoutButtonPresent);
//		if (isLogoutButtonPresent == true)
//		{
//			driver = waitUntilAndClick(driver,  AppiumEmaarOneLogoutScreen.LogoutButton, 30);
//		}
//		else {
//			System.out.println("Some issue in identifying Logout Button");
//		}
		
		boolean isPopupPresent = driver.findElement(AppiumEmaarOneLogoutScreen.PopupClassName).isDisplayed();
		
		System.out.println("isPopupPresent is "+ isPopupPresent);

		if (isPopupPresent == true)	
		{
			driver = waitUntilAndClick(driver, AppiumEmaarOneLogoutScreen.YesButton, 30);
		}
		else {
			System.out.println("Some issue in identifying the popup message");
		}

		//		boolean isConfirmationButtonPresent = AppiumActions.waitForPresence(driver, AppiumEmaarOneLogoutScreen.LogoutConfPopup, 30);
		//		System.out.print("I AM IN THE POPUP"+ isConfirmationButtonPresent);
		//		if (isConfirmationButtonPresent == true)
		//		{
		//			driver = AppiumActions.waitUntilAndClick(driver, AppiumEmaarOneLogoutScreen.LogoutConfPopup, 30);
		//		}
		//		else {
		//			System.out.println("Some issue in identifying Confrimation Button");
		//		}

		//	driver.executeScript("au.backgroundApp(0)");
		//driver.resetApp();
		driver.closeApp();

		//driver.removeApp(appName);
	}
}