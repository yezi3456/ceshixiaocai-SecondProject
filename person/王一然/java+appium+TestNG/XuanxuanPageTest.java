package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage;

public class XuanxuanPageTest extends BaseTest{
     XuanxuanPage xuanxuan;
	
//  01��¼�ɹ�
	@Test
	public void test_LoginSuccess() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_success();
	}
	
//	02��¼ʧ��-�û�������
	@Test
	public void test_LoginFail1() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail1();
	}
	
//	03��¼ʧ��-�û���Ϊ��
	@Test
	public void test_LoginFail2() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail3();
	}
	
//	04��¼ʧ��-�������
	@Test
	public void test_LoginFail3() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail2();
	}
	
//	05��¼ʧ��-����Ϊ��
	@Test
	public void test_LoginFail4() throws InterruptedException{
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.login_fail4();
	}
	
//	06����������
	@Test
	public void test_createTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Create();
		
	}
		
//	07�ղ�������
	@Test
	public void test_shoucangTaolunzu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Shoucang();	
	}
	
//	08ȡ���ղ�������
	@Test
	public void test_taolunzuQuxiaoshoucang(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Quxiaoshoucang();	
	}
	
//	09�鿴�������Ա�б�
	@Test
	public void test_taolunzuNumbers(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Numbers();	
	}
	
//	10��������������
	@Test
	public void test_taolunzuRename(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_Rename();	
	}

//	11ͬ��������������Ϣ
	@Test
	public void test_taolunzuNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.taolunzu_news();
	}
	
//	12���������з����ı�����hello
	@Test
	public void test_seadNews(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.send_news();
	}
	
//	13�鿴�ҵ���Ϣ
	@Test
	public void test_myInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.myInformation();
	}
	
//	14�鿴����
	@Test
	public void test_guanyu(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.guanyu();
	}
	
//	15�鿴��˽����
	@Test
	public void test_yinsitiaokuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.yinsitiaokuan();
	}
	
//	16�鿴��������
	@Test
	public void test_xuanxuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.xuanxuan();
	}
	
//	17�˳���ǰ��¼�˺�
	@Test
	public void test_quitXuanxuan(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.quitXuanxuan();		
	}
	
//	18�鿴��ϵ��lili������
	@Test
	public void test_lianxirenInformation(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.lianxirenInformation();
	}
	
//	19�ղ�lili�����ϵ��
	@Test
	public void test_shoucanglianxiren(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.shoucanglianxiren();
	}
	
//	20��lili���ʼ�
	@Test
	public void test_sendEmail(){
		xuanxuan=new XuanxuanPage(driver);
		xuanxuan.sendEmail();
	}


}
