package com.seleniumdayone;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement instaBox=driver.findElement(By.xpath("(//input)[position()=1]"));  //function based with use of Position		
		instaBox.sendKeys("97861677809");
		WebElement instaPass = driver.findElement(By.xpath("(//input)[position()=2]"));
		instaPass.sendKeys("23324345");
		
		WebElement loginbtn=driver.findElement(By.xpath("(//div[starts-with(.,'Log')])[2]"));   //starts-with use of index
		loginbtn.click();
		
	Thread.sleep(3000);
	//	TakesScreenshot ts = (TakesScreenshot)driver;
		File inBrowser = instaBox.getScreenshotAs(OutputType.FILE);
		File inMyLocation = new File("./ScreenShots/img1.png");
		FileHandler.copy(inBrowser, inMyLocation);
		
		
		//TypeCasting
		//takeScrrenshot and which Type
		//create Location
		//fromTo
		
	}

}
