package com.bank.masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.opc.PackageProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LIB {
	
	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties PR;
	public static FileInputStream Fis;
	
	
	public String openApp() throws IOException{
	
	 PR= new Properties();
     Fis= new FileInputStream("E:\\swastika\\Banking\\src\\com\\bank\\property\\Rep.properties");
     PR.load(Fis);
     
	{
		String Expval="Ranford Bank";
		driver=new FirefoxDriver();
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		String Actval=driver.findElement(By.xpath(PR.getProperty("Rbank"))).getText();
		System.out.println(Actval);
		if (Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("Application Launched");	
		return "pass";
		}
		else
		{
			System.out.println("Application doesn't launched");
		return "Fail";
		}}
	}

	public void login()
	{
		driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(PR.getProperty("Pwd"))).sendKeys("Admin");
		driver.findElement(By.id(PR.getProperty("Lgn"))).click();
	}
	
	public String role(String RN,String RTyp)
	{
		Expval="Sucessfully";
		Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(PR.getProperty("Rle"))).click();
	driver.findElement(By.id(PR.getProperty("Nwrle"))).click();
	driver.findElement(By.id(PR.getProperty("Rname"))).sendKeys(RN);
	driver.findElement(By.id(PR.getProperty("Rtype"))).click();
	
	
	Sleeper.sleepTightInSeconds(4);
	
	driver.findElement(By.id(PR.getProperty("Rtype"))).sendKeys(RTyp);
	driver.findElement(By.id(PR.getProperty("Sbmit"))).click();
	Sleeper.sleepTightInSeconds(2);
	
	Actval=driver.switchTo().alert().getText();
    Sleeper.sleepTightInSeconds(4);
	driver.switchTo().alert().accept();
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	
	if (Actval.contains(Expval)) 
	{
	System.out.println("Role created Successfully");
	return Actval;
	}
	else
	{
		System.out.println("Role Already exist");
		return Actval;
	}
	}
	
	public void branch()
	{
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
	driver.findElement(By.id("txtbName")).sendKeys("swastik123");
	driver.findElement(By.id("txtAdd1")).sendKeys("abcd1234");
	driver.findElement(By.id("txtZip")).sendKeys("77007");
	driver.findElement(By.id("lst_counrtyU")).click();
	
	Sleeper.sleepTightInSeconds(4);
	driver.findElement(By.id("lst_counrtyU")).sendKeys("INDIA");
	driver.findElement(By.id("lst_stateI")).click();
	driver.findElement(By.id("lst_stateI")).sendKeys("GOA");
	driver.findElement(By.id("lst_cityI")).click();
	driver.findElement(By.id("lst_cityI")).sendKeys("GOA");
	driver.findElement(By.id("btn_insert")).click();
	
	Sleeper.sleepTightInSeconds(2);
	driver.switchTo().alert().accept();
	
		
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	}
	
	public void Employee()
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='BtnNew']")).click();
		
		driver.findElement(By.id("txtUname")).sendKeys("sushmita");
		driver.findElement(By.id("txtLpwd")).sendKeys("abcd");
		
		driver.findElement(By.id("lst_Roles")).click();
		driver.findElement(By.id("lst_Roles")).sendKeys("test");
		driver.findElement(By.id("lst_Branch")).click();
		driver.findElement(By.id("lst_Branch")).sendKeys("123456");
		driver.findElement(By.id("BtnSubmit")).click();
		
		Sleeper.sleepTightInSeconds(2);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
		
	
	
	}
	public void logout()
	{
	driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	public void Aclose()
	{
	
	driver.close();
	}

}
	





