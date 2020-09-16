package pages;

import constants.AppiumEmaarOneNewSRScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tests.BaseTest;

public class AppiumEmaarOneNewSRScreen extends BaseTest {

	public static  AndroidDriver<AndroidElement> addCustomerComments( AndroidDriver<AndroidElement> driver , String customerComment) throws Throwable 
	{
		boolean isAllowPopupPresent = waitForPresence(driver,AppiumEmaarOneNewSRScreenRepo.AllowPopupButton , 10);
		
		System.out.println("isAllowPopupPresent is " + isAllowPopupPresent);
		if (isAllowPopupPresent == true)
		{
			driver = waitUntilAndClick(driver,  AppiumEmaarOneNewSRScreenRepo.AllowPopupButton, 30);
		}

		//driver = AppiumActions.waitUntilAndClick(driver,  AppiumEmaarOneNewSRScreenRepo.RecordButton, 30);

		boolean isTextBoxPresent = waitForPresence(driver,AppiumEmaarOneNewSRScreenRepo.AddComments , 30);
		
		System.out.println("isTextBoxPresent is " + isTextBoxPresent);
		
		if (isTextBoxPresent == true)
		{
			driver = waitUntilAndClick(driver,  AppiumEmaarOneNewSRScreenRepo.AddComments, 30);
			System.out.println("Successfully clicked isTextBoxPresent");
		}

		boolean isTextFieldPresent = waitForPresence(driver,AppiumEmaarOneNewSRScreenRepo.AddCommentsTextField , 30);
		System.out.println("isTextFieldPresent is " + isTextFieldPresent);
		
		if (isTextFieldPresent == true)
		{
			driver = waitUntilAndType(driver, AppiumEmaarOneNewSRScreenRepo.AddCommentsTextField, customerComment, 30);
		}

		boolean isDonePresent = waitForPresence(driver,AppiumEmaarOneNewSRScreenRepo.DoneButton , 30);
		System.out.println("isDonePresent is " + isDonePresent);
		if (isDonePresent == true)
		{
			driver = waitUntilAndClick(driver, AppiumEmaarOneNewSRScreenRepo.DoneButton, 30);
		}

		return driver;
	}


	public static  AndroidDriver<AndroidElement> submitRequest( AndroidDriver<AndroidElement> driver ) throws Throwable 
	{
		boolean isSubmitButtonPresent = waitForPresence(driver,AppiumEmaarOneNewSRScreenRepo.SubmitButton , 30);

		if (isSubmitButtonPresent == true)
		{
			driver = waitUntilAndClick(driver, AppiumEmaarOneNewSRScreenRepo.SubmitButton, 30);
		}


		return driver;
	}

}