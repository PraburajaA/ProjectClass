package com.framework.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day4Main extends Day4Base{
	
	public static void main(String[] args) {
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		insertType(txtUserName, "Welcome");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		insertType(txtPass, "5677");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
		
		closeBrowser();
		
		
	}

}
