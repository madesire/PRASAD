package TESTNGDAY1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_TestNG {
	WebDriver driver;
	@Test(priority = 1)
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Test (priority = 2)
	public void openurl() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		String actualtital=driver.getTitle();
		String expectedtital = "HYR Tutorils - Google Search12";
//		Assert.assertEquals(actualtital, expectedtital);
//		Assert.fail("Whatever msg you want to show");
		Assert.fail();
		Assert.assertTrue(actualtital.equals(expectedtital), "THIS IS FAILING");
//		Assert.assertFalse(actualtital.equals(expectedtital), "THIS IS false FAILING");
//		Assert.assertTrue(actualtital.equals(expectedtital));
//		Assert.assertFalse(actualtital.equals(expectedtital));
//		SoftAssert SA = new SoftAssert();
//		SA.assertEquals(actualtital, expectedtital);
		driver.quit();
//		SA.assertAll();
		
		
	
	}
	
	
	
	
	
}
