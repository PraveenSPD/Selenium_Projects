package com.seleniumdayone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://play.letcode.in/aui");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//WebElement dressesTab = driver.findElement(By.xpath("(//a[.='Dresses'])[2]"));
	WebElement sourceElement = driver.findElement(By.xpath("//p[starts-with(.,'Drag me to')] "));
	WebElement targetElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	
	act.dragAndDrop(sourceElement, targetElement).perform();
	
	//driver.quit();
	
	WebElement source = driver.findElement(By.xpath("(//div[contains(.,'can only be drag and drop')])[5]"));
	Point location = source.getLocation();
	int xValue = location.getX();
	int yValue=location.getY();
	System.out.println("Xvalue is "+xValue);
	System.out.println("YValue is "+yValue);
	
	act.dragAndDropBy(source, xValue+10, yValue+10).perform();
	}
}
//click and hold by source element
//move to target element
//release by target





//	act.moveToElement(dressesTab).build().perform();
//	WebElement eveningDresses = driver.findElement(By.xpath("(//a[.='Evening Dresses'])[2]"));
//	eveningDresses.click();
//	
//	WebElement tShirtsTab = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
//	act.contextClick(tShirtsTab).perform();
//	try {
//	Thread.sleep(3000);
//	}
//	catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
//	