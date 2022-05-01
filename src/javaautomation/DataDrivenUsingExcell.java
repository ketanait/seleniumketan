package javaautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingExcell {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("D://Desk backup//Name_List For_T.E.(2019 PAT.)(MECHANICAL)_Exam.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet  sheet =workbook.getSheet("Sheet1");
		int r=sheet.getLastRowNum();
	    int c= sheet.getRow(0).getLastCellNum();
	    for (int i=0;i<r;i++)
	    {
	    	XSSFRow currentrow = sheet.getRow(i);
	    	for(int j=0;j<c;j++)
	    	{
	    		String value=currentrow.getCell(j).toString();
	    		System.out.print("                     "+value);
	    	}
	    	System.out.println();
	    }
	    
	}

}
