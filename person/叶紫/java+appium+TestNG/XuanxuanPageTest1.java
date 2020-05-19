package edu.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage1;
import edu.pages.LoginPage;
import edu.pages.NoteHomePage;

public class XuanxuanPageTest1 extends BaseTest{
	XuanxuanPage1 homePage;

	@Test(description="1.ע����¼")
	public void test1(){
		homePage=new XuanxuanPage1(driver);
		homePage.quitXuanxuan();		
	}
	
	@Test(description="2.����������")
	public void test2(){
		homePage=new XuanxuanPage1(driver);
		homePage.createTaolunzu();
		
	}
	
	@Test(description="3.�ղ�������")
	public void test3(){
		homePage=new XuanxuanPage1(driver);
		homePage.shoucangTaolunzu();	
	}
	
	@Test(description="4.ȡ���ղ�������")
	public void test4(){
		homePage=new XuanxuanPage1(driver);
		homePage.quxiao_shoucangTaolunzu();	
	}
	
	@Test(description="5.�鿴��Ա�б�")
	public void test5(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_numbers();	
	}
	
	@Test(description="6.������������")
	public void test6(){
		homePage=new XuanxuanPage1(driver);
		homePage.rename_Taolunzu();	
	}

	@Test(description="7.ͬ���������Ϣ")
	public void test7(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_news();
	}
	
	@Test(description="8.���������з����ı�����")
	public void test8(){
		homePage=new XuanxuanPage1(driver);
		homePage.send_news();
	}
	
	@Test(description="9.�鿴������Ϣ")
	public void test9(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_Information();
	}
	
	@Test(description="10.�鿴����")
	public void test10(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_guanyu();
	}
	
	@Test(description="11.�鿴��˽����")
	public void test11(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_yinsitiaokuan();
	}
	
	@Test(description="12.�鿴��������")
	public void test12(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_xuanxuan();
	}
	
	@Test(description="13.�鿴������ϵ��")
	public void test13(){
		homePage=new XuanxuanPage1(driver);
		homePage.list_lianxiren();
	}
	
	@Test(description="14.�ղ�һ����ϵ��")
	public void test14(){
		homePage=new XuanxuanPage1(driver);
		homePage.shoucanglianxiren();
	}
	
	@Test(description="15.�鿴��ϵ������")
	public void test15(){
		homePage=new XuanxuanPage1(driver);
		homePage.lianxirenInformation();
	}
}
