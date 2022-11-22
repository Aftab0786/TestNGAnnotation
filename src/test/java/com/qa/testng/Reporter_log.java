package com.qa.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_log {
	public static WebDriver driver;
	@Test (priority = -1)
	public void OpenBrowser() {
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        
			driver.get("https://www.demoqa.com");
	        
	        Reporter.log("The website used was DemoQA for this test", true);
	            driver.close();

}
	}
