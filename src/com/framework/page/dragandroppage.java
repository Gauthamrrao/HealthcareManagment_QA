package com.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.framework.generic.Basepage2;

public class dragandroppage extends Basepage2 {
	Actions act;
	@FindBy(xpath = "(//h1[@class='draghandle'])[1]")
	private WebElement Block1;
	@FindBy(xpath = "//h1[.='Block 3']")
	private WebElement Block3;

	public dragandroppage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void moveblk1toblk3() throws InterruptedException {
		act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(Block1, Block3).perform();
		Thread.sleep(5000);
		act.dragAndDropBy(Block1, 800, 300).perform();
	}

}
