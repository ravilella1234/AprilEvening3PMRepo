package com.launchers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launchBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		//WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		//loc.sendKeys("sony");
		
		//Thread.sleep(4000);
		
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		//loc.clear();
		
		//Thread.sleep(4000);
		
		//driver.findElement(By.name("field-keywords")).sendKeys("philips");
		
		//Thread.sleep(4000);
		
		//driver.findElement(By.className("nav-input")).clear();
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		//Thread.sleep(4000);
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("samsung");
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		//driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				String values = links.get(i).getText();
				System.out.println(values);
			}
			
		}
		

	}

}
