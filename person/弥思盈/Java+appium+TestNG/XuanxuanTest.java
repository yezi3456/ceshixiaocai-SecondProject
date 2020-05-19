package edu.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import edu.base.BaseTest;
import edu.pages.XuanxuanPage;

public class XuanxuanTest extends BaseTest{
	XuanxuanPage x;
	 
    @BeforeMethod
	public void login() throws InterruptedException {
	    x=new XuanxuanPage(driver);
	   	Thread.sleep(3000);
	}
    
    
    @Test(priority=1)
	public void test1() throws InterruptedException {
	    x.liaotian();
	   	Thread.sleep(3000);	
	}        
    @Test(priority=2)
	public void test2() throws InterruptedException {
	    x.taolunzu();
	   	Thread.sleep(3000);	
	}
    @Test(priority=3)
	public void test3() throws InterruptedException {
	    x.lianxiren();
	   	Thread.sleep(3000);	
	}
    @Test(priority=4)
	public void test4() throws InterruptedException {
	    x.wode();
	   	Thread.sleep(3000);	
	}
    @Test(priority=5)
	public void test5() throws InterruptedException {
	    x.talkwithmi4();
	   	Thread.sleep(3000);	
	}
    @Test(priority=6)
	public void test6() throws InterruptedException {
	    x.collwithmi4();
	   	Thread.sleep(3000);	
	}
    @Test(priority=7)
	public void test7() throws InterruptedException {
	    x.ziliaowithmi4();
	   	Thread.sleep(3000);	
	}
    @Test(priority=8)
	public void test8() throws InterruptedException {
	    x.samewithmi4();
	   	Thread.sleep(3000);	
	}
    @Test(priority=9)
	public void test9() throws InterruptedException {
	    x.talkwithfine();
	   	Thread.sleep(3000);	
	}
    @Test(priority=10)
	public void test10() throws InterruptedException {
	    x.collwithfine();
	   	Thread.sleep(3000);	
	}
    @Test(priority=11)
	public void test11() throws InterruptedException {
	    x.ziliaowithfine();
	   	Thread.sleep(3000);	
	}
    @Test(priority=12)
	public void test12() throws InterruptedException {
	    x.renamewithfine();
	   	Thread.sleep(3000);	
	}
    @Test(priority=13)
	public void test13() throws InterruptedException {
	    x.samewithfine();
	   	Thread.sleep(3000);	
	}
    @Test(priority=14)
	public void test14() throws InterruptedException {
	    x.makenewmess();
	   	Thread.sleep(3000);	
	}
    @Test(priority=15)
	public void test15() throws InterruptedException {
	    x.makenewgroupmess();
	   	Thread.sleep(3000);	
	}
    @Test(priority=16)
	public void test16() throws InterruptedException {
	    x.starmi2();
	   	Thread.sleep(3000);	
	}
    @Test(priority=17)
	public void test17() throws InterruptedException {
	    x.restarmi2();
	   	Thread.sleep(3000);	
	}
    @Test(priority=18)
	public void test18() throws InterruptedException {
	    x.lianxiren_newtalk();
	   	Thread.sleep(3000);	
	}
    @Test(priority=19)
	public void test19() throws InterruptedException {
	    x.guanyu();
	   	Thread.sleep(3000);	
	}
    @Test(priority=20)
	public void test20() throws InterruptedException {
	    x.zhuxiao_okk();
	   	Thread.sleep(3000);	
	}
}
