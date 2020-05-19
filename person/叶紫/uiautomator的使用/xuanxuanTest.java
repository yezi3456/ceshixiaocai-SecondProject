package com.example.mytest;

import android.app.Instrumentation;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class xuanxuanTest {
    Instrumentation instrumentation;
    UiDevice mD;

    @Before
    public void startUp() throws Exception {
        //连接
        instrumentation = InstrumentationRegistry.getInstrumentation();
//        获得连接设备
        mD = UiDevice.getInstance(instrumentation);
//        按键home
        mD.pressHome();
//        判断是否锁屏
        boolean status = mD.isScreenOn();
        if(!status){
            mD.wakeUp();
        }

        Thread.sleep(2000);
        mD.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }

    //  1.注销登录
    @Test
    public void test1() throws InterruptedException {
       mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
       mD.findObject(By.text("注销")).click();
        Thread.sleep(2000);
       mD.findObject(By.text("确认")).click();
    }

    //  2.查看个人信息
    @Test
    public void test2() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("Y\n" + "yezi\n" + "  @yezi\n" + "http://192.168.1.138:11443")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
        scrollable.flingToEnd(5);
    }

    //  3.查看关于
    @Test
    public void test3() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("关于")).click();
        Thread.sleep(5000);
        mD.findObject(By.text("关闭")).click();
    }

    //  4.查看隐私条款
    @Test
    public void test4() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("关于")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("隐私条款")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.webkit.WebView"));
        scrollable.flingToEnd(20);
    }

    //  5.查看喧喧官网
    @Test
    public void test5() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("关于")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("http://xuan.im")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.webkit.WebView"));
        scrollable.flingToEnd(20);
    }

    //  6.收藏第一个讨论组
    @Test
    public void test6() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("群\n" + "111aaa\n" + "3人")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("收藏")).click();
    }

    //  7.查看讨论组的成员列表
    @Test
    public void test7() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("群\n" + "111aaa\n" + "3人")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("成员列表")).click();
    }

    //  8.同步讨论组最近的消息
    @Test
    public void test8() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("群\n" + "111aaa\n" + "3人")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("同步最近的消息")).click();
    }

    //  9.在讨论组发送图片
    @Test
    public void test9() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("群\n" + "111aaa\n" + "3人")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("发送其他内容")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("照片")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("5月17日")).click();
    }

    //  10.查看所有联系人
    @Test
    public void test10() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
    }

    //  11.查看联系人的资料
    @Test
    public void test11() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
        scrollable.flingToEnd(5);
    }

    //  12.收藏联系人
    @Test
    public void test12() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("收藏")).click();
    }

    //  13.和一个联系人发消息
    @Test
    public void test13() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("开聊")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("发送其他内容")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("照片")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("5月17日")).click();
    }

    //  14.同步与一个联系人的消息
    @Test
    public void test14() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("同步最近的消息")).click();
    }

    //  15.查看已聊天对象
    @Test
    public void test15() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
    }

    //  16.收藏与联系人的聊天
    @Test
    public void test16() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("收藏")).click();
    }

    //  17.取消收藏与联系人的聊天
    @Test
    public void test17() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("取消收藏")).click();
    }

    //  18.取消收藏讨论组
    @Test
    public void test18() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("群\n" + "111aaa\n" + "3人")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("取消收藏")).click();
    }

    //  19.与联系人发邮件
    @Test
    public void test19() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("X\n" + "xiaofeifei\n" + "[离线]")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("资料")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("Email\n" + "yyyzzz126@126.com")).click();
    }

    //  20.注销登录之后在重新登录
    @Test
    public void test20() throws InterruptedException, UiObjectNotFoundException {
        mD.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("注销")).click();
        Thread.sleep(2000);
        mD.findObject(By.text("确认")).click();
        Thread.sleep(5000);
        mD.findObject(By.text("登录")).click();
    }















}
