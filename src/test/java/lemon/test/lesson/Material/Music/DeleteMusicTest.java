package lemon.test.lesson.Material.Music;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.DeleteMusic;
import lemon.pagesLesson.Material.Photo.DeletePhoto;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DeleteMusicTest extends BaseTest {
    @Test
    public void add_group_test() throws InterruptedException {
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
        DeleteMusic deleteMusic = new DeleteMusic(driver);
        deleteMusic.ClickLesson();
        Thread.sleep(3000);
        deleteMusic.ClickMaterial();
        Thread.sleep(3000);
        deleteMusic.ClickMusic();
        Thread.sleep(3000);
        deleteMusic.ClickDeleteButton();
        Thread.sleep(3000);
        deleteMusic.ClickEnter();
    }
}
