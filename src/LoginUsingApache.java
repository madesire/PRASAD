import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;

public class LoginUsingApache {
	
	public static String printdata(int row , int col)throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(".//Resources//countries.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println(value);
		return value;
	
	}
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Actions action =new Actions(driver);
	driver.manage().window().maximize();
	
	String valueS = printdata(10, 0);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(valueS);

}
}
