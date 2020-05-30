from selenium.webdriver.common.by import By

from pages.base_page import BasePage


class XuanxuanPage(BasePage):

    _btnMe_locator=(By.XPATH,"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]")
    _btnQuit_locator=(By.XPATH,"//*[@text='注销']")
    _btnOk1_locator = (By.XPATH, "//*[@text='确认']")
    _btnSubmit_locator = (By.XPATH, "//*[@text='登录']")
    _btnTaolunzu_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]")
    _btnCreate_locator = (By.XPATH, "//*[@text='创建聊天']")
    _selectNumber1_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]")
    _btnOk2_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]")
    _btnOk3_locator = (By.XPATH, "//*[@text='创建']")
    _taolunzu1_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
    _btnCaidan_locator = (By.XPATH, "//*[@text='显示菜单']")
    _btnShoucang_locator = (By.XPATH, "//*[@text='收藏']")
    _btnQuxiaoshoucang_locator = (By.XPATH, "//*[@text='取消收藏']")
    _btnlistNumbers_locator = (By.XPATH, "//*[@text='成员列表']")
    _btnNews_locator = (By.XPATH, "//*[@text='同步最近的消息']")
    _btnInformation_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View")
    _btnGuanyu_locator = (By.XPATH, "//*[@text='关于']")
    _btnYinsitiaokuan_locator = (By.XPATH, "//*[@text='隐私条款']")
    _btnXuanxuan_locator = (By.XPATH, "//*[@text='http://xuan.im']")
    _btnLianxiren_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]")
    _lianxiren_locator = (By.XPATH, "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
    _btnKailiao_locator = (By.XPATH, "//*[@text='开聊']")
    _btnZiliao_locator = (By.XPATH, "//*[@text='资料']")




    # 1.登录
    def login(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnQuit_locator)
        self.driver.find_element_and_click(self._btnOk1_locator)
        self.driver.find_element_and_click(self._btnSubmit_locator)

    # 2.注销登录
    def quit(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnQuit_locator)
        self.driver.find_element_and_click(self._btnOk1_locator)

    # 3.创建讨论组
    def createTaolunzu(self):
        self.driver.find_element_and_click(self._btnTaolunzu_locator)
        self.driver.find_element_and_click(self._btnCreate_locator)
        self.driver.find_element_and_click(self._selectNumber1_locator)
        self.driver.find_element_and_click(self._btnOk2_locator)
        self.driver.find_element_and_click(self._btnOk3_locator)

    # 4.收藏讨论组
    def shoucangTaolunzu(self):
        self.driver.find_element_and_click(self._taolunzu1_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnShoucang_locator)

    # 5.取消收藏讨论组
    def quxiaoshoucangTaolunzu(self):
        self.driver.find_element_and_click(self._taolunzu1_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnQuxiaoshoucang_locator)

    # 6.查看成员列表
    def list_numbers(self):
        self.driver.find_element_and_click(self._taolunzu1_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnlistNumbers_locator)

    # 7.同步讨论组最近的消息
    def list_news(self):
        self.driver.find_element_and_click(self._taolunzu1_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnNews_locator)

    # 8.查看个人信息
    def list_Information(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnInformation_locator)


    # 9.查看关于
    def list_guanyu(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnGuanyu_locator)

    # 10.查看隐私条款
    def list_yinsitiaokuan(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnGuanyu_locator)
        self.driver.find_element_and_click(self._btnYinsitiaokuan_locator)

    # 11.查看喧喧官网
    def list_xuanxuan(self):
        self.driver.find_element_and_click(self._btnMe_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnGuanyu_locator)
        self.driver.find_element_and_click(self._btnXuanxuan_locator)

    # 12.查看所有联系人
    def list_lianxiren(self):
        self.driver.find_element_and_click(self._btnLianxiren_locator)

    # 13.收藏一个联系人
    def shoucanglianxiren(self):
        self.driver.find_element_and_click(self._btnLianxiren_locator)
        self.driver.find_element_and_click(self._lianxiren_locator)
        self.driver.find_element_and_click(self._btnShoucang_locator)

    # 14.查看联系人资料
    def lianxirenInformation(self):
        self.driver.find_element_and_click(self._btnLianxiren_locator)
        self.driver.find_element_and_click(self._lianxiren_locator)
        self.driver.find_element_and_click(self._btnKailiao_locator)
        self.driver.find_element_and_click(self._btnCaidan_locator)
        self.driver.find_element_and_click(self._btnZiliao_locator)






