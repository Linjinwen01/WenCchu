package lemon.test.lesson.Material.Photo;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Photo.AddGroup;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddGroupTest extends BaseTest {

    @Test
    public void add_group_test() throws InterruptedException{
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
        AddGroup addGroup = new AddGroup(driver);
        addGroup.ClickLesson();
        Thread.sleep(3000);
        addGroup.ClickMaterial();
        Thread.sleep(3000);
        addGroup.ClickNewGroup();
        Thread.sleep(3000);
        addGroup.ClickGroupName();
        addGroup.InputGroupName("自动化测试分组");
        Thread.sleep(3000);
        addGroup.EnterGroup();
    }
}
