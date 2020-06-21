package com.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Deletetestng {
	WebDriver driver;
@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\new\\\\eclipse-workspace\\\\SamplProject1\\\\driver\\\\chromedriver.exe");
 driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@Test(priority=0)
public void tc1() {
driver.findElement(By.id("email")).sendKeys("sathishsa77@gmail.com");
driver.findElement(By.id("pass")).sendKeys("amiengineers");
driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
@Test(priority=-3,enabled=false)
public void tc2() {
driver.findElement(By.id("email")).sendKeys("sathishsa77@gmail.com");
driver.findElement(By.id("pass")).sendKeys("amiengineer");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

}
@Test(priority=1)
public void tc3() {
driver.findElement(By.id("email")).sendKeys("sathishsa77@gmail.com");
driver.findElement(By.id("pass")).sendKeys("amiengineer");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

}
@Test(priority=4,dependsOnMethods="tc3")
public void tc4() {
driver.findElement(By.id("email")).sendKeys("sathishsa77@gmail.com");
driver.findElement(By.id("pass")).sendKeys("amiengineer");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

}
@AfterMethod
public void quit() {
driver.close();
}

}

