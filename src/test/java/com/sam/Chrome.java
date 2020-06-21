package com.sam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome {
	ChromeDriver driver;
	@Test
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\new\\eclipse-workspace\\AaTestNgPrac\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("biryani",Keys.ENTER);
	driver.close();
	}
}
