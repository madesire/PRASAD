package TESTNGDAY1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	WebDriver driver;
	public static void takescreenshot(WebDriver driver , String filename) throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;//upcasting
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/"+filename+""));
	}
	@Test()
	public void navToUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test(priority = 1)
	public void enteringCredentials() {
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pwd.sendKeys("admin123");
	}
	@Test(priority = 2, dependsOnMethods = "enteringCredentials")
	public void clickOnLoginButton() {
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
	}
	@Test(priority = 3)
	public void hoveroveradmin() {
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    WebElement element=driver.findElement(By.xpath("//a/b[text()='Admin']"));
	    WebElement element1=driver.findElement(By.xpath("//li/a[text()='Organization']"));
	    action.moveToElement(element).moveToElement(element1).build().perform();

	}
	
	
	@Test(priority = 4, dependsOnMethods = "hoveroveradmin", alwaysRun = false )
	public void logout() {
		Actions action =new Actions(driver);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
	    //WebElement element=driver.findElement(By.xpath("//li//a[normalize-space()='Logout']"));
	    WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(1));
		WebElement element1 = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[normalize-space()='Logout']")));
	    action.moveToElement(element1).click().build().perform();
	}

}
