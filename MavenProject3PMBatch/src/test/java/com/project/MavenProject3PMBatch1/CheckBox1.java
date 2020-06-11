package com.project.MavenProject3PMBatch1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.MavenProject3PMBatch.BaseTest;

public class CheckBox1 extends BaseTest
{
  
	  @BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		  init();
		  launchBrowser("chromebrowser");
		  navigateUrl("checkboxurl");
	  }
	  
	  
	@Test
	public void checkboxTest() throws Exception
	{
		Thread.sleep(3000);
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	 driver.quit();
  }

}
