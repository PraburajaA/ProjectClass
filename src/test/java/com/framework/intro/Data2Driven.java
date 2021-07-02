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

public class Data2Driven {
	
   public static void main(String[] args) throws IOException {
		//How to print particular row value
	    //1. To find the file location
		File f = new File("C:\\Users\\praburaja\\eclipse-workspace\\OnlineFrameWorksMay\\Input\\Testdata.xlsx");
		
		//Read the value
		FileInputStream fi = new FileInputStream(f);
		
		//Type of workbook
		Workbook w = new XSSFWorkbook(fi);
		
		//Get sheet name
		Sheet s = w.getSheet("Sheet1");
		//Get row value
		Row r = s.getRow(0);
		Cell c = r.getCell(2);
		int cellType = c.getCellType();
		//If cell type is 1-->String
	    //cell type is 0-->Date or number
		System.out.println("Cell type is "+cellType);
		System.out.println("Cell value is "+c);
		
		//getStringCellValue, getDateCellValue, getNumericCellValue
		if (cellType==1) {
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
		}else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				System.out.println(dateCellValue);
				SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
				String format = sim.format(dateCellValue);
				System.out.println(format);
				
			}else {
				double numericCellValue = c.getNumericCellValue();
				System.out.println(numericCellValue);
			//TypeCasting--->Converting one dataType into another dataType	
				long l = (long) numericCellValue;
			//To convert into string	
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
			
		} 

}

}

