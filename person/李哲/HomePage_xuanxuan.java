package edu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sun.prism.Material;
import com.sun.xml.internal.bind.v2.model.core.ID;

import edu.util.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import javafx.scene.input.KeyCodeCombination;


public class HomePage_xuanxuan {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePage_xuanxuan(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
		this.action = new BaseAction(driver);
	}
	//1.��������aaa�з�����ϢHELLO
	public void chataaa() {
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
//		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
		///
//		driver.pressKey(new KeyEvent(AndroidKey.SLASH));
		//;
//		driver.pressKey(new KeyEvent(AndroidKey.SEMICOLON));
		//.
//		driver.pressKey(new KeyEvent(AndroidKey.PERIOD));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		action.click(btn_send());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	private AndroidElement btn_send() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	private AndroidElement sendMessage() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	//2.�ղ�������aaa
	public void shoucangaaa(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_shoucang());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_menu() {
		return driver.findElementByXPath("//*[@text='��ʾ�˵�']");
	}
	private AndroidElement btn_shoucang() {
		return driver.findElementByXPath("//*[@text='�ղ�']");
	}
	//3.ȡ���ղ�������aaa
	public void cancelshoucangaaa(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_cancelshoucang());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_cancelshoucang() {
		return driver.findElementByXPath("//*[@text='ȡ���ղ�']");
	}
	//4.��ʾaaa��Ա�б�
	public void showMembers(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_showmembers());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_showmembers() {
		return driver.findElementByXPath("//*[@text='��Ա�б�']");
	}
	//5.������������aaaΪaaaaaa
	public void rename(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_rename());
		action.click(EditRename());
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		action.click(btn_surerename());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_rename() {
		return driver.findElementByXPath("//*[@text='������']");
	}
	private AndroidElement EditRename() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	private AndroidElement btn_surerename() {
		return driver.findElementByXPath("//*[@text='������']");
	}
	//6.ȡ��������������aaaaaa
	public void cancelRename(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_rename());
		action.click(btn_cancelrename());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_cancelrename() {
		return driver.findElementByXPath("//*[@text='ȡ��']");
	}
	//7.ͬ��������aaaaaa�������Ϣ
	public void refresh(){
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_refresh());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement btn_refresh() {
		return driver.findElementByXPath("//*[@text='ͬ���������Ϣ']");
	}
	//8.��������aaaaaa�����ղ�����
	public void takepictureAndsend() throws InterruptedException{
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(sendPicture());
		action.click(takePicture());
		action.click(btn_shutter());
		action.click(btn_done());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement sendPicture() {
		return driver.findElementByXPath("//*[@text='������������']");
	}
	private AndroidElement takePicture() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	private AndroidElement btn_shutter() {
		return driver.findElementById("com.android.camera2:id/shutter_button");
	}
	private AndroidElement btn_done() {
		return driver.findElementById("com.android.camera2:id/done_button");
	}
	//9.��������aaaaaa�з���ͼƬ

	public void sendPictureInAlbum() throws InterruptedException{
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(sendPicture());
		action.click(Album());
//		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView"));
//		Thread.sleep(3000);
//		action.click(driver.findElementById("com.android.gallery3d:id/gl_root_view"));
//		action.click(driver.findElementById("com.android.gallery3d:id/gl_root_view"));
//		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
	    action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement Album() {
		return driver.findElementByXPath("//*[@text='��Ƭ']");
	}
	
	//10.��������aaaaaa��ѡ����lizhe1����
	public void chatWithlizhe1(){
//		action.click(taolunzu());
		action.click(createChat());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]"));
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement taolunzu() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]");
	}
	private AndroidElement createChat() {
		return driver.findElementByXPath("//*[@text='��������']");
		
	}
	//11.����������bbb
	public void createbbb() throws InterruptedException{
//		action.click(taolunzu());
		action.click(createChat());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]"));
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]"));
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
		action.click(driver.findElementByXPath("//*[@text='��������������']"));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		driver.pressKey(new KeyEvent(AndroidKey.B));
		action.click(driver.findElementByXPath("//*[@text='����']"));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	//12.�鿴�ҵ�-���ڲ��ر�
	public void myAbout(){
		action.click(my());
		action.click(showMenu());
		action.click(my_about());
		action.click(my_close());
	}
	private AndroidElement my() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]");
	}
	private AndroidElement showMenu() {
		return driver.findElementByXPath("//*[@text='��ʾ�˵�']");
	}
	private AndroidElement my_about() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	private AndroidElement my_close() {
		return driver.findElementByXPath("//*[@text='�ر�']");
	}
	//13.�鿴��˽����
	public void myAbout_privacypolicy(){
		action.click(my());
		action.click(showMenu());
		action.click(my_about());
		action.click(my_privacypolicy());
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
	private AndroidElement my_privacypolicy() {
		return driver.findElementByXPath("//*[@text='��˽����']");
	}
	//14.������������
	public void myAbout_web(){
		action.click(my());
		action.click(showMenu());
		action.click(my_about());
		action.click(my_web());
	}
	private AndroidElement my_web() {
		return driver.findElementByXPath("//*[@text='http://xuan.im']");
	}
	//15.�鿴��¼�û���Ϣ
	public void myMessage(){
		action.click(my());
		action.click(my_message());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement my_message() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View");
	}
	//16.ע��
	public void myCancel(){
		action.click(my());
		action.click(my_cancel());
		action.click(my_cancelSure());
	}
	private AndroidElement my_cancel() {
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	private AndroidElement my_cancelSure() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}

	//17.�˳�������
	public void exittaolunzu() throws InterruptedException{
		action.click(taolunzu());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(btn_exit());
		action.click(exit_sure());
		Thread.sleep(3000);
	}
	private AndroidElement btn_exit() {
		return driver.findElementByXPath("//*[@text='�˳�������']");
	}
	private AndroidElement exit_sure() {
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	private AndroidElement liaotian() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]");
	}
	//18.������lizhe1����
	
	public void createChatwithlizhe1(){
		action.click(liaotian());
		action.click(createChat());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]"));
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		action.click(sendMessage());
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		action.click(btn_send());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	//19.�鿴lizhe1����
	public void lookMaterial(){
		action.click(liaotian());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(material());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement material() {
		return driver.findElementByXPath("//*[@text='����']");
	}
	//20.�ղ���lizhe1������
	public void collectChat(){
		action.click(liaotian());
		action.click(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]"));
		action.click(btn_menu());
		action.click(collect());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	private AndroidElement collect() {
		return driver.findElementByXPath("//*[@text='�ղ�']");
	}
	
	
	
	
	

}
