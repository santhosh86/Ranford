package com.bank.masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Role extends BaseNG
{
	@Test(dataProvider="Rdata")
 public void Exerole(String Rn,String Rtyp)
 {
	 LB.role(Rn,Rtyp);
 }
	
	@DataProvider
	
	public Object[][] Rdata()
	{
		Object[][] obj=new Object[3][2];
		//First row first cell data
		
		obj[0][0]="managerhdfc18";
		//first row second cell data
		obj[0][1]="E";
		
		obj[1][0]="managerhdfc19";
		obj[1][1]="E";
		
		obj[2][0]="managerhdfc20";
		obj[2][1]="E";
		
		return obj;
		
	}
}
