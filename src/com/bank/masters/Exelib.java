package com.bank.masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {

	
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       LIB LB =new LIB();
        LB.openApp();
        LB.login();
       /* LB.role();*/
       LB.branch();
         LB.Employee();
        LB.logout();
        LB.Aclose();
   
        
        FileInputStream Fis=new FileInputStream("E:\\swastika\\Banking\\src\\com\\bank\\testdata\\Role.xlsx");
        // Create workbook
        
        XSSFWorkbook WB=new XSSFWorkbook(Fis);
        
        //sheet
        
        XSSFSheet WS=WB.getSheet("RoleData");
        
        //Rowcout
        
        int Rc=WS.getLastRowNum();
        System.out.println(Rc);
        
        //Loop  --------------- For loop
        
        for (int i = 1; i<=Rc; i++)
        {
        	 //Row
            
            XSSFRow WR=WS.getRow(i);
            //cell
            XSSFCell WC=WR.getCell(0);
            XSSFCell WC1=WR.getCell(1);
            //create cell for results
            XSSFCell WC2=WR.createCell(2);
            
            //getting role name value from excel
           String Rname=WC.getStringCellValue();
           //getting roletypr value from excel
           String Rtype=WC1.getStringCellValue();
           //calling lib
           String Res= LB.role(Rname,Rtype);
           System.out.println(Res);
           //passing the value to results colums 
           WC2.setCellValue(Res);
           
          }
        
              FileOutputStream Fos=new FileOutputStream("E:\\swastika\\Banking\\src\\com\\bank\\results\\Roleres.xlsx");
              WB.write(Fos);
              WB.close();
        //Row
        
       /* XSSFRow WR=WS.getRow(2);
        //cell
        XSSFCell WC=WR.getCell(0);
        String Val=WC.getStringCellValue();
        System.out.println(Val);
       */ 
        
        
        
	}

}
