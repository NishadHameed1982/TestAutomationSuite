package constants;

import org.openqa.selenium.By;

public class ConvertedLeadPageRepo {

	public static final String contactTextXpath = "//*[@id=\"ep\"]/div[2]/div[2]/table/tbody/tr[3]/td/a";
	public static final By ContactText = By.xpath(ConvertedLeadPageRepo.contactTextXpath);

	public static final String accountTextXpath = "//*[@id=\"ep\"]/div[2]/div[2]/table/tbody/tr[4]/td/a";
	public static final By AccountText = By.xpath(ConvertedLeadPageRepo.accountTextXpath);


	public static final String opportunityTextXpath = "//*[@id=\"ep\"]/div[2]/div[2]/table/tbody/tr[5]/td/a";
	public static final By OpportunityText = By.xpath(ConvertedLeadPageRepo.accountTextXpath);

}
