package TESTNGDAY1;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.google.common.base.CaseFormat;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

@Test
public class AmazonParametsrization {
	WebDriver driver;
/*
	
	@BeforeTest
	public void setup(String browsername) {
		switch (browsername.toLowerCase()){
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
			break;
		default:
			System.err.println("browsername is in valid");
		}
		driver.manage().window().maximize();
	}
	@AfterTest
	public void terminate() {
		driver.quit();
	}
	@Parameters("url")
	*/
	
	@Test
	public void openbrowser1(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}	
	@Test(priority = 1)
	public void openurl() {
	driver.get("https://www.amazon.in/");
	}
	@Test(priority = 2)
	public void findphone() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile Phones", Keys.ENTER);
	}
	@Test (priority = 3)
	public void addtocart() {
	Actions action = new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)']"));
	action.scrollToElement(element).build().perform();
	element.click();
    String parentid=driver.getWindowHandle();
    Set<String> allids = driver.getWindowHandles();
    for (String newid:allids) {
    if (!(parentid.equals(allids))){
		driver.switchTo().window(newid);
		}
	}
	}
    @Test (priority = 4)
    public void validatecart() {
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    Actions action = new Actions(driver);
  WebElement element = driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
    action.scrollToElement(element).build().perform();
    element.click();
    }
    @Test (priority = 5)
    public void gotocart() {
    	WebElement element = driver.findElement(By.xpath("//span[@class='a-button a-button-base attach-button-large attach-cart-button']"));
    	element.click();
    }
    @Test (priority=6)
    public void verifycart(){
    	WebElement element =driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)' and contains(@class,'a-truncate-cut')]"));
    	System.out.println(element.getText());
    	if(element.isDisplayed()) {
    	System.out.println("You Have sucessfully added mobile in cart");	
    	}
    	}
 
    

}

    
 
	

