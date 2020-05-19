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
	
	
//	�ҵİ�ť
	private AndroidElement btn_me() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]");
	}
	
//	ע����ť
	private AndroidElement btn_quit() {
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	
//	ȷ�ϰ�ť
	private AndroidElement btn_ok1() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	
//	�û���
	private AndroidElement username() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}
	
//	����
	private AndroidElement password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}
	
//	��¼��ť
	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='��¼']");
	}
	
//	private AndroidElement btn_clear() {
//		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]/android.widget.Button");
//	}

	

	


//	16.�ɹ���¼
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
	
//	17.��¼ʧ��֮�û�������
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
	
//	18.��¼ʧ��֮�������
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
	
//	19.��¼ʧ��֮�û���Ϊ��
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
	
//	20.��¼ʧ��֮����Ϊ��
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
