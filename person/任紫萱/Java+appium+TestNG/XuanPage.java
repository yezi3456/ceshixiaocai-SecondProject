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
		return driver.findElementByXPath("//*[@content-desc='����']");
	}
	
	
	private AndroidElement duigou_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='���']");
	}
	
	private AndroidElement cha_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='ȡ��']");
	}
	
	private AndroidElement chongxin_btn() {
		return driver.findElementByXPath("//android.widget.ImageButton[@content-desc='��������']");
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
		return driver.findElementByXPath("//android.widget.TextView[@content-desc='ȡ��']");
	}
	
	private AndroidElement zuijin_tupian(){
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
	}
	
	
	//1.������죬�����飬��ϵ�ˣ��ҵ�
	public void liaotian(){
		action.click(liaotian_item());
		action.click(taolunzu_item());
		action.click(lianxiren_item());
		action.click(wode_item());
	}
	//2.���������2������
	public void renzixuan2(){
		action.click(renzixuan2_btn());
		action.click(fanhui_btn());
	}
	//3.���xit1�����죬������xuan���ڷ���
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
	//4.���xit1-������-�ղ�-����
	public void threeSpot1(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(shoucang_btn());
        action.click(fanhui_btn());
	}
	//5.���xit1-������-��Ա�б�-����-����
	public void threeSpot2(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chengyuan_btn());
        action.click(fanhui1_btn());
        action.click(fanhui_btn());
	}
	//6.���xit1-������-������-������-����
	public void threeSpot3(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chongmingming_btn());
        action.click(chongmingming1_btn());
        action.click(fanhui_btn());
	}
	//7.���xit1-������-������-ȡ��-����
	public void threeSpot4(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(chongmingming_btn());
        action.click(quxiao_btn());
        action.click(fanhui_btn());
	}
	//8.���xit1-������-ͬ���������Ϣ-����
	public void threeSpot5(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(tongbu_btn());
        action.click(fanhui_btn());
	}
	//9.���������2-������-�ղ�-����
	public void threeSpot6(){
		action.click(renzixuan2_btn());
		action.click(sangedian_btn());
        action.click(shoucang_btn());
        action.click(fanhui_btn());
	}
	//10.���������2-������-����-����-����
	public void threeSpot7(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(ziliao_btn());
        action.click(fanhui2_btn());
        action.click(fanhui_btn());
	}
	//11.���������2-������-����-����-����-����
	public void threeSpot8(){
		action.click(xit1_btn());
		action.click(sangedian_btn());
        action.click(ziliao_btn());
        action.click(xingxing_btn());
        action.click(fanhui2_btn());
        action.click(fanhui_btn());
	}
	//12.���������2-������-ͬ���������Ϣ-����
	public void threeSpot9(){
		action.click(renzixuan2_btn());
		action.click(sangedian_btn());
        action.click(tongbu2_btn());
        action.click(fanhui_btn());
	}
	
	
	//13.���������2-ͼƬ-����-����-���
	public void piazhao1(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(cha_btn());
	}
	//14.���������2-ͼƬ-����-����-�Թ�
	public void piazhao2(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(duigou_btn());
	}
	//15.���������2-ͼƬ-����-����-��������
	public void piazhao3(){
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(paizhao_btn());
		action.click(kuaimen_btn());
		action.click(chongxin_btn());
	}
	
	//16.���������2-ͼƬ-��Ƭ-���-ѡ��ͼƬ
	public void tupian1() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(zuijin());
		action.click(zuijin_tupian());
		action.click(fanhui_btn());
	}
	//17.���������2-ͼƬ-��Ƭ-����
	public void tupian2() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(xiazai());
		
	}
	//18.���������2-ͼƬ-��Ƭ-ͼ��-ȡ��
	public void tupian3() {
		action.click(renzixuan2_btn());
		action.click(tupian_btn());
		action.click(zhaopian_btn());
		action.click(zhaopian_xuanze());
		action.click(tuku());
		action.click(tuku_quxiao());
	}
	
	
	//19.�����ϵ��-�����һ��-����-����
	public void lianxiren(){
		action.click(lianxiren_item());
		action.click(diyi_btn());
		action.click(xingxing2_btn());
		action.click(fanhui3_btn());
	}
	//20.�Ӻ�-ѡ���һ����ϵ��-�Թ�-����
	public void jiahao() {
		action.click(jiahao_btn());
		action.click(jiahao_diyi());
		action.click(duigou1_btn());
		action.click(fanhui_btn());
	}
	
}
