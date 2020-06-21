package com.sam;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplePrac {
	static WebDriver driver;
@BeforeClass
private void url() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	

@AfterClass
private void closeBrowser() {
driver.quit();
}
@BeforeMethod
private void startTime() {
Date d=new Date();
System.out.println(d);
}
@AfterMethod
private void endTime() {
	Date d=new Date();
	System.out.println(d);
}
@Test
private void tc1(String s1,String  s2) {
WebElement userName= driver.findElement(By.id("email"));
userName.sendKeys(s1);
WebElement userPass = driver.findElement(By.id("pass"));
userPass.sendKeys(s2);
WebElement logbutton = driver.findElement(By.id("u_0_b"));
logbutton.click();
}

@Test
private void tc2(String s1,String s2) {

	WebElement name= driver.findElement(By.id("email"));
	name.sendKeys(s1);
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys(s2);
	WebElement button = driver.findElement(By.id("u_0_b"));
	button.click();
	}
}
