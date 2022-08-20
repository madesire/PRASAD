import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.beust.jcommander.JCommander.Builder;

public class OrangeDemo {
	static WebDriver driver;
	public static void takescreenshot(WebDriver driver , String filename) throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;//upcasting
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/"+filename+""));
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//to maximize chrome
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		Actions action = new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		WebElement forgotpass=driver.findElement(By.xpath("//div//a[text()='Forgot your password?']"));
//        action.keyDown(Keys.CONTROL).click(forgotpass).keyUp(Keys.CONTROL).build().perform();
//        Thread.sleep(4000);

        
//        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
//        action.keyDown(forgotpass, Keys.CONTROL)..build().perform();
      
        // driver.quit();
		//	    action.keyDown(forgotpass , Keys.SHIFT).click().build().perform();
//	    action.click(forgotpass).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();	
		
		//	    takescreenshot(driver, "imh10.png");
//		TakesScreenshot screenshot= (TakesScreenshot)driver;//casting
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("C:\\Users\\Rushi\\Desktop\\software testing\\selenium test\\img2.png"));
//		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");//username field automate
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");//password field automate
//		driver.findElement(By.xpath("//input[@class='button']")).click();
//		WebElement admin = driver.findElement(By.xpath("//div//a[@id='menu_admin_viewAdminModule']"));
//		Actions actions = new Actions(driver);//casting in to action class
//		Thread.sleep(500);
//		actions.moveToElement(admin).build().perform();
//		Thread.sleep(5000);
		//driver.findElement(By.xpath("//b[text()=\"Admin\"]")).click();
		//driver.findElement(By.xpath(""));
		//now to take screenshot
//		TakesScreenshot screenshot= (TakesScreenshot)driver;
//		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
//		String path ="C:\\Users\\Rushi\\Desktop\\software testing\\selenium test\\orangehrm.png";
//		File destination = new File(path);
//		FileHandler.copy(srcFile, destination);
//		TAKESCREENSHOT();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement admin= driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		WebElement userid=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement user=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		WebElement qualification=driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']"));
		WebElement skills=driver.findElement(By.xpath("//a[@id='menu_admin_viewSkills']"));
		Thread.sleep(1000);
		action.moveToElement(admin).moveToElement(qualification).moveToElement(skills).click(skills).build().perform();
		
		
		
		//action.moveToElement(userid).click().build().perform();
//		js.executeScript("arguments[0].click();", userid);
		

}
}