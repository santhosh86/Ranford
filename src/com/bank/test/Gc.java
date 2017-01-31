package com.bank.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gc {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void Setup(){
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public static void search(){
		
		driver.findElement(By.id("lst-ib")).sendKeys("seleniumhq");
		driver.findElement(By.id("_fZl")).click();
	}
	
	@Test(priority=1)
	public static void clicklinks(){
		
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	}
	
	@AfterClass
	public static void close(){
		driver.close();
	}
}
