package TESTNGDAY1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Readfile {
	@Test(priority = 1)
	public void navToURl{
		String url=  
		
	}
	
	public static void main(String[] args) throws IOException {
		Properties prep = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\Rushi\\eclipse-workspace\\SELENIUMDAY1\\config.properties");
		prep.load(input);
		
	 String	s1=  prep.getProperty("browser");
	 String	s2=  prep.getProperty("url");
	 String	s3=  prep.getProperty("browser");
	 String url =
	 System.out.println(s2);
	 
	}

}
