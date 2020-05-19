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
	@Test(description="1.��������aaa�з�����Ϣ")
	public void testChataaa() {
		homePage.chataaa();
	}
	@Test(description="2.�ղ�������aaa")
	public void testShoucangaaa() {
		homePage.shoucangaaa();
	}
	@Test(description="3.ȡ���ղ�������aaa")
	public void testCancelShoucangaaa() {
		homePage.cancelshoucangaaa();
	}
	@Test(description="4.��ʾaaa��Ա�б�")
	public void testShowMembersaaa() {
		homePage.showMembers();
	}
	@Test(description="5.������������aaaΪaaaaaa")
	public void testRenameaaa() {
		homePage.rename();
	}
	@Test(description="6.ȡ��������������aaaaaa")
	public void testCancelRename(){
		homePage.cancelRename();
	}
	@Test(description="7.ͬ��������aaaaaa�������Ϣ")
	public void testRefreshaaaaaa(){
		homePage.refresh();
	}
	@Test(description="8.��������aaaaaa�����ղ�����")
	public void testTakepicAndsendaaaaaa() throws InterruptedException{
		homePage.takepictureAndsend();
	}
	@Test(description="9.��������aaaaaa�з���ͼƬ")
	public void testSendPictureaaaaaa() throws InterruptedException{
		homePage.sendPictureInAlbum();
	}
	@Test(description="10.��������aaaaaa��ѡ����lizhe1����")
	public void testChatWithlizhe1() {
		homePage.chatWithlizhe1();
	}
	@Test(description="11.����������bbb")
	public void testCreatebbb() throws InterruptedException {
		homePage.createbbb();
	}
	@Test(description="12.�鿴�ҵ�-���ڲ��ر�")
	public void testMyabout() {
		homePage.myAbout();
	}
	@Test(description="13.�鿴��˽����")
	public void testMyabout_pripol() {
		homePage.myAbout_privacypolicy();
	}
	@Test(description="14.������������")
	public void testMyabout_web() {
		homePage.myAbout_web();
	}
	@Test(description="15.�鿴��¼�û���Ϣ")
	public void testMymessage() {
		homePage.myMessage();
	}
	@Test(description="16.ע��")
	public void testMycancel() {
		homePage.myCancel();
	}
	@Test(description="17.�˳�������")
	public void testExittaolunzu() throws InterruptedException {
		homePage.exittaolunzu();
	}
	@Test(description="18.������lizhe1�����첢����hello")
	public void testCreateChatwithlizhe1() {
		homePage.createChatwithlizhe1();
	}
	@Test(description="19.�鿴lizhe1����")
	public void testLookMateriallizhe1() {
		homePage.lookMaterial();
	}
	@Test(description="20.�ղ���lizhe1������")
	public void testCollectChatwithlizhe1() {
		homePage.collectChat();
	}
}

