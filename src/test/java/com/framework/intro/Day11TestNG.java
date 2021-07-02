package com.framework.intro;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11TestNG extends Day4Base{
	
	@BeforeClass
		private void beforeClass() {
		getDriver();
		launchUrl("https://www.facebook.com/");
	}
	
	@AfterClass
	private void afterClass() {
		driver.close();
	}
	
	@Parameters({"username","password"})
	@Test
	private void test1(@Optional("Hello")String s1,String s2) throws IOException{
		System.out.println(s1);
		System.out.println(s2);
		insertType(new Day6POM().getTxtUserName(),s1);
		insertType(new Day6POM().getTxtPassword(),s2);
	}
	
	@Test
	private void test2() {
		 click(new Day6POM().getBtnLogin());	
	}
	
}

