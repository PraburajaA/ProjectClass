package com.framework.intro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day12DataProvider extends Day4Base {
	
	@DataProvider(name = "login")
	public Object[][] dpMethod() {
		 return new Object[][] {{"Greens","12445"},{"Hello","56778"},{"Greenstech","58739"}};
	}
	
	
	@Test(dataProvider = "login",dataProviderClass = Day12Sample.class)
	private void test1(String s1, String s2) {
		getDriver();
		launchUrl("https://www.facebook.com/");
		insertType(new Day6POM().getTxtUserName(),s1);
		insertType(new Day6POM().getTxtPassword(),s2);
		click(new Day6POM().getBtnLogin());
		closeBrowser();
	}

}
