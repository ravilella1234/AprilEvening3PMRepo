package com.project.MavenProject3PMBatch1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.MavenProject3PMBatch.BaseTest;

public class RadioButton1 extends BaseTest
{

	@BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		init();
		launchBrowser("chromebrowser");
		navigateUrl("radiourl");
	  }
	
	
	@Test
	public void radioButton1() throws Exception
	{
		Thread.sleep(3000);
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }
	
}
