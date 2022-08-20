import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser we use following method
		driver.manage().window().maximize();
		//To open any url in to the browser we use get method 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Different navigation methods for the browser
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		//To slow down the program for given seconds we use bellow method
		//Thread.sleep(100);
		//To refresh the browser we use following method
		//driver.navigate().refresh();
		//To close the browser we use close method
		//driver.close();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("http://www.facebook.com");
//		Thread.sleep(700);
//		driver1.close();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver2 = new EdgeDriver();
//		driver2.get("http://www.amazon.com");
//		Thread.sleep(1000);
//		driver2.close();
	
		
	}
}
