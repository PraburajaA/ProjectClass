package com.framework.intro;

import java.io.IOException;

public class Day6Main extends Day4Base<Object> {
	
	public static void main(String[] args) throws IOException {
		
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		insertType(new Day6POM().getTxtUserName(), getData(0,0));
		insertType(new Day6POM().getTxtPassword(), getData(0,2));
	    click(new Day6POM().getBtnLogin());	
	}
}
