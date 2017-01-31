package com.bank.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AHP 
{

	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement BR;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	
	@FindBy (xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
	WebElement Logout;
	
	public void branch()
	{
		BR.click();
	}
	
	public void Rol()
	{
		Role.click();
	}
	public void Lout()
	{
		Logout.click();
	}
}
