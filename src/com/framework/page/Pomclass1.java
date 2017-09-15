package com.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass1 {
	// decleration
	@FindBy(xpath = "//input[@id='loginUserID']")
	private WebElement UnTb;
	@FindBy(xpath = "//input[@id='loginPassword']")
	private WebElement PwTb;
	@FindBy(xpath = "//a[@id='secLoginBtn']")
	private WebElement loginBtn;

	// intialization
	public Pomclass1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void enterUsername(String un) {
		UnTb.sendKeys(un);
	}

	public void enterPassword(String pw) {
		PwTb.sendKeys(pw);
	}

	public void loginBtn() {
		loginBtn.click();
	}

}
