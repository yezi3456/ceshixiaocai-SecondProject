package edu.pages;

import java.lang.instrument.Instrumentation;
import java.rmi.RemoteException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.android.uiautomator.core.UiDevice;

public class Test_xuanxuan {
	//work3.2
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
//  1.admin联系人，收藏
//  @Test
//  public void testContent() throws InterruptedException {
//      mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("显示菜单")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("收藏")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("返回")).click();
//      Thread.sleep(3000);
//  }
  //1.收藏讨论组bbb
    @Test
	  public void testShoucangbbb() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("显示菜单")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("收藏")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}
	//2.查看讨论组bbb成员列表
    @Test
	  public void testMembersbbb() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("显示菜单")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("成员列表")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}  
	//3.同步讨论组bbb最新消息
    @Test
	  public void testRefreshbbb() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("显示菜单")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("同步最近的消息")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}
	//4.取消收藏讨论组bbb
    @Test
	  public void testCancelShoucangbbb() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("显示菜单")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("取消收藏")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}
	//5.取消重命名讨论组bbb
    @Test
	  public void testCancelRenamebbb() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("显示菜单")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("重命名")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("取消")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}
	////6.在讨论组bbb拍照并发送
    @Test
	  public void takepictureAndsend() throws InterruptedException {
	  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("发送其他内容")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("拍照")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.res("com.android.camera2:id/done_button")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("返回")).click();
	  Thread.sleep(3000);
	}
	//7.在讨论组bbb中选择与lizhe1聊天
    @Test
	  public void chatWithlizhe1() throws InterruptedException {
		  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("显示菜单")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("成员列表")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("L\n"+"lizhe1\n"+"[在线]")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("开聊")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("返回")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("返回")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("返回")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("返回")).click();
		  Thread.sleep(3000);
	  }
	//8.退出讨论组aabb
    @Test
	  public void testExitaabb() throws InterruptedException {
		  mDevice.findObject(By.text("群\n"+"bbb\n"+"3人")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("显示菜单")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("退出讨论组")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("确认")).click();
		  Thread.sleep(3000);
	}  
	//9.查看我的-关于并关闭
    @Test
	  public void myAbout() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("显示菜单")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("关于")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("关闭")).click();
		  Thread.sleep(3000);
	}  
	//10.查看隐私条款
    @Test
		public void myAbout_privacypolicy() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("显示菜单")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("关于")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("隐私条款")).click();
		  Thread.sleep(3000);
	}
  //11.进入喧喧官网
    @Test
  	public void myAbout_web() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("显示菜单")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("关于")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("http://xuan.im")).click();
		  Thread.sleep(3000);
  	}
  	//12.注销
    @Test
	public void myCancel() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("注销")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("确认")).click();
		  Thread.sleep(3000);
	}
    //13.收藏联系人lizhe1
    @Test
    public void testShoucanglizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[在线]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("显示菜单")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("收藏")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
    }
    //14.查看lizhe1资料
    @Test
    public void testLooklizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[在线]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("显示菜单")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("资料")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
    }
    //15.同步与lizhe1最近的消息
    @Test
    public void testRefreshlizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[在线]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("显示菜单")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("同步最近的消息")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
    }
    //16.在联系人中选择与lizhe2聊天
    @Test
    public void testChatlizhe2() throws InterruptedException {
      mDevice.findObject(By.text("联系人\n"+"第 3 个标签，共 4 个")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("L\n" + "lizhe2\n" + "[在线]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("开聊")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
    }
    //17.取消收藏联系人lizhe1
    @Test
    public void testCancelShoucanglizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[在线]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("显示菜单")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("取消收藏")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("返回")).click();
      Thread.sleep(3000);
    }
    //18.查看登录用户信息
    @Test
    public void myMessage() throws InterruptedException {
		  mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("L\n"+"lizhe3"+"  @lizhe3"+"http://192.168.68.247:11443")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("返回")).click();
		  Thread.sleep(3000);
	}
	
}
