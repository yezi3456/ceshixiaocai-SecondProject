import time

from appium.webdriver import webdriver

from pages.xuanxuan_page import XuanxuanPage


class TestXuanxuan():

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


    # 1.登录
    def test_login(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.login()

    # 2.注销登录
    def test_quit(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.quit()

    # 3.创建讨论组
    def test_createTaolunzu(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.createTaolunzu()

    # 4.收藏讨论组
    def test_shoucangTaolunzu(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.shoucangTaolunzu()

    # 5.取消收藏讨论组
    def test_quxiaoshoucangTaolunzu(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.quxiaoshoucangTaolunzu()

    # 6.查看成员列表
    def test_list_numbers(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_numbers()

    # 7.同步讨论组最近的消息
    def test_list_news(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_news()

    # 8.查看个人信息
    def test_list_Information(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_Information()

    # 9.查看关于
    def test_list_guanyu(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_guanyu()

    # 10.查看隐私条款
    def test_list_yinsitiaokuan(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_yinsitiaokuan()

    # 11.查看喧喧官网
    def test_list_xuanxuan(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_xuanxuan()

    # 12.查看所有联系人
    def test_list_lianxiren(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.list_lianxiren()

    # 13.收藏一个联系人
    def test_shoucanglianxiren(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.shoucanglianxiren()

    # 14.查看联系人资料
    def test_lianxirenInformation(self):
        time.sleep(3)
        xuanxuan_page = XuanxuanPage(self.driver)
        xuanxuan_page.lianxirenInformation()