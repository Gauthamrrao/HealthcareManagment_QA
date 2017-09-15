package com.framework.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage2 {
	public WebDriver driver;

	public Basepage2(WebDriver driver)

	{

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void verifiyTitle(String etitle) {
		WebDriverWait wait = new WebDriverWait(driver, 7);
		try {
			wait.until(ExpectedConditions.titleContains(etitle));
			Reporter.log("pass Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Fail Title not matching", true);
			Assert.fail();
		}

	}
}
