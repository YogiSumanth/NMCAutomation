package com.nmc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{

	Properties properties;
	
	//creating an constructor for reading configuration file data
	public ConfigReader()
	{
		//path where the file is stored from which we will be reading variables 
		File fileSrc = new File("./configuration/config.properties");
		
		try
		{
			FileInputStream fileRead = new FileInputStream(fileSrc);//reading the file
			properties = new Properties();//creating properties object for reading variables(i.e Datas)
			properties.load(fileRead);//complete file will be loaded at run time
		}
		catch(Exception e)
		{
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	
	//Now to read values form properties file we will be creating method for each variables
	
	public String getChromePath(){
		return properties.getProperty("chromePath");// case sensitive		
	}
	
	public String getUserId(){
		return properties.getProperty("userId");
	}
	
	public String getFirefoxPath(){
		return properties.getProperty("firefoxPath");
	}
	
	public String getIEPath(){
		return properties.getProperty("iePath");
	}
	
	public String getPhantomjsPath()
	{
		return properties.getProperty("phantomjsPath");
	}
	
	public String getApplicationURL(){
		return	properties.getProperty("baseURL");
	}
	
	public String getUserName(){
		return properties.getProperty("userName");
	}
	
	public String getPassword(){
		return properties.getProperty("password");
	}
	
	public String getHomePageUrl(){
		return properties.getProperty("homePageUrl");
	}
	
//	public String getExcelLocatorPath(){
//		return properties.getProperty("excelLocatorPath");
//	}
//	public String getExcelLocatorSheetName(){
//		return properties.getProperty("excelLocatorSheetName");
//	}
	
	public String getExcelRegistrationDataPath(){
		return properties.getProperty("excelRegistrationDataPath");
	}
	public String getExcelRegistrationDataSheetName(){
		return properties.getProperty("excelRegistrationDataSheetName");
	}
	
	public String getExcelRegInfoDataPath(){
		return properties.getProperty("excelRegInfoDataPath");
	}
	public String getExcelRegInfoDataSheetName(){
		return properties.getProperty("excelRegInfoDataSheetName");
	}
}
