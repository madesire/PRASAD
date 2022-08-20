import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.page.model.JavascriptDialogOpening;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandler {
	public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver=new FirefoxDriver();
			WebDriver driver=new ChromeDriver();
			Actions action = new Actions(driver);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			//1.To scroll down by using pixels
			//js.executeScript("window.scrollBy(0,5000)","");	
//		    WebElement scrollto=driver.findElement(By.xpath("//a[text()='Contact Us']"));
		    //2.To scroll upto the perticular webelement
		    //js.executeScript("arguments[0].scrollIntoView()",scrollto);
		    //3.To scroll upto the bottom of the page
//		    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			//to get the parent window id and print it on the consol // it returns the string value
			String parentwid= driver.getWindowHandle();
			System.out.println(parentwid);
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			//To get all window ids of all open windows we used getwindowHandles() method
			Set<String> windowid= driver.getWindowHandles();
			System.out.println(windowid);
			//we can also switch the window by using for each loop
			for (String winid:windowid) {
				//condition to change the window to the parentid
				if(!(parentwid.equals(winid))) {
					driver.switchTo().window(winid);
					}
			
			}
//			int sizeofwindowids=windowid.size();
//			System.out.println(sizeofwindowids);
			driver.findElement(By.xpath("//input[@class='home-tril-email']")).sendKeys("Rushipawar124@gmail.com");

			//The ids we get will be unieque every time
			//System.out.println(windowid);
			//[CDwindow-1BF5B606CE9C3C5A1AF0C76D9EC59620, CDwindow-AA90B2F8779DA58CE4B9326D4C718E04]
			//After refreshing the page //id is going to be unique everytime.
		   // [CDwindow-6174024BA6B805115CE389B32B04BAA3, CDwindow-E613A1B4F9B0842B27ACE82D6AF8569D]
		    //Now to store those window id we have different methods, by this method we can get the window id one by one and will get stored in the reference variable that we have created
			//1.Iterative method
//			Iterator<String>winids=windowid.iterator();
//			String parentid=winids.next();
//		    System.out.println(parentid);
//			String childid=winids.next();
//			System.out.println(childid);

			//2.By using list/ArratList
			//Now with the second method we can store the ids inside the array list
			//For that we have to convert the set into the list first
			List<String> windowidList = new ArrayList<windowid>();
			String parentwindowid=windowidList.get(0);//parent
			String childwindowid= windowidList.get(1);
			//now to print the both parent and child window ids 
//			System.out.println(parentwindowid);
//			System.out.println(childwindowid);
			//And now to swith on the perticular window we used
			//Even when the new window is open in the browser the focus of the automation scrips is still on the parent window that is the reason if we open any new window in the browser we also have to the focus of the script only then we can perform the operation on the child window 
			//driver.switchTo().window(childwindowid);
//			driver.findElement(By.xpath("//input[@class='home-tril-email']")).sendKeys("Rushipawar124@gmail.com");
			//To open/create new window tab in the same browser we used this will open the blank tab in the browser
			//driver.switchTo().newWindow(WindowType.TAB);
			//To open tab on new browser i.e it will open the tab in new chromebrowser.  
			//driver.switchTo().newWindow(WindowType.WINDOW);
			
	}	

}