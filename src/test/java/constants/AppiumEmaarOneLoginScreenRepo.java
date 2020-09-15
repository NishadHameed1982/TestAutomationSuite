package constants;

import org.openqa.selenium.By;

public class AppiumEmaarOneLoginScreenRepo {
	
	public static final String primaryEmailXpath = "//android.widget.TextView[@text='Primary email address']";
	public static By UserNameTextView = By.xpath(AppiumEmaarOneLoginScreenRepo.primaryEmailXpath);
	
	public static final String userNameXpath = "//android.view.ViewGroup[@index='3']/android.widget.EditText[@index='0']";
	public static By UserName = By.xpath(AppiumEmaarOneLoginScreenRepo.userNameXpath);
	
	public static final String passwordXpathTextView = "//android.widget.TextView[@text='Password']";
	public static By PasswordTextView = By.xpath(AppiumEmaarOneLoginScreenRepo.passwordXpathTextView);
	
	public static final String passwordXpath = "//android.view.ViewGroup[@index='4']/android.widget.EditText[@index='0']";
	public static By Password = By.xpath(AppiumEmaarOneLoginScreenRepo.passwordXpath);
	
	public static final String signinXpath = "//android.widget.TextView[@text='Sign In']";
	public static By SignIN = By.xpath(AppiumEmaarOneLoginScreenRepo.signinXpath);
	

}