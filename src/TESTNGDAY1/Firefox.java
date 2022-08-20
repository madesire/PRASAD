package TESTNGDAY1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Firefox {
	WebDriver driver;
	@Test
	public void openbrowser2(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}	
	@Test(priority = 1)
	public void openurl() {
	driver.get("https://www.amazon.in/");
	}
	@Test(priority = 2)
	public void findphone() {
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile Phones", Keys.ENTER);
	}
	
	@Test (priority = 3)
	public void addtocart() {
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)']"));
	action.scrollToElement(element).build().perform();
	element.click();
    String parentid=driver.getWindowHandle();
    Set<String> allids = driver.getWindowHandles();
    for (String newid:allids) {
    if (!(parentid.equals(allids))){
		driver.switchTo().window(newid);
		}
	}
	}
    @Test (priority = 4)
    public void validatecart() {
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    Actions action = new Actions(driver);
  WebElement element = driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
    action.scrollToElement(element).build().perform();
    element.click();
    }
    @Test (priority = 5)
    public void gotocart() {
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	WebElement element = driver.findElement(By.xpath("//span[@class='a-button a-button-base attach-button-large attach-cart-button']"));
    	element.click();
    }
    @Test (priority=6)
    public void verifycart(){
    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    	WebElement element =driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)' and contains(@class,'a-truncate-cut')]"));
    	System.out.println(element.getText());
    	if(element.isDisplayed()) {
    	System.out.println("You Have sucessfully added mobile in cart");	
    	}
    	
    	}

}
