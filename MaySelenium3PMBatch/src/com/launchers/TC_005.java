package com.launchers;

import org.apache.log4j.Logger;

public class TC_005 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_005.class);

	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("Initialising Properties Files ........");
		
		launchBrowser("chromebrowser");
		log.info("Opened the Browser : - " + p.getProperty("chromebrowser")); 
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : - " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id") );
		
		typeText("amazonsearchtext_id","Harry Potter");
		log.info("Entered the test Harry Potter by using locaotr : - " + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Search Buttton by usinf locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}


}
