import pytest
from appium.webdriver import webdriver


class XuanxuanTest():
    def setup_class(self):
        print("初始化driver")
        cap = {
            "platformName": "Android",
            "deviceName": "127.0.0.1:62001",
            "appPackage": "com.cnezsoft.xxm",
            "appActivity": ".MainActivity",
            "noReset": True
        }
        self.driver = webdriver.Remote("http://localhost:4723/wd/hub", cap)
        self.driver.implicitly_wait(10)

    def teardown(self):
        print("退出quit")
        self.driver.quit()

    # 1.创建讨论组
    def test_taolunzu_Create(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]").click()
        self.driver.find_element_by_xpath("//*[@text='创建聊天']").click()
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]").click()
        self.driver.find_element_by_xpath("//*[@text='创建']").click()

    # 2.收藏讨论组
    def test_taolunzu_Shoucang(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='收藏']").click()

    # 3.取消收藏讨论组
    def test_taolunzu_Shoucang(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='取消收藏']").click()

    # 4.查看讨论组成员列表
    def test_taolunzu_Numbers(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='成员列表']").click()

    # 5.同步讨论组的最近消息
    def test_taolunzu_news(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='同步最近的消息']").click()

    # 6.查看我的信息
    def test_myInformation(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View").click()

    # 7.查看关于
    def test_guanyu(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='关于']").click()

    # 8.查看隐私条款
    def test_yinsitiaokuan(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='关于']").click()
        self.driver.find_element_by_xpath("//*[@text='隐私条款']").click()

    # 9.查看喧喧官网
    def test_xuanxuan(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='关于']").click()
        self.driver.find_element_by_xpath("//*[@text='http://xuan.im']").click()

    # 10.退出当前登录账号
    def test_quitXuanxuan(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//*[@text='注销']").click()
        self.driver.find_element_by_xpath("//*[@text='确认']").click()

    # 11.查看联系人lili的资料
    def test_lianxirenInformation(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]").click()
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='开聊']").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='资料']").click()

    # 12.收藏lili这个联系人
    def test_shoucanglianxiren(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]").click()
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]").click()
        self.driver.find_element_by_xpath("//*[@text='收藏']").click()

    # 13.与lili发邮件
    def test_sendEmail(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]").click()
        self.driver.find_element_by_xpath("//*[@text='显示菜单']").click()
        self.driver.find_element_by_xpath("//*[@text='资料']").click()
        self.driver.find_element_by_xpath("//*[@text='Email lili@163.com']").click()

    # 14.登录
    def test_login(self):
        self.driver.find_element_by_xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]").click()
        self.driver.find_element_by_xpath("//*[@text='注销']").click()
        self.driver.find_element_by_xpath("//*[@text='确认']").click()
        self.driver.find_element_by_xpath("//*[@text='登录']").click()














    if __name__ == "__main__":
        pytest.main(["-s", "test_xuanxuan.py"])