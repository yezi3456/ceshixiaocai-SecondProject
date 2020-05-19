package com.example.app2;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;

public class Xuanxuan_uiautomator {
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


    //1.点击聊天，讨论组，联系人，我的
    @Test
    public void liaotian() throws InterruptedException {
        mDevice.findObject(By.text("聊天\n"+"第 1 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("讨论组\n"+"第 2 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("联系人\n"+"第 3 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("我的\n"+"第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }

    //2.点击任紫萱2并返回
    @Test
    public void renzixuan2() throws InterruptedException {
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //3.点击xit1-三个点-收藏-返回
    @Test
    public void threeSpot1() throws InterruptedException{
        mDevice.findObject(By.text("群\n"+"xit 1\n"+"3人")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //4.点击xit1-三个点-成员列表-返回-返回
    @Test
    public void threeSpot2() throws InterruptedException{
        mDevice.findObject(By.text("群\n"+"xit 1\n"+"3人")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("成员列表")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //5.点击xit1-三个点-重命名-重命名-返回
    @Test
    public void threeSpot3() throws InterruptedException{
        mDevice.findObject(By.text("群\n"+"xit 1\n"+"3人")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("重命名")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("重命名")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //6.点击xit1-三个点-重命名-取消-返回
    @Test
    public void threeSpot4() throws InterruptedException{
        mDevice.findObject(By.text("群\n"+"xit 1\n"+"3人")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("重命名")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("取消")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //7.点击xit1-三个点-同步最近的消息-返回
    @Test
    public void threeSpot5() throws InterruptedException{
        mDevice.findObject(By.text("群\n"+"xit 1\n"+"3人")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("同步最近的消息")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //8.点击任紫萱2-三个点-收藏-返回
    @Test
    public void threeSpot6() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //9.点击任紫萱2-三个点-资料-返回-返回
    @Test
    public void threeSpot7() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("资料")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //10.点击任紫萱2-三个点-资料-星星-返回-返回
    @Test
    public void threeSpot8() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("资料")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //11.点击任紫萱2-三个点-同步最近的消息-返回
    @Test
    public void threeSpot9() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("显示菜单")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("资料")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("同步最近的消息")).click();
        Thread.sleep(3000);
    }

    //12.点击任紫萱2-图片-拍照-快门-叉号
    @Test
    public void paizhao1() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("拍照")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/cancel_button")).click();
        Thread.sleep(3000);
    }

    //13.点击任紫萱2-图片-拍照-快门-对勾
    @Test
    public void paizhao2() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("拍照")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/done_button")).click();
        Thread.sleep(3000);
    }

    //14.点击任紫萱2-图片-拍照-快门-重新拍照
    @Test
    public void paizhao3() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("拍照")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.camera2:id/retake_button")).click();
        Thread.sleep(3000);
    }

    //15.点击任紫萱2-图片-照片-最近-选择图片
    @Test
    public void tupian1() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.ImageButton")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("最近")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.android.documentsui:id/icon_mime")).click();
        Thread.sleep(3000);
    }

    //16.点击任紫萱2-图片-照片-下载
    @Test
    public void tupian2() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.ImageButton")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("下载")).click();
        Thread.sleep(3000);
    }

    //17.点击任紫萱2-图片-照片-图库-取消
    @Test
    public void tupian3() throws InterruptedException{
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("发送其他内容")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("照片")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.clazz("android.widget.ImageButton")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("图库")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("取消")).click();
        Thread.sleep(3000);
    }

    //18.点击联系人-点击第一个-星星-返回
    @Test
    public void lianxiren() throws InterruptedException{
        mDevice.findObject(By.text("联系人\n"+"第 3 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("任\n" + "任紫萱2\n" + "[离线]")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("收藏")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

    //19.加号-选择第一个联系人-返回
    @Test
    public void jiahao() throws InterruptedException{
        mDevice.findObject(By.text("创建聊天")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("任\n" + "任紫萱2" )).click();
        Thread.sleep(1000);
        mDevice.findObject(By.text("返回")).click();
        Thread.sleep(3000);
    }

}
