package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

public class TestExecutionTime {
	
	public static String testExecutionTime() {
		//Test Execution Time
		Reporter.log("Test Execution Time");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String timeStamp = dateFormat.format(cal.getTime());
		
		return timeStamp;
	}
	
	
	public static String testDuration(long startTime) {
		
		// Total Time Taken for completing one scenario
		long endTime = System.currentTimeMillis();	
		long totalExecutionTime = endTime - startTime;
		String totalTime = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(totalExecutionTime),
				TimeUnit.MILLISECONDS.toMinutes(totalExecutionTime) % TimeUnit.HOURS.toMinutes(1),
				TimeUnit.MILLISECONDS.toSeconds(totalExecutionTime) % TimeUnit.MINUTES.toSeconds(1));
		
		return totalTime;
		
	}

}
