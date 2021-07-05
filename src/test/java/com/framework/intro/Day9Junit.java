package com.framework.intro;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Junit {
public static WebDriver driver;

		@BeforeClass
		public static void beforeClass() {
			System.out.println("BeforeClass--->Driver Initialization");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\praburaja\\eclipse-workspace\\OnlineFrameWorksMay\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Assert.assertTrue("Current url is not matched", driver.getCurrentUrl().contains("Facebook"));

		}
		
		@AfterClass
		public static void afterClass() {
			System.out.println("AfterClass--->Close Driver");
			driver.close();

		}
		
		@Test
		public void test1() {
			System.out.println("Test1--->Buisness Logic");
			WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys("Welcome96");
			Assert.assertEquals("Username value is not matched", "Welcome96", txtUserName.getAttribute("value"));
			WebElement txtPass = driver.findElement(By.id("pass"));
			txtPass.sendKeys("1234567");
			Assert.assertEquals("Password value is not matched", "1234567", txtPass.getAttribute("value"));
			

		}
		@Test
		public void test2() throws InterruptedException {
			System.out.println("Test2--->Buisness Logic");
			WebElement btnLogin = driver.findElement(By.name("login"));
			btnLogin.click(); 
			Thread.sleep(3000);
			Assert.assertTrue("User is not navaigated to login failure page", driver.getCurrentUrl().contains("login"));

		}
		@Before
		public void before() {
			System.out.println("Before--->Test Execution Start Time");
			Date d = new Date();
			System.out.println(d);

		}
		@After
		public void after() {
			System.out.println("After--->Test Execution End Time");
			Date d = new Date();
			System.out.println(d);

		}
		
		@Test
		public void test3() {
			System.out.println("Test1--->Buisness Logic");
			WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys("Welcome96");
			Assert.assertEquals("Username value is not matched", "Welcome96", txtUserName.getAttribute("value"));
			WebElement txtPass = driver.findElement(By.id("pass"));
			txtPass.sendKeys("1234567");
			Assert.assertEquals("Password value is not matched", "1234567", txtPass.getAttribute("value"));
			

		}
		
	}
