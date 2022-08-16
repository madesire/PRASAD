package TESTNGDAY1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	
	@Test(dataProvider = "nameofdataprovider")
	public void login(String username, String password) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password, Keys.ENTER);
}
	@DataProvider(name="nameofdataprovider")
	public Object[][] lagindata() {
		Object[][] data = new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="Admin12345";

		return data;
	}
	}
