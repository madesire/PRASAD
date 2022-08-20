import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.jar.Attributes.Name;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TAKESCREENSHOTSBY2WAYS {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	//There are two ways to take a screenshot by using FileHandler and by using fileutil
	TakesScreenshot tS = (TakesScreenshot)driver;//we have to type cast driver interface with takescreenshot interface to acess the methods of takescreenshot
	File file1 = tS.getScreenshotAs(OutputType.FILE);//here we are setting the tpe of file we want storing it into instance variable
	//FileUtils.copyFile(file1, new File("\"file path ehere you want to store the screenshot\" "+file1 Name+" "));//here we are storing the screen shot at given file path
	
	
	String path ="file path where we want to store our screenshot";
	File destination1=new File(path);//to store the string path into file 
	
	FileHandler.copy(file1, destination1);
	//you can impliment an
	}
	
}
