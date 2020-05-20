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
	
//	��¼��ť
	private AndroidElement btn_submit() {
		return driver.findElementByXPath("//*[@text='��¼']");
	}	

//	�����鰴ť
	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
//	�������찴ť
	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='��������']");
	}
	
//	ȷ�ϰ�ť
	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
		
//	������ť
	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	�˵���ť
	private AndroidElement btn_caidan() {
		return driver.findElementByXPath("//*[@text='��ʾ�˵�']");
	}
	
//	�ղذ�ť
	private AndroidElement btn_shoucang() {
		return driver.findElementByXPath("//*[@text='�ղ�']");
	}
	
//	ȡ���ղذ�ť
	private AndroidElement btn_quxiaoshoucang() {
		return driver.findElementByXPath("//*[@text='ȡ���ղ�']");
	}
	
//	��Ա�б�ť
	private AndroidElement btn_listNumbers() {
		return driver.findElementByXPath("//*[@text='��Ա�б�']");
	}
	
//	��������ť
	private AndroidElement btn_rename() {
		return driver.findElementByXPath("//*[@text='������']");
	}
	
//	ͬ����Ϣ��ť
	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='ͬ���������Ϣ']");
	}
	
//	���Ͱ�ť
	private AndroidElement btn_send() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	������Ϣ��ť
	private AndroidElement btn_Information() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
	}
	
//	���ڰ�ť
	private AndroidElement btn_guanyu() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	��˽���ť
	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='��˽����']");
	}
	
//	��ϵ�˰�ť
	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
//	���İ�ť
	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	���ϰ�ť
	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='����']");
	}	
	
//	���ʼ���ť
	private AndroidElement btn_email() {
		return driver.findElementByXPath("//*[@text='Email lili@163.com']");
	}

//	�û���
	private AndroidElement username() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
	}
	
//	����
	private AndroidElement password() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
	}
	
//	ѡ���Ա
	private AndroidElement select_number1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
//	��һ��������
	private AndroidElement taolunzu_1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}	
		
//	������Ϣ�ı���
	private AndroidElement send_new() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}	
	
//	��������
	private AndroidElement lianjie() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	
//	��һ����ϵ��
	private AndroidElement lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
//	lili
	private AndroidElement lili() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]");
	}
	
	
/******************************************************************************************/
/******************************************************************************************/

	
//	01��¼�ɹ�
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
	
//	02��¼ʧ��-�û�������
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
	
//	03��¼ʧ��-�û���Ϊ��
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
	
//	04��¼ʧ��-�������
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
	
	
//	05��¼ʧ��-����Ϊ��
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
	
//	06����������
	public void taolunzu_Create() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
//	07�ղ�������
	public void taolunzu_Shoucang() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
//	08ȡ���ղ�������
	public void taolunzu_Quxiaoshoucang() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
//	09�鿴�������Ա�б�
	public void taolunzu_Numbers() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
//	10��������������
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
	
//	11ͬ��������������Ϣ
	public void taolunzu_news() {
		action.click(taolunzu_1());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
//	12���������з����ı�����hello
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
	
//	13�鿴�ҵ���Ϣ
	public void myInformation() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	
//	14�鿴����
	public void guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
//	15�鿴��˽����
	public void yinsitiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
//	16�鿴��������
	public void xuanxuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}
	
//	17�˳���ǰ��¼�˺�
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}
		
//	18�鿴��ϵ��lili������
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());	
	}
	
//	19�ղ�lili�����ϵ��
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}
	
//	20��lili���ʼ�
	public void sendEmail() {
		action.click(lili());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		action.clear(btn_email());
	}



}
