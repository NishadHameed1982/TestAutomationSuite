package constants;

import org.openqa.selenium.By;

public class AppiumEmaarOneRequestDetailsScreenRepo {
	

//	
public static final String successMessageXpath = "//android.widget.TextView[@text='Request submitted successfully!']";
public static By SuccessMessage = By.xpath(AppiumEmaarOneRequestDetailsScreenRepo.successMessageXpath);

public static final String requestNoXpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView";
public static By RequestNo = By.xpath(AppiumEmaarOneRequestDetailsScreenRepo.requestNoXpath);

public static final String submittedDateXpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView";
public static By SubmittedDate = By.xpath(AppiumEmaarOneRequestDetailsScreenRepo.submittedDateXpath);

public static final String locationCodeXpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView";
public static By LocationCode = By.xpath(AppiumEmaarOneRequestDetailsScreenRepo.locationCodeXpath);


public static final String homeButtonXpath = "//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Home']";
public static By HomeButton = By.xpath(AppiumEmaarOneRequestDetailsScreenRepo.homeButtonXpath);


//	
//	
//	public static final String closeButton = "Close";
	

}
