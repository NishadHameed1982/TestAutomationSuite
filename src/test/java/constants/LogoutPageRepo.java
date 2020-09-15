package constants;

import org.openqa.selenium.By;

public class LogoutPageRepo {
	
	public static final String menuButtonXpath = "//*[@id=\"userNav-arrow\"]";
	public static By MenuButton = By.xpath(LogoutPageRepo.menuButtonXpath);
	
	public static final String logoutButtonXpath = "//*[@title=\"Logout\"]";
	public static By LogoutButton = By.xpath(LogoutPageRepo.logoutButtonXpath);

}
