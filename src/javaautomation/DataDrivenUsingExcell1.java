package javaautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingExcell1 {

	public static void main(String[] args) throws IOException
	{
	FileInputStream file= new FileInputStream("D://Desk backup//MaturityValue.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int r=sheet.getLastRowNum();
	int c=sheet.getRow(0).getLastCellNum();
	System.out.println("Number of Rows="+r +" numbrt of cell="+c);
	
	
	
	}

}
