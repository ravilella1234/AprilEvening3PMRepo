package com.Verifications;

import org.openqa.selenium.By;

import com.launchers.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Verify1 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test=report.startTest("Verify1");
		test.log(LogStatus.INFO, "Initialising Properties Files ........");
		
		launchBrowser("chromebrowser"); 
		test.log(LogStatus.PASS, "Opened the Browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : - " + childProp.getProperty("amazonurl"));
		
		//String actualLink = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Customer Service')]")).getText();
		String actualLink = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Customer Service')]")).getAttribute("innerHTML");
		String expectedLink = "Customer Ser";
		
		System.out.println("Actual link :" + actualLink);
		System.out.println("Expected link :" + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal....");
		else
			System.out.println("Both links are not equal....");
		
		//report.endTest(test);
		//report.flush();
		

	}

}
