package lemon.test.lesson.Material.Photo;
import lemon.common.BaseTest;
import lemon.pagesLesson.Material.Photo.DeleteGroup;
import lemon.pagesLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DeleteGroupTest extends BaseTest{
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
        DeleteGroup deleteGroup = new DeleteGroup(driver);
        deleteGroup.ClickLesson();
        Thread.sleep(3000);
        deleteGroup.ClickMaterial();
        Thread.sleep(5000);
        deleteGroup.ClickSelect();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@role='group']//div[1]"))).perform();
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//div[@role='group']//div[1]"))).perform();
        Thread.sleep(3000);
        deleteGroup.ClickDelete();
        Thread.sleep(3000);
        deleteGroup.ClickGroupName();
        Thread.sleep(3000);
        deleteGroup.InputGroupName("测试分组");
        Thread.sleep(3000);
        deleteGroup.EnterDelete();

    }
}
