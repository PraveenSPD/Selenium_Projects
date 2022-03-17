package com.seleniumdayone;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook_Demo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fbUserBox=driver.findElement(By.name("email"));
		fbUserBox.sendKeys("praveen@gmail.com");
		
		WebElement fbPassBox=driver.findElement(By.name("pass"));
		fbPassBox.sendKeys("9786167789");
		
		WebElement fbLogBtn=driver.findElement(By.name("login"));
		
		File inBrowser=fbUserBox.getScreenshotAs(OutputType.FILE);
		File inMyLocation = new File("./ScreenShots/fbUserBox.png");
		FileHandler.copy(inBrowser, inMyLocation);
		
		driver.quit();
		Dimension size = fbUserBox.getSize();

		
		
		
		
	}

}
