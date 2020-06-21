package com.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\new\\eclipse-workspace\\AaTestNgPrac\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	

	@Test(dataProvider="Login")
	public void tc1(String s1,String s2) {
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.id("pass")).sendKeys(s2);
	driver.findElement(By.id("u_o_4")).click();
	}
	
	@DataProvider(name="Login")
	public Object[][]data(){
		return new Object[][] {
			
			{"Apple","Mango"},
			{"carrot","beans"},
			{"table","chair"},
			{"pen","pencil"}
		};
	}
	
	
	
}
