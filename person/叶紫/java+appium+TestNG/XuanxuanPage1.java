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

//	�����鰴ť
	private AndroidElement btn_taolunzu() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
//	�������찴ť
	private AndroidElement btn_create() {
		return driver.findElementByXPath("//*[@text='��������']");
	}
	
//	ѡ���Ա
	private AndroidElement select_number1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
//	ȷ�ϰ�ť
	private AndroidElement btn_ok2() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	
//	������ť
	private AndroidElement btn_ok3() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	��һ��������
	private AndroidElement taolunzu1() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
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
	
	
//	��������ť
	private AndroidElement btn_rename1() {
		return driver.findElementByXPath("//*[@text='������']");
	}
	
//	ͬ����Ϣ��ť
	private AndroidElement btn_news() {
		return driver.findElementByXPath("//*[@text='ͬ���������Ϣ']");
	}	
		
//	������Ϣ�ı���
	private AndroidElement send_new() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
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
	
//	���ڰ�ť
	private AndroidElement btn_yinsitiaokuan() {
		return driver.findElementByXPath("//*[@text='��˽����']");
	}
	
//	��������
	private AndroidElement lianjie() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	
//	��ϵ�˰�ť
	private AndroidElement btn_lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
//	��һ����ϵ��
	private AndroidElement lianxiren() {
		return driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
//	���İ�ť
	private AndroidElement btn_kailiao() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	
//	���ϰ�ť
	private AndroidElement btn_ziliao() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	

	
	
	
	
	
	
//	1.ע����¼
	public void quitXuanxuan() {
		action.click(btn_me());
		action.click(btn_quit());
		action.click(btn_ok1());	
	}
	
//	2.����������
	public void createTaolunzu() {
		action.click(btn_taolunzu());
		action.click(btn_create());
		action.click(select_number1());
		action.click(btn_ok2());
		action.click(btn_ok3());	
	}
	
//	3.�ղ�������
	public void shoucangTaolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_shoucang());
	}
	
//	4.ȡ���ղ�������
	public void quxiao_shoucangTaolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_quxiaoshoucang());
	}
	
//	5.�鿴��Ա�б�
	public void list_numbers() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_listNumbers());
	}
	
//	6.������������
	public void rename_Taolunzu() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_rename());
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		action.click(btn_rename1());
	}
	
//	7.ͬ�������Ϣ
	public void list_news() {
		action.click(taolunzu1());
		action.click(btn_caidan());
		action.click(btn_news());
	}
	
//	8.���������з����ı�����
	public void send_news() {
		action.click(taolunzu1());
		action.click(send_new());
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.C));
		action.click(btn_send());
	}
	
//	9.�鿴������Ϣ
	public void list_Information() {
		action.click(btn_me());
		action.click(btn_Information());
	}
	
//	10.�鿴����
	public void list_guanyu() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
	}
	
//	11.�鿴��˽����
	public void list_yinsitiaokuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(btn_yinsitiaokuan());
	}
	
//	12.�鿴��������
	public void list_xuanxuan() {
		action.click(btn_me());
		action.click(btn_caidan());
		action.click(btn_guanyu());
		action.click(lianjie());
	}
	
//	13.�鿴������ϵ��
	public void list_lianxiren() {
		action.click(btn_lianxiren());
	}
		
//	14.�ղ�һ����ϵ��
	public void shoucanglianxiren() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_shoucang());
	}
	
	
//	15.�鿴��ϵ������
	public void lianxirenInformation() {
		action.click(btn_lianxiren());
		action.click(lianxiren());
		action.click(btn_kailiao());
		action.click(btn_caidan());
		action.click(btn_ziliao());
		
	}
	
	
	


}
