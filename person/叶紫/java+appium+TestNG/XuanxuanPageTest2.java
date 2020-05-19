package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage1;
import edu.pages.XuanxuanPage2;

public class XuanxuanPageTest2 extends BaseTest{
	XuanxuanPage2 homePage;
	
	@Test(description="16.µÇÂ¼ÕËºÅ³É¹¦")
	public void test16() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_success();
	}
	
	@Test(description="17.µÇÂ¼Ê§°ÜÖ®ÓÃ»§Ãû´íÎó")
	public void test17() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail1();
	}
	
	@Test(description="18.µÇÂ¼Ê§°ÜÖ®ÃÜÂë´íÎó")
	public void test18() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail2();
	}
	
	@Test(description="19.µÇÂ¼Ê§°ÜÖ®ÓÃ»§ÃûÎª¿Õ")
	public void test19() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail3();
	}
	
	@Test(description="20.µÇÂ¼Ê§°ÜÖ®ÃÜÂëÎª¿Õ")
	public void test20() throws InterruptedException{
		homePage=new XuanxuanPage2(driver);
		homePage.login_fail4();
	}


}
