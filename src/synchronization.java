import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	//when two or more components involved to perform any action we expect them to work together with the same pace.The coordination between these components to run parellarly is called synchronization
	//in selenium we can achieve synchronizaton by using wait 
	//we have 2 types of wait 
	//1.Static wait(thraed.sleep("time for which we have to wait the script);
	//2.Dynamic Wait//1.implicit wait //2.Explicit Wait //3.Fluent Wait
	//1.implicit Wait
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Actions action =new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//	driver.get("https://www.google.co.in/");
//	Thread.sleep();//It will slow doen the automtion script for 10 sec 
	//First i'll do some operations without using implicit wait
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("India");
//	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
	//Now to apply implicit wait 
//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//syntax
//	WebElement page=driver.findElement(By.xpath("//td//a[@aria-label='Page 3']"));
//	action.scrollToElement(page).perform();
//	action.moveToElement(page).click(page).build().perform();
//	driver.findElement(By.xpath("//h3[text()='Central Bank of India']")).click();
	//2.Explicit wait when we want to apply the perticular condition to the element we use Explicit wait 
	//To check whether the enable button is enable or not.The enable button will be visible after 10sec	
	
//	driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	WebElement enablebutton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']"))); 
//	System.out.println(enablebutton.isEnabled());//return boolean condition on console
	
	// now Take the text after 10 sec
//	driver.findElement(By.xpath("//button[@id='populate-text']")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	WebElement enabletext =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']"))); 
//	String expectedtext = enabletext.getText();
//	System.out.println(expectedtext);
//	System.out.println(enabletext.equals(expectedtext));
	//now to handle the pop up 
	
	//to handle pop up
//	driver.findElement(By.xpath("//button[@id='alert']")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
//    wait.until(ExpectedConditions.alertIsPresent());
    
	//Now to ckeck checkbox is selected or not
//	driver.findElement(By.xpath("//button[@id='checkbox']")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	System.out.println(wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']"))));
//	System.out.println(checkbox.isSelected());
	
	//To check button is visible on the browser or not
//	driver.findElement(By.xpath("//button[@id='enable-button']")).click();
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	WebElement button =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']"))); 
//	System.out.println(button.isEnabled());
	
	
	//3.Fluent Wait 
	//Fluent wait is similar to the explicit wait but have more customization option than explicit wait it also shows TimeOutException as of explicit wait
	//In fluent wait we can also give polling interval for checking over the browser and we can also handle the exceptiom inside the fluent wait 
	
	
	FluentWait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(60))
			.pollingEvery(Duration.ofNanos(10))
			.ignoring(NoSuchElementException.class);
	driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
	WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
	System.out.println(mywait.until(ExpectedConditions.visibilityOf(disablebutton)).isDisplayed());
	
	
	
	
	}

}
