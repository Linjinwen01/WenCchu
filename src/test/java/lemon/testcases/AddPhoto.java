package lemon.testcases;

import lemon.common.BaseTest;
import lemon.pages.PhotoPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddPhoto extends BaseTest {
    @Test
    public void test_click_photo() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        PhotoPage photoPage = new PhotoPage(driver);
        photoPage.click();
        Thread.sleep(3000);
        photoPage.clickPhoto();
        Thread.sleep(3000);
        photoPage.clickButton();
        Thread.sleep(3000);
        photoPage.SendPhotoName("测试测试");
        Thread.sleep(3000);
        photoPage.setSelectPhoto();
        Thread.sleep(3000);
        photoPage.setSelectLesson();
        Thread.sleep(3000);
        photoPage.setSelectButton();
        Thread.sleep(3000);
        photoPage.setClickSendPhotoAddress();
        photoPage.setSendPhotoAddress("www.baidu.com");
        Thread.sleep(3000);
        photoPage.setDateTime();
        Thread.sleep(3000);
        photoPage.setClickDate();
        Thread.sleep(3000);
        photoPage.setClickDateButton();
        Thread.sleep(3000);
        photoPage.setSave();
    }
}
