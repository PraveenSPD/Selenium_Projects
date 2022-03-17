package com.seleniumdayone;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
//		Select dropdownOne = new Select(fruitsDropDown);
//		boolean checking = dropdownOne.isMultiple();
//		if(checking==false) {
//			dropdownOne.selectByValue("3");
//			WebElement selectedValue = dropdownOne.getFirstSelectedOption();
//			System.out.println(selectedValue.getText());
//		}
//	
//		
//		List<WebElement> dropdownOneAllOptions = dropdownOne.getOptions();
//		int sizeOFdropDownOne = dropdownOneAllOptions.size();
//		if(sizeOFdropDownOne==6) {
//			for(WebElement oneByOne :dropdownOneAllOptions) {
//				System.out.println(oneByOne.getText());
//			}
//		}
		
		
		WebElement superHeroes = driver.findElement(By.id("superheros"));
		
		Select multiDropDown = new Select(superHeroes);
		boolean checking1 = multiDropDown.isMultiple();
		if(checking1==true) {
			int sizeofmultidropDown = multiDropDown.getOptions().size();       //i=0   i<size  2==2 2==3 2==5
			for(int i=0;i<sizeofmultidropDown;i++) {     
				if(i==2 || i==3 || i==5) {
					multiDropDown.selectByIndex(i);
				}
			}
			
		}
		
		
		List<WebElement> allSelectedOptions = multiDropDown.getAllSelectedOptions();
		for(WebElement one :allSelectedOptions) {
			System.out.println(one.getText());
		}
		try {
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//single dropdown     //multi - dropdown
		
		

		
		
	}
}
