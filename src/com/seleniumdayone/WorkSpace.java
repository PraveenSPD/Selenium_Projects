package com.seleniumdayone;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WorkSpace extends Selenium_BaseClass  {

	public void amazon() throws Exception {
		browserLaunch("chrome");
		enterUrl("http://www.amazon.in");
		javaScriptExecutor("bottomScroll", null);
		javaScriptExecutor("topScroll", null);
		
		
		

	}
	public static void main(String[] args) throws Exception {
		WorkSpace amazon= new WorkSpace();
		amazon.amazon();
		
	}
}
