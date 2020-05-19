package edu.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	URL url;
	public AndroidDriver<AndroidElement> driver;
	Dimension d;

	@BeforeClass
	public void startup() throws MalformedURLException{
		url =new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "127.0.0.1:62001");
		cap.setCapability("appPackage", "com.cnezsoft.xxm");
		cap.setCapability("appActivity", ".MainActivity");
		cap.setCapability("noReset", true);
		
		driver = new AndroidDriver<AndroidElement>(url,cap);
//		ÒþÊ½µÈ´ý
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		d=driver.manage().window().getSize();
	}
	
//	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	

}
