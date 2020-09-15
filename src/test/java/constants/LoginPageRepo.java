package constants;

import org.openqa.selenium.By;

public class LoginPageRepo {
	
	public static final String userNameXpath = "//*[@id=\"username\"]";
	public static By UserName = By.xpath(LoginPageRepo.userNameXpath);
	
	public static final String passwordXpath = "//*[@id=\"password\"]";
	public static By Password = By.xpath(LoginPageRepo.passwordXpath);
	
	public static final String loginXpath = "//*[@id=\"Login\"]";
	public static By Login = By.xpath(LoginPageRepo.loginXpath);
	
	public static final String homePageTitle = "Salesforce - Unlimited Edition";

}
