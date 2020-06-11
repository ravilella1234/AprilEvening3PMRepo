package com.project.MavenProject3PMBatch1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.MavenProject3PMBatch.BaseTest;

public class TC_002 extends BaseTest
{
  
  
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  System.out.println("Before Methods");
	    init();
		
		launchBrowser(bType); 
		
		navigateUrl("amazonurl");
  }
  
  
  @Test
  public void amazon() 
  {
	  System.out.println("test method");
	    selectOption("amazondropbox_id","Books");
	
		typeText("amazonsearchtext_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("after Method");
	  	driver.quit();
	  	
  }

}
