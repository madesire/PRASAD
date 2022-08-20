import java.awt.Desktop.Action;
import java.awt.event.AWTEventListenerProxy;
import java.io.IOException;
import java.text.BreakIterator;
import java.time.Month;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.browser.model.Bucket;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zoom {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver = new ChromeDriver();//upcasting
	driver.manage().window().maximize();//screen will be maximize
	driver.get("https://zoom.us/signup");
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	OrangeDemo.takescreenshot(driver,"img11.png");
	Thread.sleep(500);
	WebElement cookies =  driver.findElement(By.xpath("//div//button[contains(@class,'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon')]"));
	act.click(cookies).build().perform();
	Thread.sleep(500);
	WebElement month = driver.findElement(By.xpath("div[class='zm-select-scrollbar-fix zm-scrollbar zm-scrollbar__focus'] i[class='zm-select__caret zm-input__icon zm-icon-up']"));
	act.click(month).perform();
	Thread.sleep(2000);
	act.sendKeys(month,Keys.ARROW_DOWN).sendKeys(month,Keys.ENTER).build().perform();
	act.scrollToElement(month)
	}
}
	//	Thread.sleep(1000);
//	//now to handle bootstrap dropdown menu
//	Thread.sleep(1000);//dd[contains(@id,'select-item-select-0-')]
//	WebElement years =driver.findElement(By.xpath("//dd[contains(@id,'select-item-select-0-')]"));
//	String selectyear = years.getText();
//	if (selectyear.equals("Jan")) {
//		years.click();
//	}

//Select selectmonth = new Select(month);
	//selectmonth.selectByVisibleText("10");
	
	
//	driver.findElement(By.xpath("//div//span[@id='select-0']")).sendKeys("Jan");
//	List<WebElement> Month = driver.findElements(By.xpath("//dd[contains(@id,'select-item-select-0-')]"));
//	//now to print all the values from the dropdowm we'll use for enhanced loop
//	for(WebElement selectmonth:Month) {
//		//now to select one of the value from the drop down menu we have to to store it in the string
//		String finaldate = selectmonth.getText();
//		System.out.println(finaldate);
//		if (finaldate.equals("Jan")) {
//			selectmonth.click();
//			break;
//		}
//		
//		
//		
//	}
	
//	driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']//button")).click();
//	Thread.sleep(600);
//	driver.findElement(By.xpath("//span[@role='button' and @id='select-0']")).sendKeys("Jan");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@role='button' and @id='select-1']")).sendKeys("10");