package lemon.test.lesson.Material.Music;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.ModifyMusicGroup;
import lemon.pagesLesson.Material.Photo.ModifyGroupName;
import lemon.pagesLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ModifyMusicGroupTest extends BaseTest {
    @Test
    public void Modify_test() throws InterruptedException {
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
        ModifyMusicGroup modifyMusicGroup = new ModifyMusicGroup(driver);
        modifyMusicGroup.ClickLesson();
        Thread.sleep(3000);
        modifyMusicGroup.ClickMaterial();
        Thread.sleep(3000);
        modifyMusicGroup.ClickSelect();
        Thread.sleep(3000);
        modifyMusicGroup.ClickMusic();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div/span[2]/span[1]/span"))).perform();
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div/span[2]/span[1]/span"))).perform();
        Thread.sleep(3000);
        modifyMusicGroup.ClickModifyButton();
        Thread.sleep(3000);
        modifyMusicGroup.ClickGroupName();
        Thread.sleep(3000);
        modifyMusicGroup.ClearGroupName();
        Thread.sleep(3000);
        modifyMusicGroup.InputGroupName("测试自动化修改分组名称");
        Thread.sleep(3000);
        modifyMusicGroup.EnterModify();
    }
}
