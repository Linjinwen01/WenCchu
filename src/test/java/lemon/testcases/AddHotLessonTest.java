package lemon.testcases;

import lemon.common.BaseTest;
import lemon.pages.AddHotLesson;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddHotLessonTest extends BaseTest {
    @Test
    public void test_add_HotLesson() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        AddHotLesson addHotLesson = new AddHotLesson(driver);
        addHotLesson.Click();
        Thread.sleep(3000);
        addHotLesson.ClickHot();
        Thread.sleep(3000);
        addHotLesson.ClickLesson();
        Thread.sleep(3000);
        addHotLesson.choice1();
        Thread.sleep(3000);
        addHotLesson.choice2();
        Thread.sleep(3000);
        addHotLesson.choice3();
        Thread.sleep(3000);
        addHotLesson.Enter();
    }
}
