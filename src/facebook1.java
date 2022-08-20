import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebook1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();//screen will be maximize
		driver.get("https://www.facebook.com/signup");
		//By using action class
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Snadip";
		)//to use action class we have to use webelement referance variable
		//First you have to asign action class to driver 
		Actions act = new Actions(driver);
		act.sendKeys(args)
		

		
		
		
		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sandeep");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Panchal");
//		driver.findElement(By.xpath("//div//input[@class='inputtext _58mg _5dba _2ph-'and@name='reg_email__']")).sendKeys("sandeeppanchal12@gmail.com");
//		driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg _5dba _2ph-')and contains(@id,'u_0_j_')]")).sendKeys("sandeeppanchal12@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandeep123");
//	    List<WebElement> finalyear=driver.findElements(By.xpath("//*[@id=\"year\"]/option"));
	    for (WebElement year:finalyear) {
	    	String selectyear = year.getText();
	    	System.out.println(selectyear);
	    	if (selectyear.equals("2010")) {
	    		year.click();
				System.out.println(selectyear);
				break;
			}
	    }
		//String year = finalyear.
	    //String textyear = finalyear.getText();
		//int b1=Integer.parseInt(textyear);
		//System.out.println(b1);
		//for(int i=b1; i<=b1; i--) {
		//	System.out.println(i);
		//	if (i==1905) {
//				break;
		//	}
//		}
//		String textyear = finalyear.getText();
//		System.out.println(textyear);
//		for(int i=0; i=finalyear; i++) {
//			System.out.println(finalyear.getText());
//		}
//		now we will select values from the dropdown 1.select 2.bootstrap
		WebElement date = driver.findElement(By.xpath("//div//select[@id='day']"));//error
		Select startdate = new Select(date);
		startdate.selectByIndex(0);
		startdate.selectByValue("");
		startdate.selectByVisibleText("");
		
		driver.findElement(By.xpath("//div//select[@id='month']")).sendKeys("Dec");//SELECT DROPDOWN //error
		driver.findElement(By.xpath("//div//select[@id='year']")).sendKeys("2019");
		//now to print to all the values from the year dropdown on consol
		List<WebElement> dates = driver.findElements(By.xpath("//div//select[@id='year']"));
		for(WebElement startdate1:dates) {
			String newdate = startdate1.getText();
			System.out.println(newdate);
		}
		
}
}