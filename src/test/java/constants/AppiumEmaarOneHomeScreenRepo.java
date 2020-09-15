package constants;

import org.openqa.selenium.By;

public class AppiumEmaarOneHomeScreenRepo {
	
	public static final String homeScreenText = "Welcome";
	
	public static final String raiseSRButtonXpath = "//android.widget.TextView[@text='Raise Service Request']";
	public static By RaiseSRButton = By.xpath(AppiumEmaarOneHomeScreenRepo.raiseSRButtonXpath);
	
	public static final String checkUpdatesXpath = "//android.widget.TextView[@text='Check Updates']";
	public static By CheckUpdatesButton = By.xpath(AppiumEmaarOneHomeScreenRepo.checkUpdatesXpath);
	
	
	public static final String closeButton = "Close";
	public static final String RaiseSRText = "Raise Service Request";
	
	
	
	

}
