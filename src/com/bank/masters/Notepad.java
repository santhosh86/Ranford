package com.bank.masters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	
	public static void main(String[] args) throws IOException
	
	{
	  LIB LB=new LIB();
	  LB.openApp();
	  LB.login();
	  
	  //input file path
	  String Fpath="E:\\swastika\\Banking\\src\\com\\bank\\testdata\\Role.txt";
	  //Results path
	  String Rpath="E:\\swastika\\Banking\\src\\com\\bank\\results\\Resrole.txt";
	  String SD;
	  
	  //read
	  FileReader FR=new FileReader(Fpath);
	  BufferedReader BR=new BufferedReader(FR);
	 String Sread=BR.readLine();
	 System.out.println(Sread);
	  
	 //Write data
	 
	 FileWriter FW=new FileWriter(Rpath);
	 BufferedWriter BW=new BufferedWriter(FW);
	 BW.write(Sread);
	 BW.newLine();
	 
	 //loop  ------while loop
	 
	 while((SD=BR.readLine())!=null)
	 {
	   	 System.out.println(SD);
	   	 String SR []=SD.split("###");
	   	 String Rname=SR[0];
	   	 String Rtype=SR[1];
	   	 
	   	 String Res=LB.role(Rname,Rtype);
	   	 System.out.println(Res);
	   	 
	   	 //writing the results
	   	 BW.write(Rname+"&&&"+Rtype+"$$$$$"+Res);
	   	 BW.newLine();
		
	}
	 BW.close();
	 BR.close();
	 
	 
	 
	
	}

}
