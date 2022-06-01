package lemon.test.lesson.Material.File;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.File.MoveFile;
import lemon.pagesLesson.Material.Video.MoveVideo;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MoveFileTest extends BaseTest {
    @Test
    public void Move_test() throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.48:9528/#/login?redirect=%2Foverview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        Login login = new Login(driver);
        login.ClickAccount();
        Thread.sleep(3000);
        login.InputAccount("admin");
        Thread.sleep(3000);
        login.ClickPassword();
        Thread.sleep(3000);
        login.InputPassword("Aa111111");
        Thread.sleep(3000);
        login.ClickButton();
        MoveFile moveFile = new MoveFile(driver);
        moveFile.ClickLesson();
        Thread.sleep(3000);
        moveFile.ClickMaterial();
        Thread.sleep(3000);
        moveFile.ClickFile();
        Thread.sleep(3000);
        moveFile.ClickMoveButton();
        Thread.sleep(3000);
        moveFile.ClickSelectButton();
        Thread.sleep(3000);
        moveFile.ClickSelectGroup();
        Thread.sleep(3000);
        moveFile.ClickEnter();
    }
}
