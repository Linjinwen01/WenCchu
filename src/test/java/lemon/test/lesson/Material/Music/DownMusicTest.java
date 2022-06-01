package lemon.test.lesson.Material.Music;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.DownMusic;
import lemon.pagesLesson.Material.Photo.DownLoad;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DownMusicTest extends BaseTest {
    @Test
    public void DownLoad_test() throws InterruptedException {
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
        Thread.sleep(3000);
        DownMusic downMusic = new DownMusic(driver);
        downMusic.ClickLesson();
        Thread.sleep(3000);
        downMusic.ClickMaterial();
        Thread.sleep(3000);
        downMusic.ClickMusic();
        Thread.sleep(3000);
        downMusic.ClickDownLoadButton();
    }
}
