package lemon.test.lesson.Material.File;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.File.AddFileMaterial;
import lemon.pagesLesson.Material.Video.AddVideoMaterial;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddFileMaterialTest extends BaseTest {
    @Test
    public void AddMusic_Test() throws InterruptedException{
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
        AddFileMaterial addFileMaterial = new AddFileMaterial(driver);
        addFileMaterial.ClickLesson();
        Thread.sleep(3000);
        addFileMaterial.ClickMaterial();
        Thread.sleep(3000);
        addFileMaterial.ClickFile();
        Thread.sleep(3000);
        addFileMaterial.ClickAddMaterial();
        Thread.sleep(3000);
        addFileMaterial.ClickGroup();
        Thread.sleep(3000);
        addFileMaterial.SelectGroup();
        Thread.sleep(3000);
        addFileMaterial.AddPhoto();
        Thread.sleep(3000);
        Runtime runtime = Runtime.getRuntime();
        try {
            //执行
            runtime.exec("D:\\test\\src\\test\\resources\\file.exe");
        }catch (IOException e){
            e.printStackTrace();
        }
        Thread.sleep(10000);
        addFileMaterial.EnterMusic();
    }
}
