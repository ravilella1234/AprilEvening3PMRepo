package com.launchers;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		test=report.startTest("TC_006");
		test.log(LogStatus.INFO, "Initialising Properties Files ........");
		
		launchBrowser("chromebrowser"); 
		test.log(LogStatus.PASS, "Opened the Browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : - " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(LogStatus.PASS, "Entered the test Harry Potter by using locaotr : - " + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Buttton by usinf locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		report.endTest(test);
		report.flush();
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}


}
