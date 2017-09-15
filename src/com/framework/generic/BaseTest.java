package com.framework.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements IautoConst {
	public static WebDriver driver;

	@BeforeSuite
	public void InitApp() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
//beforeannotation
	
	@BeforeMethod
	public void openApp() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

	}
//after method
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
