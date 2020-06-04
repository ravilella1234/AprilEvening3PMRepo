package com.Verifications;

import com.launchers.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test=report.startTest("Verify3");
		test.log(LogStatus.INFO, "Initialising Properties Files ........");
		
		launchBrowser("chromebrowser"); 
		test.log(LogStatus.PASS, "Opened the Browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : - " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "Customer Service";
		
		if(!isLinkEquals(expectedLink))
			reportFailure("Both Links are not equal..");
		else
			reportSuccess("Both Links are equal...");
		
		report.endTest(test);
		report.flush();

	}

	

	

}
