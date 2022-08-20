import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.formula.functions.Vlookup;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachepoi2 {
	//Create a method which will read the the dada and write it on the console
	public static String printdata(int row , int col, int row1, int col1)throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(".//Resources//countries.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		String value1 = sheet.getRow(row1).getCell(col1).getStringCellValue();
		System.out.println(value);
		return value1;
		
	}
	public static void main(String[] args) throws IOException {
	//to read data from the excel file
	XSSFWorkbook workbook = new XSSFWorkbook(".//Resources//countries.xlsx");

	System.out.println(printdata(10, 0, 10, 1));
	
//	XSSFSheet sheet=workbook.getSheet("Sheet1");
//	//now to get the data from row7 and from column1  
//	String value = sheet.getRow(6).getCell(0).getStringCellValue();
//	System.out.println(value);
//    printdata(10, 0);
//	
//	//to get the row and column count
//	int sheetcount = sheet.getLastRowNum();
//	System.out.println(sheetcount);
//	//to get the last column num
//	int columncount = sheet.getRow(1).getLastCellNum();
//	System.out.println(columncount);
//	//to edit the existinng data from the excel file//update
//	sheet.getRow(6).getCell(1).setCellValue("India");
//	System.out.println(sheet.getRow(6).getCell(1));
//	//To create the new row and column in excel file
//	sheet.createRow(13).createCell(1).setCellValue("Admin");
//	
//	System.out.println(sheet.getRow(13).getCell(1));
//	sheet.createRow(14).createCell(1).setCellValue("admin123");
//	System.out.println(sheet.getRow(14).getCell(1));
//	
//	}

	
}
}
