package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage;

public class XuanxuanPageTest extends BaseTest{
     XuanxuanPage xuanxuan;
	
//  01登录成功
	@Test
	public void test_LoginSuccess() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_success();
	}
	
//	02登录失败-用户名错误
	@Test
	public void test_LoginFail1() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail1();
	}
	
//	03登录失败-用户名为空
	@Test
	public void test_LoginFail2() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail3();
	}
	
//	04登录失败-密码错误
	@Test
	public void test_LoginFail3() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail2();
	}
	
//	05登录失败-密码为空
	@Test
	public void test_LoginFail4() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail4();
	}
	
//	06创建讨论组
	@Test
	public void test_createTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Create();
		
	}
		
//	07收藏讨论组
	@Test
	public void test_shoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Shoucang();	
	}
	
//	08取消收藏讨论组
	@Test
	public void test_taolunzuQuxiaoshoucang(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Quxiaoshoucang();	
	}
	
//	09查看讨论组成员列表
	@Test
	public void test_taolunzuNumbers(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Numbers();	
	}
	
//	10给讨论组重命名
	@Test
	public void test_taolunzuRename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Rename();	
	}

//	11同步讨论组的最近消息
	@Test
	public void test_taolunzuNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_news();
	}
	
//	12在讨论组中发送文本内容hello
	@Test
	public void test_seadNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.send_news();
	}
	
//	13查看我的信息
	@Test
	public void test_myInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.myInformation();
	}
	
//	14查看关于
	@Test
	public void test_guanyu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.guanyu();
	}
	
//	15查看隐私条款
	@Test
	public void test_yinsitiaokuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.yinsitiaokuan();
	}
	
//	16查看喧喧官网
	@Test
	public void test_xuanxuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.xuanxuan();
	}
	
//	17退出当前登录账号
	@Test
	public void test_quitXuanxuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.quitXuanxuan();		
	}
	
//	18查看联系人lili的资料
	@Test
	public void test_lianxirenInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.lianxirenInformation();
	}
	
//	19收藏lili这个联系人
	@Test
	public void test_shoucanglianxiren(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.shoucanglianxiren();
	}
	
//	20与lili发邮件
	@Test
	public void test_sendEmail(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendEmail();
	}


}
