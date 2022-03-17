package com.seleniumdayone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(singleFrame);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();   
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		List<WebElement> totalNoOfFrames = driver.findElements(By.tagName("iframe"));
		int sizeOfIframeTag = totalNoOfFrames.size();
		System.out.println(sizeOfIframeTag);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
