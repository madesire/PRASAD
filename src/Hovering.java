import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// to maximize the browser
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement doubleclickbutton =driver.findElement(By.xpath("//*[@id='double-click']"));
//	double click
		Actions act = new Actions(driver);
//		act.doubleClick(doubleclickbutton).perform();
//		Hover operation
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
		act.moveToElement(hoverelement).perform();
		WebElement googlelink = driver.findElement(By.xpath("//*[@id='link2']"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='link2']")).click();
		
		//		googlelink.click();
//		Right click operation:
//		WAP to perform the hover and click operation on Admin tab of OrangeHRM
		
//		act.contextClick(hoverelement).click().build().perform();		
		
	}

}
