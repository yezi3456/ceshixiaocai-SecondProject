package edu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class XuanxuanPage1 {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public XuanxuanPage1(AndroidDriver<AndroidElement> driver) {
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

//	讨论组按钮
	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
//	创建聊天按钮
	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='创建聊天']");
	}
	
//	选择成员
	private AndroidElement select_number1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
//	确认按钮
	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	
//	创建按钮
	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='创建']");
	}
	
//	第一个讨论组
	private AndroidElement taolunzu1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
//	菜单按钮
	private AndroidElement btn_caidan() {
		return driver.findElementByXPath("//*[@text='显示菜单']");
	}
	
//	收藏按钮
	private AndroidElement btn_shoucang() {
		return driver.findElementByXPath("//*[@text='收藏']");
	}
	
//	取消收藏按钮
	private AndroidElement btn_quxiaoshoucang() {
		return driver.findElementByXPath("//*[@text='取消收藏']");
	}
	
//	成员列表按钮
	private AndroidElement btn_listNumbers() {
		return driver.findElementByXPath("//*[@text='成员列表']");
	}
	
//	重命名按钮
	private AndroidElement btn_rename() {
		return driver.findElementByXPath("//*[@text='重命名']");
	}
	
	
//	重命名按钮
	private AndroidElement btn_rename1() {
		return driver.findElementByXPath("//*[@text='重命名']");
	}
	
//	同步消息按钮
	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='同步最近的消息']");
	}	
		
//	发送消息文本框
	private AndroidElement send_new() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}	
	
//	发送按钮
	private AndroidElement btn_send() {
		return driver.findElementByXPath("//*[@text='发送']");
	}	
	
	
//	个人信息按钮
	private AndroidElement btn_Information() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
	}
	
//	关于按钮
	private AndroidElement btn_guanyu() {
		return driver.findElementByXPath("//*[@text='关于']");
	}
	
//	关于按钮
	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='隐私条款']");
	}
	
//	喧喧链接
	private AndroidElement lianjie() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	
//	联系人按钮
	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
//	第一个联系人
	private AndroidElement lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
//	开聊按钮
	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='开聊']");
	}
	
//	资料按钮
	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='资料']");
	}
	

	
	
	
	
	
	
//	1.注销登录
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}
	
//	2.创建讨论组
	public void createTaolunzu() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
//	3.收藏讨论组
	public void shoucangTaolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
//	4.取消收藏讨论组
	public void quxiao_shoucangTaolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
//	5.查看成员列表
	public void list_numbers() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
//	6.重命名讨论组
	public void rename_Taolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_rename());
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		action.click(btn_rename1());
	}
	
//	7.同步最近消息
	public void list_news() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
//	8.在讨论组中发送文本内容
	public void send_news() {
		action.click(taolunzu1());
		action.click(send_new());
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.C));
		action.click(btn_send());
	}
	
//	9.查看个人信息
	public void list_Information() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	
//	10.查看关于
	public void list_guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
//	11.查看隐私条款
	public void list_yinsitiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
//	12.查看喧喧官网
	public void list_xuanxuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}
	
//	13.查看所有联系人
	public void list_lianxiren() {
		action.click(btn_lianxiren());
	}
		
//	14.收藏一个联系人
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}
	
	
//	15.查看联系人资料
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		
	}
	
	
	


}
