import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Actions action =new Actions(driver);
	driver.manage().window().maximize();
	
	String year = "2021";
	String month="jun";
	String date = "10";
	
	//now first we have to click on the date option 
	driver.findElement(By.xpath("//*[@id='onward_cal']")).click();//This will opens a date picker
	while (true) {
		String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	}
	



}
}
