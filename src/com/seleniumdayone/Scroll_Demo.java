package com.seleniumdayone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement amazonLogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		js.executeScript("arguments[0].scrollIntoView();", amazonLogo);

		js.executeScript("window.scrollTo(0,0)");   //fully top

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-2000)");
		WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));

		WebElement amazonSearchButton = driver.findElement(By.id("nav-search-submit-button"))	;

		js.executeScript("arguments[0].setAttribute('value','under 10000')", amazonSearchBox);
		js.executeScript("arguments[0].click()", amazonSearchButton);

	}
}
//element based
//fully down
//fully top
//coordination   x---->   y  ---->bottom  value in positive   Top----->value in negative