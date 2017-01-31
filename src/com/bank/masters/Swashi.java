package com.bank.masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Swashi {


	
	
	public static void main(String[] args) throws IOException {
		
		 LIB LB =new LIB();
	        LB.openApp();
	        LB.login();
		
		
		FileInputStream Fis= new FileInputStream("E:\\swastika\\Banking\\src\\com\\bank\\testdata\\Roleswashi.xlsx");
		
		XSSFWorkbook WB= new XSSFWorkbook(Fis);
		XSSFSheet WS =WB.getSheet("Roledata");
		
		int Rc=WS.getLastRowNum();
		
		System.out.println(Rc);
		for (int i= 1; i<=Rc; i++)
		{
		XSSFRow WR= WS.getRow(i);
		XSSFCell WC= WR.getCell(0);
		XSSFCell WC1= WR.getCell(1);
		XSSFCell WC2= WR.createCell(2);
		
		String Rname= WC.getStringCellValue();
		String Rtype= WC1.getStringCellValue();
		
		String Res= LB.role(Rname,Rtype);
		System.out.println(Res);
		
		WC2.setCellValue(Res);
		
}
		FileOutputStream Fos=new FileOutputStream("E:\\swastika\\Banking\\src\\com\\bank\\results\\swashires.xlsx");
	   WB.write(Fos);
	   WB.close();
}
}