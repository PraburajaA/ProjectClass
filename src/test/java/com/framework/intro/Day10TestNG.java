package com.framework.intro;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Day10TestNG {

	public static WebDriver driver;

	@BeforeClass
		private void beforeClass() {
			System.out.println("BeforeClass--->Driver Initialization");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\praburaja\\eclipse-workspace\\OnlineFrameWorksMay\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	private void afterClass() {
        System.out.println("AfterClass--->Close Driver");
		driver.close();
	}
	
	@BeforeGroups
	private void beforeGroup() {
		System.out.println("Before Group");
	}
	
	@AfterGroups
	private void afterGroup() {
		System.out.println("After Group");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before--->Test Execution Start Time");
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After--->Test Execution End Time");
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	private void test1() {
		System.out.println("Test1--->Buisness Logic");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Hello");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234567");
	}
	
	@Test
	private void test2() {
		System.out.println("Test2--->Buisness Logic");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click(); 
	}
	
}
