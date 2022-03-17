package com.seleniumdayone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
//demo website   click the simple alert button focus to alert  accept
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simpleAlert.click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement prompAlertBtn= driver.findElement(By.xpath("//a[.='Alert with Textbox ']"));
		prompAlertBtn.click();
		
		
		WebElement promptAlertBox=driver.findElement(By.xpath("//button[contains(.,'demonstrate the prompt box ')]"));
		promptAlertBox.click();
		
		
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Praveen");
		promptAlert.accept();
		
		
		WebElement messageElement=driver.findElement(By.id("demo1"));
		String getMessage=messageElement.getText();
		System.out.println(getMessage);
		
		
		
		
		
		
	
	}
}
