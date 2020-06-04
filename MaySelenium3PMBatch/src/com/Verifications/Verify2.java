package com.Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.launchers.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Verify2 extends BaseTest
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
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		
		String text = loc.getAttribute("value");
		
		System.out.println("text is :" + text);
		

	}

}
