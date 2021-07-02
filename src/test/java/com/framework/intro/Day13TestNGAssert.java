package com.framework.intro;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day13TestNGAssert extends Day4Base<Object> {

	@BeforeClass
	private void beforeClass() {
	getDriver();
	launchUrl("https://www.facebook.com/");
	String currentUrl = getCurrentUrl();
	Assert.assertTrue(currentUrl.contains("facebook"), "Facebook is not matched");
	}
	
	@AfterClass
	private void afterClass() {
		driver.close();
	}

	@Test
	private void test1() throws IOException{
		SoftAssert s = new SoftAssert();
		insertType(new Day6POM().getTxtUserName(),getData(0,0));
		String attribute = getAttribute(new Day6POM().getTxtUserName(),"value");
		s.assertEquals(attribute, "selenium","UserName is not equal");
		insertType(new Day6POM().getTxtPassword(),getData(0,2));
		String attribute2 = getAttribute(new Day6POM().getTxtPassword(), "value");
		s.assertEquals(attribute2, "9600811665","Password is not matched");
		s.assertAll();
	}
	
	@Test
	private void test2() throws InterruptedException {
		 SoftAssert s = new SoftAssert();
		 click(new Day6POM().getBtnLogin());
		 waitTime(3000);
		 String currentUrl = getCurrentUrl();
		 s.assertTrue(currentUrl.contains("login"),"User is not navigated to login failure page");
	}
	
	}
