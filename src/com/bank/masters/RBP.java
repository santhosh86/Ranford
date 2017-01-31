package com.bank.masters;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RBP
{
	
	@FindBy (id="BtnNewBR")
	WebElement Nwbr;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	@FindBy (id="txtbName")
	WebElement Brname;
	
	@FindBy (id="txtAdd1")
	WebElement Add;
	
	@FindBy (id="txtZip")
	WebElement Zip;
	
	@FindBy (id="lst_counrtyU")
	WebElement Conty;
	
	@FindBy (id="lst_stateI")
	WebElement state;
	
	@FindBy (id="lst_cityI")
	WebElement City;
	
	@FindBy (id="btn_insert")
	WebElement Sbmt;

	
	public void NWbranch()
	{
		Nwbr.click();
		Brname.sendKeys("swashi");
		Add.sendKeys("abcdef");
		Zip.sendKeys("77007");
		Conty.click();
		Conty.sendKeys("INDIA");
		
		state.click();
		state.sendKeys("Delhi");
	
		City.click();
		City.sendKeys("Delhi");
		
		Sbmt.click();
		
		
	}
	
	}
