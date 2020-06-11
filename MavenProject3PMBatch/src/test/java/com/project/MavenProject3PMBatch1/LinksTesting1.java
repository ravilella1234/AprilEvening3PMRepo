package com.project.MavenProject3PMBatch1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.MavenProject3PMBatch.BaseTest;

public class LinksTesting1 extends BaseTest
{
	@BeforeMethod
	public void setup() throws Exception
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("googleurl");
	}
	
	@Test
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
