package lemon.test.lesson.Material.Photo;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Photo.DeletePhoto;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DeletePhotoTest extends BaseTest {
    @Test
    public void delete_test() throws InterruptedException{
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
        DeletePhoto deletePhoto = new DeletePhoto(driver);
        deletePhoto.ClickLesson();
        Thread.sleep(3000);
        deletePhoto.ClickMaterial();
        Thread.sleep(3000);
        deletePhoto.ClickDeleteButton();
        Thread.sleep(3000);
        deletePhoto.ClickEnter();
    }
}
