package com.framework.intro;

import org.testng.annotations.DataProvider;

public class Day12Sample {
	@DataProvider(name = "login")
	public Object[][] dpMethod() {
		 return new Object[][] {{"Greens","12445"},{"Hello","56778"},{"Greenstech","58739"}};
	}
}
