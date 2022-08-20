import java.awt.Checkbox;
import java.lang.invoke.StringConcatFactory;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DROPDOWN {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String tital= driver.getTitle();
		System.out.println("The current tital of the page is : " +tital);
		String curruntlString = driver.getCurrentUrl();
		System.out.println("The current url : " +curruntlString);
		//String pagesource =driver.getPageSource();
		//System.out.println("The page source is : "+pagesource );
		WebElement textwewant = driver.findElement(By.xpath("//*[@id='logInPanelHeading']"));
		String checktext=textwewant.getText();
		System.out.println(checktext);
		if (checktext.equals("LOGIN Panel")) {
			System.out.println("TEXT IS MATCHED");
		}
		else {
			System.out.println("TEXT DOESNT MATCH");
		}
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//driver.findElement(By.xpath("//b[text()='Admin']")).click();
		//Find Element is used to locate a single web element having return type webElement
		//Even if you do like this this will only select the first checkbox
		//driver.findElement(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]")).click();
		//find ELements is used to locate multiple web elements having return type list<WebElements>
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		//now to select all the checkboxes we have to use 'for Enhanced loop'
		for(WebElement Checkbox:checkboxes) {
			Checkbox.click();
		}
		
	}
	

}
