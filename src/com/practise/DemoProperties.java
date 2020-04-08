package com.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoProperties {

	WebDriver driver;
	
	@Test
	public void test() throws IOException {
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(".//testdemo.properties");
		prop.load(fis);
		
		
//		String driver_path = ".\\BrowserDrivers\\chromedriver.exe";
//	
//		System.setProperty("webdriver.chrome.driver", driver_path);
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("--disable-notifications");
//		driver = new ChromeDriver(options);
//		driver.get(prop.getProperty("url")); // use paramter
		
//		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		
//		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password1"));
//		driver.findElement(By.id("")).click();
		
		
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));		
		System.out.println(prop.getProperty("password"));
		
		
			}
}
