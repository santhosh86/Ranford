package com.bank.masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExeRhp 
{
	@Test
public void exelogin()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.200/ranford2/home.aspx");
	
	//pagefactory is for passing the driver to RHP class
	
	RHP Rp=PageFactory.initElements(driver,RHP.class);
	Rp.login();
	
	AHP Ap=PageFactory.initElements(driver,AHP.class);
	Ap.branch();
	
	RBP Rb=PageFactory.initElements(driver, RBP.class);
	Rb.NWbranch();
}
}
