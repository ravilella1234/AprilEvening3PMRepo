package com.project.Salesforce.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.project.Salesforce.utilities.ExcelAPI;

public class BaseTest 
{
	public  String projectPath=System.getProperty("user.dir");
	public FileInputStream fis = null;
	public  Properties parentProp = null;
	public  Properties childProp = null;
	public  Properties orProp =null;
	public ExcelAPI xls;
	
	
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
		
		fis = new FileInputStream(projectPath+ "//src//test//resources//or.properties");
		orProp = new Properties();
		orProp.load(fis);
		
		//How do i come to know which suite to initiate?
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		String suiteName = pack[pack.length-1];
		System.out.println(suiteName);
		
		//init the testName
		String testName = this.getClass().getSimpleName();
		System.out.println(testName);
		
		
		//init the xls file
		xls = new ExcelAPI(childProp.getProperty(suiteName+"_xls")); 
		
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
