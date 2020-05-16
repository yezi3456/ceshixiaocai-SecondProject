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


public class XuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public XuanPage(AndroidDriver<AndroidElement> driver) {
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

	
	private AndroidElement renzixuan2_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement xit1_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement admin_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]");
	}
	
	private AndroidElement xitong_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]");
	}
	
	
	private AndroidElement jiahao_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	}
	
	private AndroidElement jiahao_diyi() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement duigou1_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement renzixuan2_shurukan() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement xit1_shurukan() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	
	private AndroidElement fasong_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
	}
	
	private AndroidElement tupian_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
	}
	
	
	private AndroidElement zhaopian_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	
	private AndroidElement zhaopian_xuanze() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	}
	
	private AndroidElement paizhao_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement kuaimen_btn() {
		return driver.findElementByXPath("//*[@content-desc='快门']");
	}
	
	
	private AndroidElement duigou_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='完成']");
	}
	
	private AndroidElement cha_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='取消']");
	}
	
	private AndroidElement chongxin_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='重新拍摄']");
	}
	
	private AndroidElement fanhui_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]");
	}
	

	private AndroidElement sangedian_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	

	private AndroidElement shoucang_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
	}
	                                 

	private AndroidElement chengyuan_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement fanhui1_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
	}
	
	
	private AndroidElement chongmingming_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	private AndroidElement chongmingming1_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText/android.widget.Button[2]");
	}
	
	private AndroidElement quxiao_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText/android.widget.Button[1]");
	}
	
	private AndroidElement tongbu_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]");
	}
	
	
	private AndroidElement ziliao_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}
	
	private AndroidElement fanhui2_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[1]");
	}
	
	private AndroidElement xingxing_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement tongbu2_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]");
	}
	
	private AndroidElement fanhui3_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[1]");
	}
	
	private AndroidElement xingxing2_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[2]");
	}
	
	private AndroidElement xiaoxinfeng_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.Button[1]");
	}
	
	

	private AndroidElement diyi_btn() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	
	
	private AndroidElement tuku() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView");
	}
	
	private AndroidElement zuijin() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
	}
	
	private AndroidElement xiazai() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
	}
	
	private AndroidElement tuku_quxiao() {
		return driver.findElementByXPath("//android.widget.TextView[@content-desc='取消']");
	}
	
	private AndroidElement zuijin_tupian(){
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
	}
	
	
	//1.点击聊天，讨论组，联系人，我的
	public void liaotian(){
		action.click(liaotian_item());
		action.click(taolunzu_item());
		action.click(lianxiren_item());
		action.click(wode_item());
	}
	//2.点击任紫萱2并返回
	public void renzixuan2(){
		action.click(renzixuan2_btn());
		action.click(fanhui_btn());
	}
	//3.点击xit1的聊天，并发送xuan，在返回
	public void xit1(){
		action.click(xit1_btn());
		action.click(xit1_shurukan());
		driver.pressKey(new KeyEvent(AndroidKey.X));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.N));
        action.click(fasong_btn());
        action.click(fanhui_btn());
	}
	//4.点击xit1-三个点-收藏-返回
	public void threeSpot1(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(shoucang_btn());
        action.click(fanhui_btn());
	}
	//5.点击xit1-三个点-成员列表-返回-返回
	public void threeSpot2(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chengyuan_btn());
        action.click(fanhui1_btn());
        action.click(fanhui_btn());
	}
	//6.点击xit1-三个点-重命名-重命名-返回
	public void threeSpot3(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chongmingming_btn());
        action.click(chongmingming1_btn());
        action.click(fanhui_btn());
	}
	//7.点击xit1-三个点-重命名-取消-返回
	public void threeSpot4(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chongmingming_btn());
        action.click(quxiao_btn());
        action.click(fanhui_btn());
	}
	//8.点击xit1-三个点-同步最近的消息-返回
	public void threeSpot5(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(tongbu_btn());
        action.click(fanhui_btn());
	}
	//9.点击任紫萱2-三个点-收藏-返回
	public void threeSpot6(){
		action.click(renzixuan2_btn());
		action.click(sangedian_btn());
        action.click(shoucang_btn());
        action.click(fanhui_btn());
	}
	//10.点击任紫萱2-三个点-资料-返回-返回
	public void threeSpot7(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(ziliao_btn());
        action.click(fanhui2_btn());
        action.click(fanhui_btn());
	}
	//11.点击任紫萱2-三个点-资料-星星-返回-返回
	public void threeSpot8(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(ziliao_btn());
        action.click(xingxing_btn());
        action.click(fanhui2_btn());
        action.click(fanhui_btn());
	}
	//12.点击任紫萱2-三个点-同步最近的消息-返回
	public void threeSpot9(){
		action.click(renzixuan2_btn());
		action.click(sangedian_btn());
        action.click(tongbu2_btn());
        action.click(fanhui_btn());
	}
	
	
	//13.点击任紫萱2-图片-拍照-快门-叉号
	public void piazhao1(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(cha_btn());
	}
	//14.点击任紫萱2-图片-拍照-快门-对勾
	public void piazhao2(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(duigou_btn());
	}
	//15.点击任紫萱2-图片-拍照-快门-重新拍照
	public void piazhao3(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(chongxin_btn());
	}
	
	//16.点击任紫萱2-图片-照片-最近-选择图片
	public void tupian1() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(zuijin());
		action.click(zuijin_tupian());
		action.click(fanhui_btn());
	}
	//17.点击任紫萱2-图片-照片-下载
	public void tupian2() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(xiazai());
		
	}
	//18.点击任紫萱2-图片-照片-图库-取消
	public void tupian3() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(tuku());
		action.click(tuku_quxiao());
	}
	
	
	//19.点击联系人-点击第一个-星星-返回
	public void lianxiren(){
		action.click(lianxiren_item());
		action.click(diyi_btn());
		action.click(xingxing2_btn());
		action.click(fanhui3_btn());
	}
	//20.加号-选择第一个联系人-对勾-返回
	public void jiahao() {
		action.click(jiahao_btn());
		action.click(jiahao_diyi());
		action.click(duigou1_btn());
		action.click(fanhui_btn());
	}
	
}
