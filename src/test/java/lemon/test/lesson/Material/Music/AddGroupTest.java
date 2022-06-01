package lemon.test.lesson.Material.Music;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.AddMusicGroup;
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
        AddMusicGroup addMusicGroup = new AddMusicGroup(driver);
        addMusicGroup.ClickLesson();
        Thread.sleep(3000);
        addMusicGroup.ClickMaterial();
        Thread.sleep(3000);
        addMusicGroup.ClickMusic();
        Thread.sleep(3000);
        addMusicGroup.ClickNewGroup();
        Thread.sleep(3000);
        addMusicGroup.ClickGroupName();
        addMusicGroup.InputGroupName("自动化测试分组");
        Thread.sleep(3000);
        addMusicGroup.EnterGroup();
    }
}
