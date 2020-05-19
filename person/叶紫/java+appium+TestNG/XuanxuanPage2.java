package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class XuanxuanPage2 {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public XuanxuanPage2(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	
//	我的按钮
	private AndroidElement btn_me() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]");
	}
	
//	注销按钮
	private AndroidElement btn_quit() {
		return driver.findElementByXPath("//*[@text='注销']");
	}
	
//	确认按钮
	private AndroidElement btn_ok1() {
		return driver.findElementByXPath("//*[@text='确认']");
	}
	
//	用户名
	private AndroidElement username() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}
	
//	密码
	private AndroidElement password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}
	
//	登录按钮
	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='登录']");
	}
	
//	private AndroidElement btn_clear() {
//		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]/android.widget.Button");
//	}

	

	


//	16.成功登录
	public void login_success() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(btn_submit());		
	}
	
//	17.登录失败之用户名错误
	public void login_fail1() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(btn_submit());		
	}
	
//	18.登录失败之密码错误
	public void login_fail2() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		action.click(btn_submit());		
	}
	
//	19.登录失败之用户名为空
	public void login_fail3() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(btn_submit());		
	}
	
//	20.登录失败之密码为空
	public void login_fail4() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.F));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		action.click(btn_submit());		
	}
	
	


}
