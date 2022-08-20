import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class iframes {
	//iframes operations 
	//iframes are the webelement which are interacted along with the web page to do operations on the webelements inside the iframe we have to first switch to that iframe
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Actions action = new Actions(driver);
			//driver.manage().window().maximize();
			driver.get("https://jqueryui.com/draggable/");
			WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
			//now to perform some operations on the dragable object we have to switch the frame to iframe.
			driver.switchTo().frame(frame);
			WebElement dragabl= driver.findElement(By.xpath("//div[@id='draggable']"));
			action.clickAndHold(dragabl).moveByOffset(20, 60).moveByOffset(10, -30).release().build().perform();
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[text()='Droppable']")).click();
			Thread.sleep(1000);
			WebElement frame1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
			driver.switchTo().frame(frame1);
			WebElement drop1= driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement drop2= driver.findElement(By.xpath("//*[@id='droppable']"));
			action.dragAndDrop(drop1, drop2).perform();
			Thread.sleep(1000);
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[text()='Resizable']")).click();
			WebElement frame2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
			driver.switchTo().frame(frame2);
			WebElement resize= driver.findElement(By.xpath("//*[@style='z-index: 90;' and @class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
			action.dragAndDropBy(resize, 180, 250).perform();
			Thread.sleep(1000);
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//a[text()='Selectable']")).click();
			Thread.sleep(500);
			WebElement frame3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
			driver.switchTo().frame(frame3);
			List<WebElement> select = driver.findElements(By.xpath("//ol//li[@class='ui-widget-content ui-selectee']"));
			for(WebElement selects:select) {
				String s1 = selects.getText();
				System.out.println(s1);
				if(s1.contains("Item")) {
					action.keyDown(selects, Keys.CONTROL).perform();
				}
			}
			driver.switchTo().parentFrame();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li//a[text()='Sortable']")).click();
			
			
				
				
				
}
}
