package lemon.test.lesson.Material.File;

import lemon.common.BaseTest;
import lemon.pagesLesson.Material.File.DeleteFileGroup;
import lemon.pagesLesson.Material.Video.DeleteVideoGroup;
import lemon.pagesLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DeleteFileGroupTest extends BaseTest {

    @Test
    public void DeleteGroup_test() throws InterruptedException{
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
        DeleteFileGroup deleteFileGroup = new DeleteFileGroup(driver);
        deleteFileGroup.ClickLesson();
        Thread.sleep(3000);
        deleteFileGroup.ClickMaterial();
        Thread.sleep(5000);
        deleteFileGroup.ClickSelect();
        Thread.sleep(3000);
        deleteFileGroup.ClickFile();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@role='group']//div[1]"))).perform();
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//div[@role='group']//div[1]"))).perform();
        Thread.sleep(3000);
        deleteFileGroup.ClickDelete();
        Thread.sleep(3000);
        deleteFileGroup.ClickGroupName();
        Thread.sleep(3000);
        deleteFileGroup.InputGroupName("测试分组");
        Thread.sleep(3000);
        deleteFileGroup.EnterDelete();

    }
}
