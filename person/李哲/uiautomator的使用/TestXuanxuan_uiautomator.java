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
//  1.admin��ϵ�ˣ��ղ�
//  @Test
//  public void testContent() throws InterruptedException {
//      mDevice.findObject(By.text("A\n" + "admin\n" + "[����]")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("��ʾ�˵�")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("�ղ�")).click();
//      Thread.sleep(3000);
//      mDevice.findObject(By.text("����")).click();
//      Thread.sleep(3000);
//  }
  //1.�ղ�������bbb
    @Test
	  public void testShoucangbbb() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��ʾ�˵�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("�ղ�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}
	//2.�鿴������bbb��Ա�б�
    @Test
	  public void testMembersbbb() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��ʾ�˵�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��Ա�б�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}  
	//3.ͬ��������bbb������Ϣ
    @Test
	  public void testRefreshbbb() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��ʾ�˵�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("ͬ���������Ϣ")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}
	//4.ȡ���ղ�������bbb
    @Test
	  public void testCancelShoucangbbb() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��ʾ�˵�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("ȡ���ղ�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}
	//5.ȡ��������������bbb
    @Test
	  public void testCancelRenamebbb() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("��ʾ�˵�")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("������")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("ȡ��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}
	////6.��������bbb���ղ�����
    @Test
	  public void takepictureAndsend() throws InterruptedException {
	  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("������������")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.res("com.android.camera2:id/shutter_button")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.res("com.android.camera2:id/done_button")).click();
	  Thread.sleep(3000);
	  mDevice.findObject(By.text("����")).click();
	  Thread.sleep(3000);
	}
	//7.��������bbb��ѡ����lizhe1����
    @Test
	  public void chatWithlizhe1() throws InterruptedException {
		  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��ʾ�˵�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��Ա�б�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("L\n"+"lizhe1\n"+"[����]")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
	  }
	//8.�˳�������aabb
    @Test
	  public void testExitaabb() throws InterruptedException {
		  mDevice.findObject(By.text("Ⱥ\n"+"bbb\n"+"3��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��ʾ�˵�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("�˳�������")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("ȷ��")).click();
		  Thread.sleep(3000);
	}  
	//9.�鿴�ҵ�-���ڲ��ر�
    @Test
	  public void myAbout() throws InterruptedException {
		  mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��ʾ�˵�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("�ر�")).click();
		  Thread.sleep(3000);
	}  
	//10.�鿴��˽����
    @Test
		public void myAbout_privacypolicy() throws InterruptedException {
		  mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��ʾ�˵�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��˽����")).click();
		  Thread.sleep(3000);
	}
  //11.������������
    @Test
  	public void myAbout_web() throws InterruptedException {
		  mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("��ʾ�˵�")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("http://xuan.im")).click();
		  Thread.sleep(3000);
  	}
  	//12.ע��
    @Test
	public void myCancel() throws InterruptedException {
		  mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("ע��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("ȷ��")).click();
		  Thread.sleep(3000);
	}
    //13.�ղ���ϵ��lizhe1
    @Test
    public void testShoucanglizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[����]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("��ʾ�˵�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("�ղ�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
    }
    //14.�鿴lizhe1����
    @Test
    public void testLooklizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[����]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("��ʾ�˵�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
    }
    //15.ͬ����lizhe1�������Ϣ
    @Test
    public void testRefreshlizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[����]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("��ʾ�˵�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("ͬ���������Ϣ")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
    }
    //16.����ϵ����ѡ����lizhe2����
    @Test
    public void testChatlizhe2() throws InterruptedException {
      mDevice.findObject(By.text("��ϵ��\n"+"�� 3 ����ǩ���� 4 ��")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("L\n" + "lizhe2\n" + "[����]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
    }
    //17.ȡ���ղ���ϵ��lizhe1
    @Test
    public void testCancelShoucanglizhe1() throws InterruptedException {
      mDevice.findObject(By.text("L\n" + "lizhe1\n" + "[����]")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("��ʾ�˵�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("ȡ���ղ�")).click();
      Thread.sleep(3000);
      mDevice.findObject(By.text("����")).click();
      Thread.sleep(3000);
    }
    //18.�鿴��¼�û���Ϣ
    @Test
    public void myMessage() throws InterruptedException {
		  mDevice.findObject(By.text("�ҵ�\n"+"�� 4 ����ǩ���� 4 ��")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("L\n"+"lizhe3"+"  @lizhe3"+"http://192.168.68.247:11443")).click();
		  Thread.sleep(3000);
		  mDevice.findObject(By.text("����")).click();
		  Thread.sleep(3000);
	}
	
}
