package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumEmaarOnePropertySelectionScreen extends BasePage {

	public static  AndroidDriver<AndroidElement> clickProperty( AndroidDriver<AndroidElement> driver , String propertyName) throws Throwable 
	{
		// Select Property Xpath - Variable
		String selectPropertyXpath = "//android.widget.TextView[@text='" +propertyName+"']";
		By SelectPropertyList = By.xpath(selectPropertyXpath);

		boolean isPropertyLinkPresent = waitForPresence(driver,SelectPropertyList , 30);
		
		if (isPropertyLinkPresent == true)
		{
			System.out.println("isPropertyLinkPresent is true");
			driver = waitUntilAndClick(driver,  SelectPropertyList, 30);
		}
		else {
			System.out.println("isPropertyLinkPresent is false");
			System.out.println("Some issue in property selection screen");
		}
		return driver;
	}
}