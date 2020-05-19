package edu.pages;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;


//import java.lang.instrument.Instrumentation;
//import java.rmi.RemoteException;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.android.uiautomator.core.UiDevice;

public class uiautomater_xuanxuan {
    Instrumentation mInstrumentation;
    UiDevice mDevice;
    
    @Before
    public void startup() throws RemoteException, InterruptedException {
        //获取设备
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        //按键home
        mDevice.pressHome();
        //判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }
    
    
    //1.收藏与弥思盈2的会话
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("弥\n"+"弥思盈2\n"+"[离线]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("收藏")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}
 
    //2.取消收藏与弥思盈2的会话
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("弥\n"+"弥思盈2\n"+"[离线]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("取消收藏")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}
    
	//3.查看会话弥思盈2的资料
    @Test
	public void testMembersbbb() throws InterruptedException {
	    mDevice.findObject(By.text("弥\n"+"弥思盈2\n"+"[离线]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("资料")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}     
    
	//4.同步会话弥思盈2最近的消息
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("弥\n"+"弥思盈2\n"+"[离线]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("同步最近的消息")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}    
    
    //5.新建与弥思盈3的会话
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("创建聊天")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("弥\n"+"弥思盈3")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.clazz("android.widget.Button")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
   	    Thread.sleep(3000);
	}  
    
    //6.新建与弥思盈3、弥思盈4的群组会话
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("创建聊天")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("弥\n"+"弥思盈3")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("弥\n"+"弥思盈4")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.clazz("android.widget.Button")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}  
    
    //7.收藏群组会话fine
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("群\n"+"fine\n"+"3人")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("收藏")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}
 
    //8.取消收藏群组会话fine
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("群\n"+"fine\n"+"3人")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("取消收藏")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}
    
	//9.查看群组会话fine的成员列表
    @Test
	public void testMembersbbb() throws InterruptedException {
	    mDevice.findObject(By.text("群\n"+"fine\n"+"3人")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("成员列表")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}     
    
	//10.同步与群组会话fine最近的消息
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("群\n"+"fine\n"+"3人")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("同步最近的消息")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}        
    
	//11.退出讨论组fine
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("群\n"+"fine\n"+"3人")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("退出讨论组")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("确认")).click();
	    Thread.sleep(3000);
	}      
    
    //12.查看我的内容     
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("弥\n"+"弥思盈1\n"+"@misiying\n"+"http://192.168.0.109:11443")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("返回")).click();
	    Thread.sleep(3000);
	}  
    
    //13.确认注销登录
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("注销")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("确认")).click();
	    Thread.sleep(3000);
	}  
    
    //14.取消注销登录
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("注销")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("取消")).click();
	    Thread.sleep(3000);
	} 
    
    //15.查看我的的“关于”并关闭
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("关于")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("关闭")).click();
	    Thread.sleep(3000);
	} 
    
    //16.查看我的的隐私条款
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("显示菜单")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("关于")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("隐私条款")).click();
	    Thread.sleep(3000);
	} 
    
    //17.通过联系人对弥思盈2发消息
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("联系人\n"+"第 3个标签，共 4 个")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("弥\n"+"弥思盈2\n"+"[离线]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.clazz("android.view.View")).click();
	    Thread.sleep(3000);
	} 
    
    //18.通过联系人对弥思盈4收藏
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("联系人\n"+"第 3个标签，共 4 个")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("弥\n"+"弥思盈4\n"+"[离线]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("收藏")).click();
	    Thread.sleep(3000);
	}
    
    //19.通过联系人对弥思盈4取消收藏
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("联系人\n"+"第 3个标签，共 4 个")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("弥\n"+"弥思盈4\n"+"[离线]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("取消收藏")).click();
	    Thread.sleep(3000);
	}
    
    //20.查看系统消息
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("系统\n"+"所有人")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("返回")).click();
	    Thread.sleep(3000);
	}    
    
    
    
    
 



}
