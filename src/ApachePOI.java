import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.examples.hssf.eventusermodel.XLS2CSVmra;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ApachePOI {
public static void main(String[] args) throws IOException {
	//getting the location of the file
	String filepath= "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\countries.xlsx";
   
	//Referring the file to a variable so that we can open the file in reading mode
	FileInputStream excelfile = new FileInputStream(filepath);

	//now to get workbook from the excel file we have to use xssfworkbook class
	XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
	
	//now to get the perticular sheet from the workbook we have to use method & have to provide the sheet name/it's index
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	//Now to print all the data from the sheet 
	int rowscount =sheet.getLastRowNum();//to know no of rows in the sheet
	int columncount=sheet.getRow(1).getLastCellNum();//to know the no of columns
	
	//now to print all data we have to use nested for loop
	DataFormatter df = new DataFormatter();//To convert the excel data into string type
	for (int row=0; row<=rowscount; row++) {
		for (int column = 0;  column<columncount; column++) {
			String formattedvalue = df.formatCellValue(sheet.getRow(row).getCell(column));//data conversion
			System.out.print("  ");
			System.out.print(formattedvalue);
		
		}
		System.out.println();
	} 
	
	
	
	
//	for (int i = 0; i <= rowscount; i++) {
//		
//		XSSFRow row=  sheet.getRow(i);
//		
//		for (int j = 0; j <columncount; j++) {
//		 XSSFCell cell=row.getCell(j);
//	 
//	 switch (cell.getCellType()) {
//	case STRING: System.out.print(cell.getStringCellValue());break;
//	case NUMERIC:System.out.print(cell.getNumericCellValue());break;
//	case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
//	 }	
//	 System.out.print(" | ");
//	 }
//		System.out.println();
//	}
//	
//	
//	//By using iterator method
//	Iterator sheet
}
}
