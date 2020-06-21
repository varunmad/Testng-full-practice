package com.sam;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	File loc = new File("C:\\Users\\new\\eclipse-workspace\\AaTestNgPrac\\excel\\testngexcel.xls");
	FileInputStream read=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(read);
	Sheet sheet = w.getSheet("Sheet1");
for(int i=0;i<=sheet.getPhysicalNumberOfRows();i++) {
Row r=sheet.getRow(i);
for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
Cell c=r.getCell(j);
System.out.println(c);
}
}
}
