package TESTNGDAY1;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orange_HRM_Automation{
	public static WebDriver driver;
//	@Parameters("browsername")
//	@BeforeTest
//	public void setup(String browsername){
//		if (browsername.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		else {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
//	}
//	@BeforeTest
//	public void open() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
	
	
//	@Parameters("url")
//	@Test
//	public void openurl(String url) {
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		driver.get(url);
//	}
	
	@Test(dataProvider ="nameofdataprovider")
	public void login(String username, String password) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password, Keys.ENTER);
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		System.out.println(element.isDisplayed());
	}
//	@Test
//	public void verifymylogin() {
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
//		assertTrue(element.isDisplayed());
		
//	}
//	@Test
//	public void verifymyinfo() {
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
//		WebElement element = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
//		boolean actualvalue = element.isDisplayed();
//	    System.out.println(actualvalue);
//	}
//	@Test
//	public void logout() {
//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//		Actions action = new Actions(driver);
//		driver.findElement(By.xpath("//a[@id='welcome']")).click();
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement element1 = mywait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[normalize-space()='Logout']")));
//		action.moveToElement(element1).click().build().perform();
//	}
//
	@AfterTest
	public void closebrower() {
		driver.close();
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
