package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidTouchAction;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class XuanxuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public XuanxuanPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement liaotian_item() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]");
	}
	
	private AndroidElement taolunzu_item() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	
	private AndroidElement lianxiren_item() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]");
	}
	
	private AndroidElement wode_item() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]");
	}
	
	private AndroidElement misiying4() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]\r\n");
	}

	private AndroidElement talk_shuru() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement enter() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]\r\n" + 
				"");
	}
	
	private AndroidElement return_all() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]\r\n");
	}
	
	private AndroidElement collection() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]\r\n");
	}
	
	private AndroidElement ziliao() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]\r\n");
	}
	
	private AndroidElement samemi4() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]\r\n");
	}
	
	private AndroidElement fine() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]\r\n");
	}
	
	private AndroidElement rename() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]\r\n");
	}
	
	private AndroidElement renameok() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText/android.widget.Button[2]");
	}
	
	private AndroidElement samefine() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]\r\n");
	}
	
	private AndroidElement newmess() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button\r\n");
	}
	
	private AndroidElement clickmi2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]");
	}
	
	private AndroidElement clickok() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement clickmi3() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]\r\n");
	}
	
	private AndroidElement lianxiren_mi2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]\r\n" + 
				"");
	}
	
	private AndroidElement newstar() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]\r\n" + 
				"");
	}
	
	private AndroidElement renewstar() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]\r\n" + 
				"");
	}
	
	private AndroidElement newtalkmi2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View\r\n" + 
				"");
	}

	private AndroidElement guanyu1() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	}
	
	private AndroidElement guanyu2() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
	}
	
	private AndroidElement guanyu3_close() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView/android.widget.Button[3]");
	}
	
	private AndroidElement zhuxiao() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\r\n" + 
				"");
	}
	
	private AndroidElement zhuxiao_ok() {
		return driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"ע������������µ�¼����ʹ�������˻����е�¼�� ������˺��������\"]/android.widget.Button[2]");
	}
	
	//1.������죬�ɹ���ת����ҳ��
	public void liaotian() {
		action.click(liaotian_item());
	}
	
	//2.��������飬�ɹ���ת����ҳ��
	public void taolunzu() {
		action.click(taolunzu_item());
	}
	
	//3.�����ϵ�ˣ��ɹ���ת����ҳ��
	public void lianxiren() {
		action.click(lianxiren_item());
	}
		
	//4.����ҵģ��ɹ���ת����ҳ��
	public void wode() {
		action.click(wode_item());
	}
	
	//5.����ҳ��������˼ӯ4�ĶԻ��򣬷���yes���öԻ����Ѿ�������
	public void talkwithmi4() {
		action.click(liaotian_item());
		action.click(misiying4());
		action.click(talk_shuru());
		driver.pressKey(new KeyEvent(AndroidKey.Y));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.S));
		action.click(enter());
		action.click(return_all());
	}
	
	//6.�ղ���misiying4�Ի�
	public void collwithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
        action.click(collection());
        action.click(return_all());
	}
	
	//7.�鿴�Ựmisiying4������
	public void ziliaowithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
	    action.click(ziliao());
        action.click(return_all());
        action.click(return_all());
	}
	
	//8.ͬ����misiying4�ĻỰ�������Ϣ
	public void samewithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
	    action.click(samemi4());
        action.click(return_all());
	}
	
	//9.����ҳ����Ⱥ��fine������OK����Ⱥ����Ѿ�������
	public void talkwithfine() {
		action.click(liaotian_item());
		action.click(fine());
		action.click(talk_shuru());
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.K));
		action.click(enter());
		action.click(return_all());
	}
	
	//10.�ղ�Ⱥ��Ựfine
	public void collwithfine(){
		action.click(liaotian_item());
		action.click(fine());
		action.click(collection());
        action.click(return_all());
    }
	
	//11.�鿴Ⱥ��fine�ĳ�Ա�б�
	public void ziliaowithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(ziliao());
        action.click(return_all());
        action.click(return_all());
	}	
	
	//12.��Ⱥ��fine������
	public void renamewithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(rename());
        action.click(return_all());
	}		
	
	//13.ͬ����Ⱥ��fine�ĻỰ�������Ϣ
	public void samewithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(samefine());
        action.click(return_all());
	}	
	
	//14.�½�����˼ӯ2����
	public void makenewmess(){
		action.click(liaotian_item());
		action.click(newmess());
		action.click(clickmi2());
		action.click(clickok());
	}		
	
	//15.�½�����˼ӯ2����˼ӯ3��Ⱥ������
	public void makenewgroupmess(){
		action.click(liaotian_item());
		action.click(newmess());
		action.click(clickmi2());
		action.click(clickmi3());
		action.click(clickok());
	}		
	
	//16.����ϵ�˽����Ǳ꣨��˼ӯ2��
	public void starmi2(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(newstar());
	}		
	
	//17.����ϵ��ȡ���Ǳ꣨��˼ӯ2��
	public void restarmi2(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(renewstar());
	}	
	
	//18.����ϵ��ҳ�洴������˼ӯ2�ĶԻ�
	public void lianxiren_newtalk(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(newtalkmi2());
	}	
	
	//19.�鿴����xuanxuan����
	public void guanyu(){
		action.click(wode_item());
		action.click(guanyu1());
		action.click(guanyu2());
		action.click(guanyu3_close());
	}		
	
	//20.ע����¼
	public void zhuxiao_okk(){
		action.click(wode_item());
		action.click(zhuxiao());
		action.click(zhuxiao_ok());
	}			
	
}
