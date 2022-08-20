import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.util.concurrent.CycleDetectingLockFactory;

public class selectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/selectable/");
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		WebElement frame3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame3);
	    WebElement selectable=driver.findElement(By.xpath("//ol//li[@class='ui-widget-content ui-selectee']"));
		List<WebElement> select = driver.findElements(By.xpath("//ol//li[@class='ui-widget-content ui-selectee']"));
		for(WebElement selects:select) {
			String s1 = selects.getText();
			System.out.println(s1);
			if(s1.contains("Item")) {
				action.keyDown(selects, Keys.CONTROL).perform();
				
			}
//			break;
			//ol//li[@class='ui-widget-content ui-selectee']
	}

}
}
