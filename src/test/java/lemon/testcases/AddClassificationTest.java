package lemon.testcases;

import lemon.common.BaseTest;
import lemon.pages.AddClassification;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddClassificationTest extends BaseTest {
    @Test
    public void test_add_Classification() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        AddClassification addClassification = new AddClassification(driver);
        addClassification.Click();
        Thread.sleep(3000);
        addClassification.ClickNavigation();
        Thread.sleep(3000);
        addClassification.ClickButton();
        Thread.sleep(3000);
        addClassification.ClickName();
        Thread.sleep(3000);
        addClassification.SendName("测试分组");
        addClassification.ClearName();
        Thread.sleep(3000);
        addClassification.Enter();
    }
}
