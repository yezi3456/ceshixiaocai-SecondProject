package edu.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanPage;

public class XuanTest extends BaseTest{
	 XuanPage xuan;
	    
	    @BeforeMethod
		public void login() throws InterruptedException {
	    	xuan=new XuanPage(driver);
	    	Thread.sleep(3000);
		}
	    
	    
	    
	    @Test(description="1")
		public void test1() {
			xuan.liaotian();
		}
	    @Test(description="2")
		public void test2() {
			xuan.renzixuan2();
		}
	    @Test(description="3")
		public void test3() {
			xuan.xit1();
		}
	    @Test(description="4")
		public void test4() {
			xuan.threeSpot1();
		}
	    @Test(description="5")
		public void test5() {
			xuan.threeSpot2();
		}
	    @Test(description="6")
		public void test6() {
			xuan.threeSpot3();
		}
	    @Test(description="7")
		public void test7() {
			xuan.threeSpot4();
		}
	    @Test(description="8")
		public void test8() {
			xuan.threeSpot5();
		}
	    @Test(description="9")
		public void test9() {
			xuan.threeSpot6();
		}
	    @Test(description="10")
		public void test10() {
			xuan.threeSpot7();
		}
	    @Test(description="11")
		public void test11() {
			xuan.threeSpot8();
		}
	    @Test(description="12")
		public void test12() {
			xuan.threeSpot9();
		}
	    @Test(description="13")
		public void test13() {
			xuan.piazhao1();
		}
	    @Test(description="14")
		public void test14() {
			xuan.piazhao2();
		}
	    @Test(description="15")
		public void test15() {
			xuan.piazhao3();
		}
	    @Test(description="16")
		public void test16() {
			xuan.tupian1();
		}
	    @Test(description="17")
		public void test17() {
			xuan.tupian2();
		}
	    @Test(description="18")
		public void test18() {
			xuan.tupian3();
		}
	    
	    @Test(description="19")
		public void test19() {
			xuan.lianxiren();
		}
	    @Test(description="20")
		public void test20() {
		}
	    
		
	
}
