package com.example.demo;

import android.app.Instrumentation;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class uiautomater_xuanxuan {
    Instrumentation mInstrumentation;
    UiDevice mDevice;

    @Before
    public void startUp() throws Exception {

        mInstrumentation = InstrumentationRegistry.getInstrumentation();

        mDevice = UiDevice.getInstance(mInstrumentation);

        mDevice.pressHome();

        boolean status = mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }


        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }


    //  01收藏一个讨论组
    @Test
    public void test_Shoucangtaolunzu() throws InterruptedException{
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("群\n" + "讨论组1\n" + "3人")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("收藏")).click();
    }

    //  02取消收藏讨论组
    @Test
    public void test_Quxiaoshoucangtaolunzu() throws InterruptedException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("群\n" + "讨论组1\n" + "3人")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("取消收藏")).click();
    }

    //  03查看讨论组1中的成员列表
    @Test
    public void test_ListNumbers() throws InterruptedException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("群\n" + "讨论组1\n" + "3人")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("成员列表")).click();
    }

    //  04在讨论组1中发送图片
    @Test
    public void test_Send() throws InterruptedException{
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("群\n" + "讨论组1\n" + "3人")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("me")).click();
    }

    //  05同步讨论组1的最近消息
    @Test
    public void test_Tongbuxiaoxi1() throws InterruptedException {
        mDevice.findObject(By.text("讨论组\n" + "第 2 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("群\n" + "讨论组1\n" + "3人")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("同步最近的消息")).click();
    }

    //  06查看我的信息
    @Test
    public void test_Myinformation() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("Y\n" + "wangyiran\n" + "  @wangyiran\n" + "http://192.168.1.133:11443")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
        scrollable.flingToEnd(10);
    }

    //  07查看关于
    @Test
    public void test_Guanyu() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("关于")).click();
    }

    //  08查看隐私条款
    @Test
    public void test_Yinsitiaokuan() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("关于")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("隐私条款")).click();
    }

    //  09查看喧喧官网
    @Test
    public void test_Xuanxuan() throws InterruptedException{
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("关于")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("http://xuan.im")).click();
    }

    //  10查看联系人lili的资料
    @Test
    public void test_Lianxirenziliao() throws InterruptedException, UiObjectNotFoundException {
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        UiScrollable scrollable = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
        scrollable.flingToEnd(10);
    }

    //  11收藏联系人lili
    @Test
    public void test_Shoucanglianxiren() throws InterruptedException{
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("收藏")).click();
    }

    //  12给lili发消息
    @Test
    public void test_SendMessage() throws InterruptedException{
        mDevice.findObject(By.text("联系人\n" + "第 3 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("开聊")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("me")).click();
    }

    //  13同步与lili的消息
    @Test
    public void test_Tongbuxiaoxi2() throws InterruptedException {
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("同步最近的消息")).click();
    }

    //  14收藏与lili的聊天
    @Test
    public void test_Shoucang() throws InterruptedException{
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("收藏")).click();
    }

    //  15取消收藏与lili的聊天
    @Test
    public void test_Quxiaoshoucang() throws InterruptedException{
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("取消收藏")).click();
    }

    //  16与lili发邮件
    @Test
    public void test_SendEmail() throws InterruptedException{
        mDevice.findObject(By.text("聊天\n" + "第 1 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("L\n" + "lili\n" + "[离线]")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("资料")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("Email\n" + "lililili@163.com")).click();
    }

    //  17退出登录
    @Test
    public void test_quit() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("确认")).click();
    }

}
