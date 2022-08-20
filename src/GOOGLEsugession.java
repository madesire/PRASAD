import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class GOOGLEsugession {
	// WAP to handle the google suggestion if the recommended sugessions matches to
	// your result then click on in or open it in the new tab
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//	    WebElement nothanks = driver.findElement(By.xpath("//div//button[text()='No thanks']"));
//		nothanks.click();
		WebElement popup = driver.findElement(By.xpath("//div//button[text()='No thanks']"));
		popup.click();
		Thread.sleep(1000);
		WebElement searchbox = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		searchbox.sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> searchbox1 = driver.findElements(By.xpath("//div[@class='eIPGRd']//*[@class='pcTkSc']"));
		Thread.sleep(1000);
		for (WebElement sugessions : searchbox1) {
			String result = sugessions.getText();
			System.out.println(result);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			if (result.equals("java compiler")) {
				searchbox.click();
				System.out.println("Your result is matched");
				break;
			}
//		Thread.sleep(1000);
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		
//		
//		}
//		for(WebElement sugessions:searchbox1) {
//			String result = sugessions.getText();
//			System.out.println(result);
//			if (result.equals("java compiler")) {
//				action.keyDown(searchbox , Keys.SHIFT).sendKeys(Keys.ARROW_DOWN).click().build().perform();	
//			break;
//			}
//			}

		}

	}
}
