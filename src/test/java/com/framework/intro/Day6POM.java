package com.framework.intro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day6POM extends Day4Base<Object>{
	
	public Day6POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtUserName;
	
	@FindBy(id = "pass")
	private WebElement txtPassword;
	
	@FindBy(name = "login")
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
