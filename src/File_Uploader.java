import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class File_Uploader {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\Rushi\\Desktop\\GetPreSanctionLetter.pdf");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//	    File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
//	    String destination = "C:\\Users\\Rushi\\Desktop\\software testing\\selenium test";
	   // FileHandler.copy(srcfile, new File("./Screenshot/"+filename+""));
	   // String filename  = srcfile+("+filename+" +"+.png") ;	
	    //FileUtils.copyFile(srcfile, new File("./Screenshot/"+("filename"+".png")));
	    //FileHandler.copy(srcfile,destination);
	    //org.openqa.selenium.io.FileHandler.copy(srcfile, new File("./Screenshot/"+("filename"+".png")));
	    org.openqa.selenium.io.FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE),new File("./Screenshot/"+("filename"+".png")));
	    //FileHandler.copy(srcfile, destination);

	}

}
