package lemon.test.lesson.Material.Video;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Music.ModifyMusicGroup;
import lemon.pagesLesson.Material.Video.ModifyVideoGroup;
import lemon.pagesLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ModifyVideoGroupTest extends BaseTest {
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
        ModifyVideoGroup modifyVideoGroup = new ModifyVideoGroup(driver);
        modifyVideoGroup.ClickLesson();
        Thread.sleep(3000);
        modifyVideoGroup.ClickMaterial();
        Thread.sleep(3000);
        modifyVideoGroup.ClickSelect();
        Thread.sleep(3000);
        modifyVideoGroup.ClickVideo();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div/span[2]/span[1]/span"))).perform();
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[3]/div[1]/div[2]/div[3]/div/span[2]/span[1]/span"))).perform();
        Thread.sleep(3000);
        modifyVideoGroup.ClickModifyButton();
        Thread.sleep(3000);
        modifyVideoGroup.ClickGroupName();
        Thread.sleep(3000);
        modifyVideoGroup.ClearGroupName();
        Thread.sleep(3000);
        modifyVideoGroup.InputGroupName("测试自动化修改分组名称");
        Thread.sleep(3000);
        modifyVideoGroup.EnterModify();
    }
}
