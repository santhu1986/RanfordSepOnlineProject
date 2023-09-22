package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library LB=new Library();
		
		LB.OpenApp("http://103.211.39.246/ranford2");
		LB.Admlogin("Admin","TestingMindq");
		
		//To get Test Data File
		
		FileInputStream FIS=new FileInputStream("D:\\OnlinePrjAugust\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	    
		//Work Book
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheets
		
		XSSFSheet WS=WB.getSheet("RData");
		
		//RowCount
		
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		
		//Multiple Iterations --------- Loop
		
		for (int i=1;i<=RC;i++)
		{
            //Row
			
			XSSFRow WR=WS.getRow(i);
			
		   //Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rty=WC1.getStringCellValue();
			
			String Res=LB.Role(Rname,Rty);
			System.out.println(Res);
			
			WC2.setCellValue(Res);
			
			
		}
		
		FileOutputStream FOS=new FileOutputStream("D:\\OnlinePrjAugust\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
	    WB.write(FOS);
	    WB.close();
	
	
	}

}
