package edu.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage1;
import edu.pages.LoginPage;
import edu.pages.NoteHomePage;

public class XuanxuanPageTest1 extends BaseTest{
	XuanxuanPage1 homePage;

	@Test(description="1.注销登录")
	public void test1(){
		homePage=new XuanxuanPage1(driver);
		homePage.quitXuanxuan();		
	}
	
	@Test(description="2.创建讨论组")
	public void test2(){
		homePage=new XuanxuanPage1(driver);
		homePage.createTaolunzu();
		
	}
	
	@Test(description="3.收藏讨论组")
	public void test3(){
		homePage=new XuanxuanPage1(driver);
		homePage.shoucangTaolunzu();	
	}
	
	@Test(description="4.取消收藏讨论组")
	public void test4(){
		homePage=new XuanxuanPage1(driver);
		homePage.quxiao_shoucangTaolunzu();	
	}
	
	@Test(description="5.查看成员列表")
	public void test5(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_numbers();	
	}
	
	@Test(description="6.重命名讨论组")
	public void test6(){
		homePage=new XuanxuanPage1(driver);
		homePage.rename_Taolunzu();	
	}

	@Test(description="7.同步最近的消息")
	public void test7(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_news();
	}
	
	@Test(description="8.在讨论组中发送文本内容")
	public void test8(){
		homePage=new XuanxuanPage1(driver);
		homePage.send_news();
	}
	
	@Test(description="9.查看个人信息")
	public void test9(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_Information();
	}
	
	@Test(description="10.查看关于")
	public void test10(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_guanyu();
	}
	
	@Test(description="11.查看隐私条款")
	public void test11(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_yinsitiaokuan();
	}
	
	@Test(description="12.查看喧喧官网")
	public void test12(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_xuanxuan();
	}
	
	@Test(description="13.查看所有联系人")
	public void test13(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_lianxiren();
	}
	
	@Test(description="14.收藏一个联系人")
	public void test14(){
		homePage=new XuanxuanPage1(driver);
		homePage.shoucanglianxiren();
	}
	
	@Test(description="15.查看联系人资料")
	public void test15(){
		homePage=new XuanxuanPage1(driver);
		homePage.lianxirenInformation();
	}
}
