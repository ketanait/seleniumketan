package javaframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellUtility {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	String path=null;
	ExcellUtility(String path)
	{
		this.path=path;
	}
	public int getRowCount(String sheetname) throws IOException
	 {
		 fi=new FileInputStream(path);
		 wb=new XSSFWorkbook(fi);
		 ws=wb.getSheet(sheetname);
		 int rowcount=ws.getLastRowNum();
		 wb.close();
		 fi.close();
		 return rowcount;
	 }
	public  int getCellCount(String sheetName, int rownum) throws IOException
	 {
		 fi=new FileInputStream(path);
		 wb=new XSSFWorkbook(fi);
		 ws=wb.getSheet(sheetName);
		 int cellcount=row.getLastCellNum();
		 wb.close();
		 fi.close();
		 return cellcount;
	 }
	public  String getCellData(String sheetName, int rownum,int colnum ) throws IOException
	{
		fi=new FileInputStream(path);
		 wb=new XSSFWorkbook(fi);
		 ws=wb.getSheet(sheetName);
		 row=ws.getRow(rownum);
		 cell=row.createCell(colnum);
		 DataFormatter formatter=new DataFormatter();
		 String data;
		 try {
			
			  data=formatter.formatCellValue(cell);
			
		 }
		 catch(Exception e)
		 {
			 data="";
		 }
		 wb.close();
		 fi.close();
		 return data;
	}
	
	
	
	

}
