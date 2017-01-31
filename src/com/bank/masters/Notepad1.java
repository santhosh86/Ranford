package com.bank.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad1 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		LIB LB=new LIB();
		LB.openApp();
		LB.login();
		
		String Fpath="E:\\swastika\\Banking\\src\\com\\bank\\testdata\\Role1.txt";
		
	    String Rpath= "E:\\swastika\\Banking\\src\\com\\bank\\results\\Resrole1.txt";
	    String SD;
	    
	    FileReader FR= new FileReader(Fpath);
	    BufferedReader BR= new BufferedReader(FR);
	    
	    //source reader
	   String Sread= BR.readLine();
	   System.out.println(Sread);
	   
	   
	   FileWriter FW= new FileWriter(Rpath);
	   BufferedWriter BW= new BufferedWriter(FW);
	   
	   BW.write(Sread);
	   BW.newLine();
	   
	   while ((SD=BR.readLine())!=null)
	   {
		   System.out.println(SD);
		   String SR[]= SD.split("##");
		   String Rname= SR[0];
		   String Rtype= SR[1];
		   
		   String Res= LB.role(Rname, Rtype);
		   System.out.println(Res);
		   
		   BW.write(Rname+"@@@"+Rtype+"***"+Res);
		   BW.newLine();
		   
		 
	   }
	   BW.close();
	   BR.close();
	}

}
