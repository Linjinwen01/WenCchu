package lemon.test.lesson.Material.File;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.File.DownFile;
import lemon.pagesLesson.Material.Video.DownVideo;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DownFileTest extends BaseTest {
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
        DownFile downFile = new DownFile(driver);
        downFile.ClickLesson();
        Thread.sleep(3000);
        downFile.ClickMaterial();
        Thread.sleep(3000);
        downFile.ClickFile();
        Thread.sleep(3000);
        downFile.ClickDownLoadButton();
    }
}
