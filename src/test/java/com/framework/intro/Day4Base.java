package com.framework.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day4Base<Webelement> {
	static WebDriver driver;
	
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praburaja\\eclipse-workspace\\OnlineFrameWorksMay\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);             
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void closeBrowser() {
        driver.close();
	}
	
	public static void quitBrowser() {
        driver.quit();
	}
	
	public static void switchToFrameUsingIdOrName(String value) {
		driver.switchTo().frame(value);
	}
	
	public static void switchToParentWindow() {
	    driver.switchTo().defaultContent();
	}
	
	public static String getData(int row, int cell) throws IOException {
        File f = new File("C:\\Users\\praburaja\\eclipse-workspace\\OnlineFrameWorksMay\\Input\\Testdata.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		int cellType = c.getCellType();
		String value = null;
		if (cellType==1) {
			value = c.getStringCellValue();
			System.out.println(value);
		}else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
				value = sim.format(dateCellValue);
				
			}else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;	
				value = String.valueOf(l);
			}
		}
		return value;	
	}	
	public void DdSelectByValue(WebElement element, String value) {	
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void waitTime(long millis) throws InterruptedException{
		Thread.sleep(millis);
	}
	
	public static String getAttribute(WebElement ele, String s) {
		return ele.getAttribute(s);
		
	}
}
