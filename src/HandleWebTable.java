import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class HandleWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> webtable = driver.findElements(By.xpath("//tr"));
		String expectedvalue = "Niamey";
		int rowcount = driver.findElements(By.xpath("//*[@id='countries']//tr")).size();
		System.out.println(rowcount);
		int colcount = driver.findElements(By.xpath("//*[@id='countries']//h3")).size();
		System.out.println(colcount);
		for (int i = 1; i < rowcount; i++) {
			for (int j = 1; j <= colcount; j++) {
				String actvalue = driver.findElement(By.xpath("//*[@id='countries']//tbody/tr[" +(i+1)+ "]/td[" +j+ "]")).getText();
				if (actvalue.equals("Guyana")) {
					System.out.println(i + " : " + j);
					break;
				}
			}
		}

	}
}
