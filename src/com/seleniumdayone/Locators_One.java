package com.seleniumdayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_One {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
		//URL Load
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//fbUserBox
		WebElement	fbUserBox=driver.findElement(By.id("email"));
		fbUserBox.sendKeys("amma39922@gamil.com");
		
		//fbPasswordBox
		WebElement passwordField=driver.findElement(By.id("pass"));
		passwordField.sendKeys("1233456");
		
		//fbLoginButton
		WebElement fbLoginButton=driver.findElement(By.name("login"));
		fbLoginButton.click();
		
		
		driver.quit();
		
		
	
		
	
	
		//go to fb login page  enter username  enter password   click the login button
		// id name class name ,linktext,partial linktext,tagname,css selector ,xpath





	}

}
