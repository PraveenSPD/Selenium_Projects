package com.seleniumdayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	static WebDriver driver;
	public static void getBrowser(String browserName) {

		if(browserName.equalsIgnoreCase("chrome"))	 {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
	}
	
	
	
	public static String url(String url) {
	return	driver.getCurrentUrl();
	}
	

	public static WebElement elementFinding(String options,String value) {
		 switch(options) {
		 case  "id" : {
			 return driver.findElement(By.id(value));
			
		 }
		 }
		
		
		
		
		
		
		
		return null;
		
		
	}
	


}
