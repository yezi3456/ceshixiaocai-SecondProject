package edu.base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import bsh.commands.dir;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	URL url;
	public AndroidDriver<AndroidElement> driver;
	Dimension dim;
	 @BeforeClass
	    public void setUp() throws IOException {
		    url =new URL("http://127.0.0.1:4723/wd/hub");
		  //  File app=new File("./apps/ApiDemos-debug.apk");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("platformName","Android");
			//cap.setCapability("app", app.getAbsolutePath());
			cap.setCapability("deviceName", "127.0.0.1:62001");
//			cap.setCapability("appPackage", "com.example.todolist");
//			cap.setCapability("appActivity", ".LoginActivity");
			//note
//			cap.setCapability("appPackage", "com.example.android.notepad");
//			cap.setCapability("appActivity", ".NotesList t2");
			//xuanxuan
			cap.setCapability("appPackage", "com.cnezsoft.xxm");
			cap.setCapability("appActivity", ".MainActivity t2");
			cap.setCapability("noReset", true);
//			cap.setCapability("databaseEnabled",true);
//            cap.setCapability("unicodeKeyboard", true);
//            cap.setCapability("resetKeyboard", true);
		    driver=new AndroidDriver<AndroidElement>(url,cap);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    dim=driver.manage().window().getSize();
		
	    }
}
