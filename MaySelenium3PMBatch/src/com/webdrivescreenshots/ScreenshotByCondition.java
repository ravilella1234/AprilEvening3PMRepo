package com.webdrivescreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotByCondition 
{

	public static void main(String[] args) throws Exception 
	{
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.linkText("rajinikanth"));
		System.out.println(links.size());
		
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\google.png"));
		}

	}

}
