package constants;

import org.openqa.selenium.By;

public class LeadPageRepo {
	
	public static By NewButton = By.xpath(LeadPageRepo.newButtonXpath);
	public static final String newButtonXpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input";
	
	public static By LeadRecordDropdown = By.xpath(LeadPageRepo.leadRecordTypeDropdownXpath);
	public static final String leadRecordTypeDropdownXpath = "//*[@id=\"p3\"]";
	
	public static By ContinueButton = By.xpath(LeadPageRepo.continueButtonXpath);
	public static final String continueButtonXpath = "//*[@id=\"bottomButtonRow\"]/input[1]";
	

	
	public static final String leadEditPageTitle = "Lead Edit: New Lead ~ Salesforce - Unlimited Edition";

}
