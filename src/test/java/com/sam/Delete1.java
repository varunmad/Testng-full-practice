package com.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Delete1 {
WebDriver driver;
long startTime;
long endTime;
@BeforeSuite
public void launchBrowser() {
	 startTime=System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\eclipse-workspace\\SamplProject1\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
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

@AfterSuite
public void quit() {
	driver.close();
	 endTime = System.currentTimeMillis();
		long total=endTime-startTime;
	System.out.println("total time: "+total);
	
}
}

