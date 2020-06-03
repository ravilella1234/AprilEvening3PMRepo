package com.webdrivescreenshots;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsBySysDateAndTime 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Date dt =new Date();
		System.out.println(dt);
		String dFormat = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(dFormat);
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\" + dFormat +".jpg"));

	}

}
