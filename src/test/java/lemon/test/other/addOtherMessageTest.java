package lemon.test.other;

import lemon.common.BaseTest;
import lemon.pagesOther.addOtherMessage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class addOtherMessageTest extends BaseTest {
    @Test
    public void test_add_MessageTest() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        addOtherMessage addOtherMessage = new addOtherMessage(driver);
        addOtherMessage.ClickOther();
        Thread.sleep(3000);
        addOtherMessage.ClickNewMessage();
        Thread.sleep(3000);
        addOtherMessage.ClickMessageType();
        Thread.sleep(3000);
        addOtherMessage.SelectMessageType();
        Thread.sleep(3000);
        addOtherMessage.ClickTitle();
        Thread.sleep(3000);
        addOtherMessage.InputTitle("测试标题");
        Thread.sleep(3000);
        addOtherMessage.ClickContent();
        Thread.sleep(3000);
        addOtherMessage.InputContent("测试输入内容，1234567890，测试@@！！@#￥%……&*（）（……%￥%*");
        Thread.sleep(3000);
        addOtherMessage.Enter();
    }
}
