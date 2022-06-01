package lemon.test.lesson.Material.File;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.File.DeleteFile;
import lemon.pagesLesson.Material.Video.DeleteVideo;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DeleteFileTest extends BaseTest {
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
        DeleteFile deleteFile = new DeleteFile(driver);
        deleteFile.ClickLesson();
        Thread.sleep(3000);
        deleteFile.ClickMaterial();
        Thread.sleep(3000);
        deleteFile.ClickFile();
        Thread.sleep(3000);
        deleteFile.ClickDeleteButton();
        Thread.sleep(3000);
        deleteFile.ClickEnter();
    }
}
