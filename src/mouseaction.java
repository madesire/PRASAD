import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Actions action = new Actions(driver);
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
    WebElement mouse = driver.findElement(By.xpath("//input[@id='double-click']"));
    //now to perform double click operation
    action.doubleClick(mouse).perform();


}
}
