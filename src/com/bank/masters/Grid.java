package com.bank.masters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{
DesiredCapabilities cap=null;
@Parameters("browser")
@Test
public void Gexe(String br) throws MalformedURLException
{
	if(br.equalsIgnoreCase("firefox"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		}
	else if(br.equalsIgnoreCase("chrome")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.148:4444/wd/hub"),cap);
	driver.get("http://192.168.1.200/ranford2/home.aspx");
	
	RHP Rp=PageFactory.initElements(driver,RHP.class);
	Rp.login();

	
}
}
