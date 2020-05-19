package edu.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.HomePage;
import edu.pages.HomePage_xuanxuan;
import edu.pages.LoginPage;

public class Testcases_xuanxuan  extends BaseTest{
	HomePage_xuanxuan homePage;
	@BeforeMethod
	public void login() throws InterruptedException {
		homePage=new HomePage_xuanxuan(driver);
		Thread.sleep(3000);
	}
	@Test(description="1.在讨论组aaa中发送消息")
	public void testChataaa() {
		homePage.chataaa();
	}
	@Test(description="2.收藏讨论组aaa")
	public void testShoucangaaa() {
		homePage.shoucangaaa();
	}
	@Test(description="3.取消收藏讨论组aaa")
	public void testCancelShoucangaaa() {
		homePage.cancelshoucangaaa();
	}
	@Test(description="4.显示aaa成员列表")
	public void testShowMembersaaa() {
		homePage.showMembers();
	}
	@Test(description="5.重命名讨论组aaa为aaaaaa")
	public void testRenameaaa() {
		homePage.rename();
	}
	@Test(description="6.取消重命名讨论组aaaaaa")
	public void testCancelRename(){
		homePage.cancelRename();
	}
	@Test(description="7.同步讨论组aaaaaa最近的消息")
	public void testRefreshaaaaaa(){
		homePage.refresh();
	}
	@Test(description="8.在讨论组aaaaaa中拍照并发送")
	public void testTakepicAndsendaaaaaa() throws InterruptedException{
		homePage.takepictureAndsend();
	}
	@Test(description="9.在讨论组aaaaaa中发送图片")
	public void testSendPictureaaaaaa() throws InterruptedException{
		homePage.sendPictureInAlbum();
	}
	@Test(description="10.在讨论组aaaaaa中选择与lizhe1聊天")
	public void testChatWithlizhe1() {
		homePage.chatWithlizhe1();
	}
	@Test(description="11.创建讨论组bbb")
	public void testCreatebbb() throws InterruptedException {
		homePage.createbbb();
	}
	@Test(description="12.查看我的-关于并关闭")
	public void testMyabout() {
		homePage.myAbout();
	}
	@Test(description="13.查看隐私条款")
	public void testMyabout_pripol() {
		homePage.myAbout_privacypolicy();
	}
	@Test(description="14.进入喧喧官网")
	public void testMyabout_web() {
		homePage.myAbout_web();
	}
	@Test(description="15.查看登录用户信息")
	public void testMymessage() {
		homePage.myMessage();
	}
	@Test(description="16.注销")
	public void testMycancel() {
		homePage.myCancel();
	}
	@Test(description="17.退出讨论组")
	public void testExittaolunzu() throws InterruptedException {
		homePage.exittaolunzu();
	}
	@Test(description="18.创建与lizhe1的聊天并发送hello")
	public void testCreateChatwithlizhe1() {
		homePage.createChatwithlizhe1();
	}
	@Test(description="19.查看lizhe1资料")
	public void testLookMateriallizhe1() {
		homePage.lookMaterial();
	}
	@Test(description="20.收藏与lizhe1的聊天")
	public void testCollectChatwithlizhe1() {
		homePage.collectChat();
	}
}

