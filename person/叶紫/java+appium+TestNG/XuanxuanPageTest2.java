package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage1;
import edu.pages.XuanxuanPage2;

public class XuanxuanPageTest2 extends BaseTest{
	XuanxuanPage2 homePage;
	
	@Test(description="16.��¼�˺ųɹ�")
	public void test16() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_success();
	}
	
	@Test(description="17.��¼ʧ��֮�û�������")
	public void test17() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail1();
	}
	
	@Test(description="18.��¼ʧ��֮�������")
	public void test18() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail2();
	}
	
	@Test(description="19.��¼ʧ��֮�û���Ϊ��")
	public void test19() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail3();
	}
	
	@Test(description="20.��¼ʧ��֮����Ϊ��")
	public void test20() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail4();
	}


}
