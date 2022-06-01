package lemon.test.lesson.Material.Video;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.AddMusicMaterial;
import lemon.pagesLesson.Material.Video.AddVideoGroup;
import lemon.pagesLesson.Material.Video.AddVideoMaterial;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddVideoMaterialTest extends BaseTest {
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
        AddVideoMaterial addVideoMaterial = new AddVideoMaterial(driver);
        addVideoMaterial.ClickLesson();
        Thread.sleep(3000);
        addVideoMaterial.ClickMaterial();
        Thread.sleep(3000);
        addVideoMaterial.ClickMusic();
        Thread.sleep(3000);
        addVideoMaterial.ClickAddMaterial();
        Thread.sleep(3000);
        addVideoMaterial.ClickGroup();
        Thread.sleep(3000);
        addVideoMaterial.SelectGroup();
        Thread.sleep(3000);
        addVideoMaterial.AddPhoto();
        Thread.sleep(3000);
        Runtime runtime = Runtime.getRuntime();
        try {
            //执行
            runtime.exec("D:\\test\\src\\test\\resources\\video.exe");
        }catch (IOException e){
            e.printStackTrace();
        }
        Thread.sleep(10000);
        addVideoMaterial.EnterMusic();
    }
}
