package com.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngExcel {
	WebDriver driver;
//@BeforeMethod
//public void launchBrowser() {
//	System.setProperty("webdriver.chrome.driver", "");
//	driver=new ChromeDriver();
//	driver.get("https://facebook.com/");
//	driver.manage().window().maximize();
//}
//@Test
//public void tc1() {
//	driver.findElement(By.id("email")).sendKeys();
//	driver.findElement(By.id("pass")).sendKeys();
//	driver.findElement(By.id("u_o_4")).click();
//}
//@DataProvider(name="Login")
//public Object[][] data(){
//	Object=xceldata();
//	return Object;
//	}

public void xceldata() throws Exception {

		File loc = new File("C:\\Users\\new\\Desktop");
		FileInputStream read=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(read);
		Sheet sheet = w.getSheet("");
for(int i=0;i<=sheet.getPhysicalNumberOfRows();i++) {
	Row r=sheet.getRow(i);
	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
Cell c=r.getCell(j);
System.out.println(c);

}




}
}
}

