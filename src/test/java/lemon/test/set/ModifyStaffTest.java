package lemon.test.set;

import lemon.common.BasePage;
import lemon.common.BaseTest;
import lemon.pagesLogin.Login;
import lemon.pagesSet.ModifyStaff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ModifyStaffTest extends BaseTest {
    @Test
    public void test_Modify_ModifyStaffTest() throws InterruptedException{
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
        ModifyStaff modifyStaff = new ModifyStaff(driver);
        modifyStaff.Click();
        Thread.sleep(3000);
        modifyStaff.ClickAdmin();
        Thread.sleep(3000);
        modifyStaff.ClickEdit();
        Thread.sleep(3000);
        modifyStaff.ClickPhone();
        Thread.sleep(3000);
        modifyStaff.ClearPhone();
        Thread.sleep(3000);
        modifyStaff.InputPhone("13680347519");
        Thread.sleep(3000);
        modifyStaff.ClickPassword();
        Thread.sleep(3000);
        modifyStaff.ClearPassword();
        Thread.sleep(3000);
        modifyStaff.InputPassword("Aa111111");
        Thread.sleep(3000);
        modifyStaff.ClickName();
        Thread.sleep(3000);
        modifyStaff.ClearName();
        Thread.sleep(3000);
        modifyStaff.InputName("锦文测试嘻嘻嘻");
        Thread.sleep(3000);
        modifyStaff.Enter();

    }
}
