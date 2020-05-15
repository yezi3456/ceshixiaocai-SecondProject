package com.example.app2;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;

public class XuanxuanDemo {
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
    
//    1.admin联系人，收藏
    @Test
    public void testContent() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    2.admin联系人，取消收藏
    @Test
    public void testNoContent() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    3.admin联系人，同步消息
    @Test
    public void testSyncmessage() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("同步最近的消息")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    4.admin联系人，资料
    @Test
    public void testInformation() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
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

//    5.admin联系人，照片
    @Test
    public void testAlbum() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.android.documentsui:id/line2")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    6.admin联系人，拍照，发出
    @Test
    public void testPhotograph() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
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

    //    7.admin联系人，拍照，取消
    @Test
    public void testPhotographCancel() throws InterruptedException {
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("拍照")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.android.camera2:id/cancel_button")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }



//    8.讨论组，系统,收藏

    @Test
    public void testSystemContent() throws InterruptedException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("系统\n" + "所有人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    9.讨论组，系统,取消收藏

    @Test
    public void testSystemNoContent() throws InterruptedException {
        mDevice.findObject(By.text("系统\n" + "所有人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    10.讨论组，系统,同步消息

    @Test
    public void testSystemSyncmessage() throws InterruptedException {
        mDevice.findObject(By.text("系统\n" + "所有人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("同步最近的消息")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    11.讨论组，系统,成员列表

    @Test
    public void testSystemList() throws InterruptedException {
        mDevice.findObject(By.text("系统\n" + "所有人")).click();
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

    //    12.讨论组，系统,成员列表,私聊

    @Test
    public void testSystemListSend() throws InterruptedException {
        mDevice.findObject(By.text("系统\n" + "所有人")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("成员列表")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" + "admin\n" + "[离线]")).click();
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

//    重命名

    //    13.联系人，建组,返回
    @Test
    public void testCreatGroup() throws InterruptedException {
        mDevice.findObject(By.text("创建聊天")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" + "admin")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("王\n" + "王立雨3")).click();
        Thread.sleep(3000);
//        mDevice.findObject(By.clazz("android.widget.Button")).click();
//        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }


    //    14.我的，关于

    @Test
    public void testMiAbout() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("关于")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("关闭")).click();
        Thread.sleep(3000);
    }

    //    15.我的，信息

    @Test
    public void testMiInformation() throws InterruptedException {
        mDevice.findObject(By.text("王\n" + "王立雨\n" + "  @wangliyu\n" + "http://192.168.43.105:11443")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    16.我的，发邮件

    @Test
    public void testMiMail() throws InterruptedException {
        mDevice.findObject(By.text("王\n" + "王立雨\n" + "  @wangliyu\n" + "http://192.168.43.105:11443")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("Email\n" + "11@qq.com")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    17.我的，注销，取消

    @Test
    public void testMiOut() throws InterruptedException {
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("取消")).click();
        Thread.sleep(3000);
    }

    //    18.我的，注销，确定

    @Test
    public void testMiOutOk() throws InterruptedException {
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("确定")).click();
        Thread.sleep(3000);
    }

    //    19.联系人，信息，收藏

    @Test
    public void testContacts() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("王\n" + "王立雨3\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    20.联系人，信息，收藏

    @Test
    public void testNoContacts() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("王\n" + "王立雨3\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //    21.联系人，信息，开聊

    @Test
    public void testTalk() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("王\n" + "王立雨3\n" + "[离线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("开聊")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }






}
