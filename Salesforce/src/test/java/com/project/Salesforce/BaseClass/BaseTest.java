package com.project.Salesforce.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	public  String projectPath=System.getProperty("user.dir");
	public FileInputStream fis = null;
	public  Properties parentProp = null;
	public  Properties childProp = null;
	
	
	public void load() throws Exception 
	{
		fis = new FileInputStream(projectPath+"//src//test//resources//environment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String keyValue = parentProp.getProperty("env");
		System.out.println(keyValue);
		
		fis = new FileInputStream(projectPath+ "//src//test//resources//"+ keyValue + ".properties");
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("zohourl");
		System.out.println(url);
		
	}
	
	
	@BeforeTest
	 public void init() throws Exception 
	 {
		System.out.println("BeforeTest...");
		  load();
	 }
	
	

	@AfterTest
	 public void afterTest() 
	 {
		 System.out.println("AfterTest..."); 
	 }

}
