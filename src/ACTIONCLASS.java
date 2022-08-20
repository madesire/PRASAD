import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.MapMaker;
public class ACTIONCLASS {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver = new ChromeDriver();//upcastin

	driver.manage().window().maximize();
	  // Open Techlcistic.com's practice form
	driver.get("https://opensource-demo.orangehrmlive.com/");
	  // Set Implicit Wait
	//  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	  WebElement FIRSTNAME = driver.findElement(By.name("firstname")); 
	  // Create object of Actions class
//	  Actions actions = new Actions(driver);
//	  actions.sendKeys(FIRSTNAME, "JOHN SNOW").build().perform();
	  WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  username.sendKeys("Adminn");
	  WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	  pwd.sendKeys("admin123");
	  WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
	  loginbutton.click();
	  WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
	  String msg = message.getText();
	  System.out.println(msg);
	  String expectedmessage = "Invalid Credentials";
	  if(expectedmessage.equals(msg)){
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail please file the bug");
	}
	  
	
		
		
	}

}
