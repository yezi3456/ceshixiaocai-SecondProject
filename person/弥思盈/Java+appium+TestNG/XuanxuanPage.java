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
		return driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"注销后，你可以重新登录或者使用其他账户进行登录。 清除本账号相关数据\"]/android.widget.Button[2]");
	}
	
	//1.点击聊天，成功跳转到该页面
	public void liaotian() {
		action.click(liaotian_item());
	}
	
	//2.点击讨论组，成功跳转到该页面
	public void taolunzu() {
		action.click(taolunzu_item());
	}
	
	//3.点击联系人，成功跳转到该页面
	public void lianxiren() {
		action.click(lianxiren_item());
	}
		
	//4.点击我的，成功跳转到该页面
	public void wode() {
		action.click(wode_item());
	}
	
	//5.从首页进入与弥思盈4的对话框，发送yes（该对话框已经创建）
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
	
	//6.收藏与misiying4对话
	public void collwithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
        action.click(collection());
        action.click(return_all());
	}
	
	//7.查看会话misiying4的资料
	public void ziliaowithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
	    action.click(ziliao());
        action.click(return_all());
        action.click(return_all());
	}
	
	//8.同步与misiying4的会话的最近消息
	public void samewithmi4(){
		action.click(liaotian_item());
		action.click(misiying4());
	    action.click(samemi4());
        action.click(return_all());
	}
	
	//9.从首页进入群组fine，发送OK（该群组框已经创建）
	public void talkwithfine() {
		action.click(liaotian_item());
		action.click(fine());
		action.click(talk_shuru());
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.K));
		action.click(enter());
		action.click(return_all());
	}
	
	//10.收藏群组会话fine
	public void collwithfine(){
		action.click(liaotian_item());
		action.click(fine());
		action.click(collection());
        action.click(return_all());
    }
	
	//11.查看群组fine的成员列表
	public void ziliaowithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(ziliao());
        action.click(return_all());
        action.click(return_all());
	}	
	
	//12.对群组fine重命名
	public void renamewithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(rename());
        action.click(return_all());
	}		
	
	//13.同步与群组fine的会话的最近消息
	public void samewithfine(){
		action.click(liaotian_item());
		action.click(fine());
	    action.click(samefine());
        action.click(return_all());
	}	
	
	//14.新建与弥思盈2聊天
	public void makenewmess(){
		action.click(liaotian_item());
		action.click(newmess());
		action.click(clickmi2());
		action.click(clickok());
	}		
	
	//15.新建与弥思盈2和弥思盈3的群组聊天
	public void makenewgroupmess(){
		action.click(liaotian_item());
		action.click(newmess());
		action.click(clickmi2());
		action.click(clickmi3());
		action.click(clickok());
	}		
	
	//16.对联系人进行星标（弥思盈2）
	public void starmi2(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(newstar());
	}		
	
	//17.对联系人取消星标（弥思盈2）
	public void restarmi2(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(renewstar());
	}	
	
	//18.从联系人页面创建与弥思盈2的对话
	public void lianxiren_newtalk(){
		action.click(lianxiren_item());
		action.click(lianxiren_mi2());
		action.click(newtalkmi2());
	}	
	
	//19.查看关于xuanxuan内容
	public void guanyu(){
		action.click(wode_item());
		action.click(guanyu1());
		action.click(guanyu2());
		action.click(guanyu3_close());
	}		
	
	//20.注销登录
	public void zhuxiao_okk(){
		action.click(wode_item());
		action.click(zhuxiao());
		action.click(zhuxiao_ok());
	}			
	
}
