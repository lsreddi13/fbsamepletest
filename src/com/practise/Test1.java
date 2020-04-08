package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {

//		WebDriver driver;

		String url = "http://facebook.com";
		String chromePath = ".//BrowserDrivers//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromePath);
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();

	
		
		driver.get(url);

//		 driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Locator : id
		//interview question - FindElement method returns what?
		
		
		
//		driver.findElement(By.linkText("Skype To Phone")).getAttribute("id");
//		
//		driver.findElement(By.linkText("Skype To Phone")).getAttribute("href");
		
		
		
		
		WebElement user_email = driver.findElement(By.id("email"));
		user_email.sendKeys("sasi@yahoo.com");
		
		//Locator : name
		WebElement user_pwd = driver.findElement(By.name("pass"));
		user_pwd.sendKeys("hyd12345");
		
		driver.findElement(By.name("pass"));
		
		
		
		
		
		
		driver.close();

	}

}
