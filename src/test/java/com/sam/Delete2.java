package com.sam;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Delete2 {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
			 
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\new\\\\\\\\eclipse-workspace\\\\\\\\SamplProject1\\\\\\\\driver\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void startTime() {
		Date d=new Date();
		System.out.println("strttime"+d);
	}
	@Test
	public void tc1() {
		driver.get("https://www.google.com/");
		System.out.println("google");
	}
	@Test
	public void tc2() {
		driver.get("https://www.youtube.com/");
		System.out.println("youtube");
	}
	@Test
	public void tc3() {
		driver.get("https://www.facebook.com/");

	System.out.println("facebook");}
	
	@AfterMethod
	public void endTime() {
		Date d=new Date();
System.out.println("endtym"+d);
	}
		
	@AfterSuite
	public void quit() {
		driver.close();
		
		
	}
}
