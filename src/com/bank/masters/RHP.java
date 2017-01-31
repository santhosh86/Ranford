package com.bank.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RHP 
{
	//finding the elements 
	//maintaing thee elements properties
	
@FindBy (id="txtuId")
WebElement Uname;

@FindBy (id="txtPword")
WebElement pwd;

@FindBy (xpath=".//*[@id='login']")
WebElement Lgn;

//element methods
public void login()
{
	Uname.sendKeys("Admin");
	pwd.sendKeys("Admin");
	Lgn.click();
}
}
