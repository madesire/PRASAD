package TESTNGDAY1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AMAZONAutomation extends BaseCode {
	@Test(testName ="Google")
	public void testgoogle() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("software testing", Keys.ENTER);
		System.out.println(driver.getTitle());
		String actualtital = driver.getTitle();
		String expectedtital = "software testing123 - Google Search";
	}
	@Test(testName ="Facebook")
	public void TestFacebook() throws Throwable {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("Rushi");
		driver.findElement(By.xpath("//*[@id='passContainer']")).sendKeys("rushi123", Keys.ENTER);
	}
	@Test(testName ="OrangeHRM")
	public void TestOrangeHRM(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin12345");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	}

}
