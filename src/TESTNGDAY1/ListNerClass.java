package TESTNGDAY1;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListNerClass extends BaseCode implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		screenshot(result.getMethod().getMethodName()+".jpg");
	}
}
