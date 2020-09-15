package constants;

import org.openqa.selenium.By;

public class AppiumEmaarOneLogoutScreen {
	
	public static final String homeButtonXpath = "//android.widget.TextView[@text='Home']";
	public static By HomeButton = By.xpath(AppiumEmaarOneLogoutScreen.homeButtonXpath);
	
	public static final String profileButtonXpath = "//android.widget.TextView[@text='Profile']";
	public static By ProfileButton = By.xpath(AppiumEmaarOneLogoutScreen.profileButtonXpath);
	
	public static final String logoutButtonXpath = "//android.widget.TextView[@text='Log Out']";
	public static By LogoutButton = By.xpath(AppiumEmaarOneLogoutScreen.logoutButtonXpath);
	
//	public static final String logoutConfPopupXpath = "//android.widget.ScrollView[@index='2']/android.widget.LinearLayout[@index='2']/android.widget.Button[@text='YES']";
//	public static By LogoutConfPopup = By.xpath(AppiumEmaarOneLogoutScreen.logoutConfPopupXpath);
	
	public static final String LogoutText = "Log Out";
	
	 public static By SwitchToPopupFrame = By.id("android:id/content");
	
    public static By LogoutConfPopup = By.id("android:id/button1");
    
	public static final String popupClassName = "android.widget.FrameLayout";
	public static By PopupClassName = By.className(AppiumEmaarOneLogoutScreen.popupClassName);
	
	
	public static final String yesButtonXpath = "android:id/button1";
	public static By YesButton = By.xpath(AppiumEmaarOneLogoutScreen.yesButtonXpath);
}
