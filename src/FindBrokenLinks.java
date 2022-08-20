import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushi\\Desktop\\software testing\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//get the list of all the links
		List<WebElement> linkslist =  driver.findElements(By.tagName("a"));
		//to print the no of links
//		System.out.println(linkslist.size());
//		linkslist.addAll(driver.findElements(By.tagName("img")));
		for(WebElement listid:linkslist ) {
			String linkulr = listid.getAttribute("href");
//			System.out.println(linkulr);
			HashSet<String> linkset= new HashSet<String>();		
			URL link =new URL(linkulr);
			//to create connection by using url obj 'link'
			HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
			//wait to established a connection
			Thread.sleep(5000);
			//to established connection
			httpcon.connect();
			//now we have to capture some response code
	      	int lkcode=httpcon.getResponseCode();//Response code will be like 400/200/202/201
			//if the response code is 404 then the link is broken
			if(lkcode!=200) {
				linkset.add(linkulr);
				 System.out.println(linkulr   +"This is a broken link");
			}
//			else {
//				System.out.println(linkulr   +"This is not a broken link");
//			}
			System.out.println(linkset);

	}
}
}