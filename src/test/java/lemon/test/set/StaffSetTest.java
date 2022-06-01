package lemon.test.set;

import lemon.common.BaseTest;
import lemon.pagesLogin.Login;
import lemon.pagesSet.StaffSet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class StaffSetTest extends BaseTest {
    @Test
    public void test_set_StaffSetTest() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.48:9528/#/login?redirect=%2Foverview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        Login login  = new Login(driver);
        login.ClickAccount();
        Thread.sleep(3000);
        login.InputAccount("admin");
        Thread.sleep(3000);
        login.ClickPassword();
        Thread.sleep(3000);
        login.InputPassword("Aa111111");
        Thread.sleep(3000);
        login.ClickButton();
        Thread.sleep(5000);
        StaffSet adminSet = new StaffSet(driver);
        adminSet.Click();
        Thread.sleep(3000);
        adminSet.ClickAdmin();
        Thread.sleep(3000);
        adminSet.ClickNew();
        Thread.sleep(3000);
        adminSet.ClickAccount();
        adminSet.InputAccount("JinWenTest1");
        Thread.sleep(3000);
        adminSet.ClickPhone();
        adminSet.InputPhone("13680347511");
        Thread.sleep(3000);
        adminSet.ClickPassword();
        adminSet.InputPassword("Aa1111112");
        Thread.sleep(3000);
        adminSet.ClickName();
        adminSet.InputName("林锦文自动化测试添加");
        Thread.sleep(3000);
        adminSet.ClickRole();
        Thread.sleep(3000);
        adminSet.SelectRole();
        Thread.sleep(5000);
        adminSet.Enter();
    }
}
