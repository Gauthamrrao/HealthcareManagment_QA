package com.framework.test;

import org.testng.annotations.Test;

import com.framework.generic.BaseTest;
import com.framework.page.dragandroppage;

public class draganddroptest extends BaseTest {
	
	@Test
	public void drag() throws InterruptedException {
		dragandroppage d1 = new dragandroppage(driver);
		d1.moveblk1toblk3();

	}

}
