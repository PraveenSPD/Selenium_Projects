package com.seleniumdayone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> allDatas = table.findElements(By.tagName("td"));
		for(WebElement data :allDatas) {
			String text = data.getText();
			System.out.println(text);
			

		}
		System.err.println("column Values");
		List<WebElement> partRow = table.findElements(By.xpath("//table[@id='customers']//following-sibling::tr//td[3]"));
		for(WebElement rowValue:partRow) {
			System.out.println(rowValue.getText());
		}
		

		driver.quit();
	}
}

//Full Values 
//particular row values
//particular column values
//particular value




