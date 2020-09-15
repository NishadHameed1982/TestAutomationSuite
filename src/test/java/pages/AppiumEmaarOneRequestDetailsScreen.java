package pages;

import constants.AppiumEmaarOneRequestDetailsScreenRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumEmaarOneRequestDetailsScreen extends BasePage{

	public static  String getRequestNo( AndroidDriver<AndroidElement> driver ) throws Throwable 
	{
		String requestNo = null;
		boolean isRequestNoPresent = waitForPresence(driver,AppiumEmaarOneRequestDetailsScreenRepo.RequestNo , 30);
		if (isRequestNoPresent == true)
		{
			requestNo = driver.findElement(AppiumEmaarOneRequestDetailsScreenRepo.RequestNo).getText().toString();	
		}
		else {
			System.out.println("Some issue in retriving Request No");
		}
		return requestNo;
	}

	public static  String getSubmittedDate( AndroidDriver<AndroidElement> driver ) throws Throwable 
	{
		String submittedDate = null;
		boolean isSubmittedDatePresent = waitForPresence(driver,AppiumEmaarOneRequestDetailsScreenRepo.SubmittedDate , 30);
		if (isSubmittedDatePresent == true)
		{
			submittedDate = driver.findElement(AppiumEmaarOneRequestDetailsScreenRepo.SubmittedDate).getText().toString();
		}
		else {
			System.out.println("Some issue in retriving Submitted Date");
		}
		return submittedDate;
	}

	public static  String getLocationCode( AndroidDriver<AndroidElement> driver ) throws Throwable 
	{
		String locationCode = null;
		boolean isLocationCodePresent = waitForPresence(driver,AppiumEmaarOneRequestDetailsScreenRepo.LocationCode , 30);
		if (isLocationCodePresent == true)
		{
			locationCode = driver.findElement(AppiumEmaarOneRequestDetailsScreenRepo.LocationCode).getText().toString();
		}
		else {
			System.out.println("Some issue in retriving Location Code");
		}
		return locationCode;
	}
	
	public static  AndroidDriver<AndroidElement> clickHomeButton( AndroidDriver<AndroidElement> driver) throws Throwable 
	{

		boolean isHomeButtonPresent = waitForPresence(driver,AppiumEmaarOneRequestDetailsScreenRepo.HomeButton , 30);
		if (isHomeButtonPresent == true)
		{
			driver = waitUntilAndClick(driver,  AppiumEmaarOneRequestDetailsScreenRepo.HomeButton, 30);
		}
		else {
			System.out.println("Home button is not visible");
		}
		return driver;
	}
}