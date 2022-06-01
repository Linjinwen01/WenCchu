package lemon.test.set;

import lemon.common.BaseTest;
import lemon.pagesLogin.Login;
import lemon.pagesSet.DeleteStaff;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DeleteStaffTest extends BaseTest {
    @Test
    public void delete_DeleteStaffTest() throws InterruptedException{
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
        DeleteStaff deleteStaff = new DeleteStaff(driver);
        deleteStaff.Click();
        Thread.sleep(5000);
        deleteStaff.ClickAdmin();
        Thread.sleep(3000);
        deleteStaff.ClickDeleteButton();
        Thread.sleep(3000);
        deleteStaff.EnterButton();
    }
}
