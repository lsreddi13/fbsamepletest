package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		String url = "http://facebook.com";
		String chromePath = ".//BrowserDrivers//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromePath);

		// ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("email")).sendKeys("Ashok");

		driver.findElement(By.name("pass")).sendKeys("mypasword");
		;

		driver.findElement(By.linkText("Forgotten account?")).click();
		;
		Thread.sleep(5000);
		driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.partialLinkText("Cookie Poli")).click();
		;
		Thread.sleep(5000);
		driver.quit();
		driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(5000);
		driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.cssSelector("#privacy-link")).click();
		
		Thread.sleep(5000);
		driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.className("_8esa")).click();
		
		Thread.sleep(5000);
//		driver = new ChromeDriver();

//		driver.get(url);
//		driver.findElement(By.tagName("input")).sendKeys("This is tag option");
		
		Thread.sleep(5000);
		driver = new ChromeDriver();

		driver.get(url);
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLinks);
	}
}
