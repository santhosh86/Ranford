package com.bank.keyword;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.bank.masters.LIB;

public class Keyword {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
 
		
		LIB LB= new LIB();
		String Res =null;
		
	String kpath="E:\\swastika\\Banking\\src\\com\\bank\\keyword\\keyword_data.xlsx";
	String kout ="E:\\swastika\\Banking\\src\\com\\bank\\keyword\\keyword_Result.xlsx";
	
	FileInputStream Fi= new FileInputStream(kpath);
	
	XSSFWorkbook Wb= new XSSFWorkbook(Fi);
	
	XSSFSheet  Ws = Wb.getSheet("Testcase");
	XSSFSheet  Ws1= Wb.getSheet("Teststeps");
	XSSFSheet  Ws2= Wb.getSheet("Testdata");
	
	int tcRc= Ws.getLastRowNum();
	System.out.println(tcRc);
	
	int tsRc= Ws1.getLastRowNum();
	System.out.println(tsRc);
	
	
	for (int i=1; i<=tcRc;  i++);
	
	{
		String exe= Ws.getRow(i).getcell(2).getstringcellvalue();
		System.out.println(exe);
		
		if(exe.equalsIgnoreCase("Y"))
		{
			String tcid= Ws.getRow(i).getcell(0).getstringcellvalue();
			System.out.println(tcid);
			Sleeper.sleepTightInSeconds(2);
		}
		
		
		for (int j=1; j<=tsRc; j++);
		
		{
			String Tstcid= Ws.getRow(j).getcell(0).getstringcellvalue();
			System.out.println(Tstcid);
			Sleeper.sleepTightInSeconds(3);
			
		}
	}
	
	}

}
