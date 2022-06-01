package lemon.test.set;

import lemon.common.BaseTest;
import lemon.pagesLogin.Login;
import lemon.pagesSet.AdminSet;
import lemon.pagesSet.StaffSet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AdminSetTest extends BaseTest {
    @Test
    public void test_set_AdminSet() throws InterruptedException{
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
        AdminSet adminSet = new AdminSet(driver);
        adminSet.Click();
        Thread.sleep(3000);
        adminSet.ClickAdmin();
        adminSet.ClickNew();
        Thread.sleep(3000);
        adminSet.ClickAccount();
        adminSet.InputAccount("JinWenTest");
        Thread.sleep(3000);
        adminSet.ClickPhone();
        adminSet.InputPhone("13680347519");
        Thread.sleep(3000);
        adminSet.ClickPassword();
        adminSet.InputPassword("Aa111111");
        Thread.sleep(3000);
        adminSet.ClickName();
        adminSet.InputName("林锦文");
        Thread.sleep(3000);
        adminSet.ClickRole();
        Thread.sleep(3000);
        adminSet.SelectRole();
        Thread.sleep(5000);
    }
}
