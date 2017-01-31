package com.bank.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Expval =	"Ranford Bank";
WebDriver driver =new FirefoxDriver();
driver.get("http://192.168.1.200/ranford2/home.aspx");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);

String Actval =driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
System.out.println(Actval);

if (Expval.equalsIgnoreCase(Actval))
{
	System.out.println("Application Launched");
}
else 
{
	System.out.println("Application not Launched");
}

driver.findElement(By.id("txtuId")).sendKeys("Admin");
driver.findElement(By.id("txtPword")).sendKeys("Admin");
driver.findElement(By.id("login")).click();

driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
driver.findElement(By.id("txtRname")).sendKeys("testermq17");
driver.findElement(By.id("lstRtypeN")).click();
Sleeper.sleepTightInSeconds(4);


driver.findElement(By.id("lstRtypeN")).sendKeys("E");
driver.findElement(By.id("btninsert")).click();
Sleeper.sleepTightInSeconds(4);

driver.switchTo().alert().accept();




	}

}
