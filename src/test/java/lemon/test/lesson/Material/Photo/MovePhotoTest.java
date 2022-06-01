package lemon.test.lesson.Material.Photo;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Photo.MovePhoto;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MovePhotoTest extends BaseTest {
    @Test
    public void Move_test() throws InterruptedException{
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
        MovePhoto movePhoto = new MovePhoto(driver);
        movePhoto.ClickLesson();
        Thread.sleep(3000);
        movePhoto.ClickMaterial();
        Thread.sleep(3000);
        movePhoto.ClickMoveButton();
        Thread.sleep(3000);
        movePhoto.ClickSelectButton();
        Thread.sleep(3000);
        movePhoto.ClickSelectGroup();
        Thread.sleep(3000);
        movePhoto.ClickEnter();
    }
}
