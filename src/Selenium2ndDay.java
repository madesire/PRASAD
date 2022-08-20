import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2ndDay {
	//Orange Demo Application
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To Maximize the screen of the chrome browser
		driver.manage().window().maximize();
		//Now to open the url inside the chrome browser we use this method
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//Now we have to find the web elements by locators 
		//There are three types of locators 1.by id 2.by name 3.by class name 4.by linktext
	    //now to automate the login 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//b[text()='Admin']")).click();
		//driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList' and //a[text()='Job Titles']]")).click();
		//input[@type='checkbox' and @id ='ohrmList_chkSelectAll']
		driver.findElement(By.xpath("//input[@type='checkbox' and @id ='ohrmList_chkSelectAll']")).click();
		for(int i=1; i<=45; i++) {
			driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
//		}
		//now we have to pass the data inside the username field
//		username.sendKeys("Admin");
//		//now we have to do the same with the password this is only to identify the pasword field
//		WebElement password = driver.findElement(By.id("txtPassword"));
//		password.sendKeys("admin123");
//		//now we have to click on the login button 
//		WebElement button = driver.findElement(By.id("btnLogin"));
//		button.click();
	
	
	
	}

}
