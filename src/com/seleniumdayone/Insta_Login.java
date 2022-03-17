package com.seleniumdayone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.navigate().to("https://www.instagram.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		WebElement InstaUserBox=driver.findElement(By.xpath("(//input)[position()=1]"));
		InstaUserBox.sendKeys("9786167789");
		Thread.sleep(5000);
		
		
		WebElement InstaPassBox=driver.findElement(By.xpath("//input[@aria-required='true' and @type='password']"));
		InstaPassBox.sendKeys("12345657");
		
		WebElement instaLoginbtn= driver.findElement(By.xpath("//div[text()='Log In']"));
		instaLoginbtn.click();
	}
	
	
	
	
	

}
//go to insta  maximize   inspect user pass login