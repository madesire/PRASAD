import java.awt.RenderingHints.Key;
import java.time.DayOfWeek;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	//now we have to automate the facebook application 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Actions actions =new Actions(driver);
		driver.switchTo().fr
		WebElement firstname =driver.findElement(By.xpath("//input[contains(@id , 'u_0_b_')]"));
		actions.click(firstname).sendKeys("sandip").build().perform();
		actions.keyDown(firstname , Keys.SHIFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).build().perform();

		
		
		
		
		//		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and contains(@id,'u_0_d_')]")).sendKeys("pawar");
//		driver.findElement(By.xpath("//input[@type='text' and contains(@id,'u_0_g_')]")).sendKeys("rushipawar1@gmail.com");
//		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and contains(@id,'u_0_j_')]")).sendKeys("rushipawar1@gmail.com");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rushi1234");
//		//now for the dropdown menus
//		WebElement date =driver.findElement(By.xpath("//div//select[@id='day']"));
		
		
//		Thread.sleep(500);
//		//date.click();
//		Select selectdate = new Select(date);
//		selectdate.selectByVisibleText("18");
//		//selectdate.selectByIndex(0);
//		//selectdate.selectByValue("25");
//		WebElement month = driver.findElement(By.xpath("//div//select[@id='month']"));
//		Thread.sleep(500);
//		//month.click();
//		Select selectmonth = new Select(month);
//		//selectmonth.selectByIndex(5);
//		selectmonth.selectByVisibleText("Dec");
//		//selectmonth.selectByVisibleText("Nov");
//		//not to print all the years from the dropdown menu we can use foe enhanced loop
//		List<WebElement> year = driver.findElements(By.xpath("//div//select[@id='year']"));
//		//Select selectyear = new Select(year);
//		//div//select[@id='year']                              			String yeartext = selectyear.getText();
//		WebElement finalyear  = driver.findElement(By.xpath("//*[@id=\"year\"]/option"));
//		for(WebElement years:finalyear) {
//			String s1=years.getText();
//			
//		}
//		Select selectyear = new Select(finalyear);
//		selectyear.selectByIndex(15);
		
		}
		//selectyear.selectByIndex(10);
		//selectyear.selectByValue("2019");
//		 List<WebElement>selectyear= driver.findElements(By.xpath("//div//select[@id='year']"));
//		for (WebElement year:selectyear) {
//			String yearvalue=year.getText();
//			System.out.println(yearvalue);
//			if (yearvalue.equals("20")) {
//				year.click();
//				break;
//			}
			//driver.quit();
			
			
//			}
		
	
		
		
		
		
		
		
		
		
	
	}

