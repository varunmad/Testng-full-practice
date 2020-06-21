package com.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelExecution {
static WebDriver driver;
@Parameters({"browser"})
@Test
public void tc1(String s1) {
	if(s1.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "");
	driver=new ChromeDriver();
	}
	else if(s1.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "");
		//driver=new InternetExplorer();
		
	}
	else {
		System.setProperty("webdriver.ff.driver", "");
		//driver=new FF();
	}
//driver.get(url);
}


}
