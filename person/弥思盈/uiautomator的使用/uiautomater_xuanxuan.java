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
        //��ȡ�豸
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        //����home
        mDevice.pressHome();
        //�ж��Ƿ�����
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("����")).click();
        Thread.sleep(3000);
    }
    
    
    //1.�ղ�����˼ӯ2�ĻỰ
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��\n"+"��˼ӯ2\n"+"[����]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("�ղ�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}
 
    //2.ȡ���ղ�����˼ӯ2�ĻỰ
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��\n"+"��˼ӯ2\n"+"[����]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ȡ���ղ�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}
    
	//3.�鿴�Ự��˼ӯ2������
    @Test
	public void testMembersbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��\n"+"��˼ӯ2\n"+"[����]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}     
    
	//4.ͬ���Ự��˼ӯ2�������Ϣ
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��\n"+"��˼ӯ2\n"+"[����]")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ͬ���������Ϣ")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}    
    
    //5.�½�����˼ӯ3�ĻỰ
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��������")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��\n"+"��˼ӯ3")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.clazz("android.widget.Button")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
   	    Thread.sleep(3000);
	}  
    
    //6.�½�����˼ӯ3����˼ӯ4��Ⱥ��Ự
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("��������")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��\n"+"��˼ӯ3")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��\n"+"��˼ӯ4")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.clazz("android.widget.Button")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}  
    
    //7.�ղ�Ⱥ��Ựfine
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("Ⱥ\n"+"fine\n"+"3��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("�ղ�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}
 
    //8.ȡ���ղ�Ⱥ��Ựfine
    @Test
	public void testShoucangbbb() throws InterruptedException {
	    mDevice.findObject(By.text("Ⱥ\n"+"fine\n"+"3��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ȡ���ղ�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}
    
	//9.�鿴Ⱥ��Ựfine�ĳ�Ա�б�
    @Test
	public void testMembersbbb() throws InterruptedException {
	    mDevice.findObject(By.text("Ⱥ\n"+"fine\n"+"3��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��Ա�б�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}     
    
	//10.ͬ����Ⱥ��Ựfine�������Ϣ
    @Test
	public void testRefreshbbb() throws InterruptedException {
	    mDevice.findObject(By.text("Ⱥ\n"+"fine\n"+"3��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ͬ���������Ϣ")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}        
    
	//11.�˳�������fine
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("Ⱥ\n"+"fine\n"+"3��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("�˳�������")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ȷ��")).click();
	    Thread.sleep(3000);
	}      
    
    //12.�鿴�ҵ�����     
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("��\n"+"��˼ӯ1\n"+"@misiying\n"+"http://192.168.0.109:11443")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	}  
    
    //13.ȷ��ע����¼
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("ע��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ȷ��")).click();
	    Thread.sleep(3000);
	}  
    
    //14.ȡ��ע����¼
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("ע��")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("ȡ��")).click();
	    Thread.sleep(3000);
	} 
    
    //15.�鿴�ҵĵġ����ڡ����ر�
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("�ر�")).click();
	    Thread.sleep(3000);
	} 
    
    //16.�鿴�ҵĵ���˽����
    @Test
	public void testExitaabb() throws InterruptedException {
        mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.text("��ʾ�˵�")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("����")).click();
	    Thread.sleep(3000);
	    mDevice.findObject(By.text("��˽����")).click();
	    Thread.sleep(3000);
	} 
    
    //17.ͨ����ϵ�˶���˼ӯ2����Ϣ
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("��ϵ��\n"+"�� 3����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("��\n"+"��˼ӯ2\n"+"[����]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.clazz("android.view.View")).click();
	    Thread.sleep(3000);
	} 
    
    //18.ͨ����ϵ�˶���˼ӯ4�ղ�
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("��ϵ��\n"+"�� 3����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("��\n"+"��˼ӯ4\n"+"[����]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("�ղ�")).click();
	    Thread.sleep(3000);
	}
    
    //19.ͨ����ϵ�˶���˼ӯ4ȡ���ղ�
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("��ϵ��\n"+"�� 3����ǩ���� 4 ��")).click();
	    Thread.sleep(3000);
        mDevice.findObject(By.text("��\n"+"��˼ӯ4\n"+"[����]")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("ȡ���ղ�")).click();
	    Thread.sleep(3000);
	}
    
    //20.�鿴ϵͳ��Ϣ
    @Test
	public void testExitaabb() throws InterruptedException {
    	mDevice.findObject(By.text("ϵͳ\n"+"������")).click();
	    Thread.sleep(3000);
		mDevice.findObject(By.test("����")).click();
	    Thread.sleep(3000);
	}    
    
    
    
    
 



}
