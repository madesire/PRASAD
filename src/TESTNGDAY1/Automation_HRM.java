
package TESTNGDAY1;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Automation_HRM {
	WebDriver driver;
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void openurl() {
		//test case to login into the orangehrm webside
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
//	    driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	}
	@Test(priority = 2)
	public void login() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123" , Keys.ENTER);
	}
	@Test(priority = 3)
	public void verifymylogin() {
//	    WebElement element=driver.findElement(By.xpath("//a[text()='Welcome pavan']"));
	    System.out.println(driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//a[@id='welcome']")).getText());
	}
	@Test(priority = 4)
	public void verifymyinfo() {
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	    WebElement element=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
	    System.out.println(element.isDisplayed());
	    System.out.println(element.getText());
	}
	
	@Test(priority = 5)
	public void logout() {
		Actions action =new Actions(driver);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
	    //WebElement element=driver.findElement(By.xpath("//li//a[normalize-space()='Logout']"));
	    WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement element1 = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li//a[normalize-space()='Logout']")));
	    action.moveToElement(element1).click().build().perform();
	}
	@AfterTest(alwaysRun = true)
	public void closebrower() {
	driver.close();
	}
}
