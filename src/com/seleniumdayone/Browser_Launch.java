package com.seleniumdayone;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Browser_Launch extends Selenium_BaseClass {
	
	public void automateBrowser() {
		browserLaunch("chrome");
		enterUrl("http://www.leafground.com/pages/frame.html");
		frameByIndex(0);
		elementFinding("id", "Click").click();
		getOutFromFrame("direct");
		List<WebElement> sizeOfFrame = elementsFinding("tagName","iframe");
		int size = sizeOfFrame.size();
		System.out.println(size);
	
	}
	public static void main(String[] args) {
		Browser_Launch bl = new Browser_Launch();
		bl.automateBrowser();
		
	}

}
