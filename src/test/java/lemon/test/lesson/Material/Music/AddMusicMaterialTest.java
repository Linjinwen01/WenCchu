package lemon.test.lesson.Material.Music;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.AddMusicMaterial;
import lemon.pagesLesson.Material.Photo.AddMaterial;
import lemon.pagesLogin.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddMusicMaterialTest extends BaseTest {
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
        AddMusicMaterial addMaterial = new AddMusicMaterial(driver);
        addMaterial.ClickLesson();
        Thread.sleep(3000);
        addMaterial.ClickMaterial();
        Thread.sleep(3000);
        addMaterial.ClickMusic();
        Thread.sleep(3000);
        addMaterial.ClickAddMaterial();
        Thread.sleep(3000);
        addMaterial.ClickGroup();
        Thread.sleep(3000);
        addMaterial.SelectGroup();
        Thread.sleep(3000);
        addMaterial.AddPhoto();
        Thread.sleep(3000);
        Runtime runtime = Runtime.getRuntime();
        try {
            //执行
            runtime.exec("D:\\test\\src\\test\\resources\\music.exe");
        }catch (IOException e){
            e.printStackTrace();
        }
        Thread.sleep(10000);
        addMaterial.EnterMusic();
    }
}
