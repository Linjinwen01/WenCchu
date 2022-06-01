package lemon.test.lesson.Material.Video;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.MoveMusic;
import lemon.pagesLesson.Material.Video.MoveVideo;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MoveVideoTest extends BaseTest {
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
        MoveVideo moveVideo = new MoveVideo(driver);
        moveVideo.ClickLesson();
        Thread.sleep(3000);
        moveVideo.ClickMaterial();
        Thread.sleep(3000);
        moveVideo.ClickVideo();
        Thread.sleep(3000);
        moveVideo.ClickMoveButton();
        Thread.sleep(3000);
        moveVideo.ClickSelectButton();
        Thread.sleep(3000);
        moveVideo.ClickSelectGroup();
        Thread.sleep(3000);
        moveVideo.ClickEnter();
    }
}
