package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class XuanxuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public XuanxuanPage(AndroidDriver<AndroidElement> driver) {
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
	
//	登录按钮
	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='登录']");
	}	

//	讨论组按钮
	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
//	创建聊天按钮
	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='创建聊天']");
	}
	
//	确认按钮
	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
		
//	创建按钮
	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='创建']");
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
	
//	同步消息按钮
	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='同步最近的消息']");
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
	
//	隐私条款按钮
	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='隐私条款']");
	}
	
//	联系人按钮
	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
//	开聊按钮
	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='开聊']");
	}
	
//	资料按钮
	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='资料']");
	}	
	
//	发邮件按钮
	private AndroidElement btn_email() {
		return driver.findElementByXPath("//*[@text='Email lili@163.com']");
	}

//	用户名
	private AndroidElement username() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}
	
//	密码
	private AndroidElement password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}
	
//	选择成员
	private AndroidElement select_number1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
//	第一个讨论组
	private AndroidElement taolunzu_1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}	
		
//	发送消息文本框
	private AndroidElement send_new() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}	
	
//	喧喧链接
	private AndroidElement lianjie() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	
//	第一个联系人
	private AndroidElement lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
//	lili
	private AndroidElement lili() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]");
	}
	
	
/******************************************************************************************/
/******************************************************************************************/

	
//	01登录成功
	public void login_success() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(btn_submit());		
	}
	
//	02登录失败-用户名错误
	public void login_fail1() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(btn_submit());		
	}
	
//	03登录失败-用户名为空
	public void login_fail3() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(btn_submit());		
	}
	
//	04登录失败-密码错误
	public void login_fail2() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(password());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(btn_submit());	
	}
	
	
//	05登录失败-密码为空
	public void login_fail4() throws InterruptedException {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());
		action.click(username());
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.R));
		action.click(btn_submit());		
	}
	
//	06创建讨论组
	public void taolunzu_Create() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
//	07收藏讨论组
	public void taolunzu_Shoucang() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
//	08取消收藏讨论组
	public void taolunzu_Quxiaoshoucang() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
//	09查看讨论组成员列表
	public void taolunzu_Numbers() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
//	10给讨论组重命名
	public void taolunzu_Rename() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_rename());
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.V));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		action.click(btn_rename());
	}
	
//	11同步讨论组的最近消息
	public void taolunzu_news() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
//	12在讨论组中发送文本内容hello
	public void send_news() {
		action.click(taolunzu_1());
		action.click(send_new());
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		action.click(btn_send());
	}
	
//	13查看我的信息
	public void myInformation() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	
//	14查看关于
	public void guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
//	15查看隐私条款
	public void yinsitiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
//	16查看喧喧官网
	public void xuanxuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}
	
//	17退出当前登录账号
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}
		
//	18查看联系人lili的资料
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());	
	}
	
//	19收藏lili这个联系人
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}
	
//	20与lili发邮件
	public void sendEmail() {
		action.click(lili());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		action.clear(btn_email());
	}



}
