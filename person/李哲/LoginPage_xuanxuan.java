package edu.pages;


import edu.util.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LoginPage_xuanxuan {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public LoginPage_xuanxuan(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	public AndroidElement edit_server() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
	}
	public AndroidElement edit_username() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}

	public AndroidElement edit_password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}

	public AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='µÇÂ¼']");
	}

	public HomePage_xuanxuan loginSuccess(String server,String name, String password) throws InterruptedException {

		action.click(edit_server());
		action.click(edit_server());
		action.click(edit_server());
		action.click(edit_server());
		action.click(edit_server());
		action.click(edit_server());
		action.click(edit_server());
		driver.pressKey(new KeyEvent(AndroidKey.L));
//		action.type(edit_server(), server);
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.Z));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		action.click(edit_username());
		action.click(edit_username());
		action.click(edit_username());
		action.click(edit_username());
		action.click(edit_username());
		action.click(edit_username());
		action.click(edit_username());
		
		driver.pressKey(new KeyEvent(AndroidKey.A));
//		Thread.sleep(5000);
//		action.type(edit_username(), name);
//		Thread.sleep(5000);
//		action.type(edit_password(), password);
		Thread.sleep(5000);
		action.click(btn_submit());

		return new HomePage_xuanxuan(driver);
	}

	public String  loginFail(String server,String name, String password) {

		action.type(edit_server(), server);
		action.type(edit_username(), name);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return action.getToast();

	}
}
