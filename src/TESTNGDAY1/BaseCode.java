package TESTNGDAY1;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCode {
	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void Down() {
		driver.quit();
	}

	public void screenshot(String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File destFile = new File("./Screenshot/"+filename);
		try {
			FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), destFile);
		} catch (Exception e) {
		}
		System.out.println("Screenshot captured sucessfully");
	}
}
