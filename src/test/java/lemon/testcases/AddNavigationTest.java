package lemon.testcases;

import lemon.common.BaseTest;
import lemon.pages.AddNavigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddNavigationTest extends BaseTest {
    @Test
    public void test_add_Navigation() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        AddNavigation addNavigation = new AddNavigation(driver);
        addNavigation.click();
        Thread.sleep(3000);
        addNavigation.ClickNavigation();
        Thread.sleep(3000);
        addNavigation.ClickAddNavigation();
        Thread.sleep(3000);
        addNavigation.ClickAddNavigationName();
        addNavigation.SendAddNavigationName("测试输入导航栏");
        Thread.sleep(3000);
        addNavigation.selectPhoto();
        Thread.sleep(3000);
        addNavigation.SelectLesson();
        Thread.sleep(3000);
        addNavigation.SelectButton();
        Thread.sleep(3000);
        addNavigation.ClickSendPhotoAddress();
        Thread.sleep(3000);
        addNavigation.SendPhotoAddress("Test");
        Thread.sleep(3000);
        addNavigation.DateTime();
        Thread.sleep(3000);
        addNavigation.ClickDate();
        Thread.sleep(3000);
        addNavigation.ClickDateButton();
        Thread.sleep(3000);
        addNavigation.save();

    }
}
