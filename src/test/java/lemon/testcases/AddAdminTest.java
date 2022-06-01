package lemon.testcases;

import lemon.common.BaseTest;
import lemon.pages.IndexPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddAdminTest extends BaseTest {
    @Test
    public void addAdmin() throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        toUrl(driver,"http://192.168.9.16:9528/#/overview");
        Thread.sleep(3000);
        System.out.println(driver.manage().getCookies());
        Cookie c1 = new Cookie("laravel_session", "eyJpdiI6Ikxaa2htVkVuUUdxaW15bVorTUdrbHc9PSIsInZhbHVlIjoiVGNORmROR1JWSEZvempJYS95a2U4aldPREZ3TTBGUG9IdTIyV3pXUDVENHJlV2JmUXUyM202VVFXUGgrMExrVllzUU83cUdjQVJRNVZWbHhsWU1DODFUTGhDZjBxTFptWnNqUlBvNVNXcklPc0xYYTRqQ3JTaSs4VElESzhRMkEiLCJtYWMiOiIxMTcxMjVhMGZhYzhkZTc0YjI0NGFhZGM0NjA5ZmI3ZWExOGJiM2RiYjUxOTg2ZmEzMDhiODlhMTFjOWZmMGZmIiwidGFnIjoiIn0%3D");
        Cookie c2 = new Cookie("edu_token", "98de2cad29ed2f3dd5e728c5d1d191524cadca12c90232239c3ad8d37f0223f8");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);
        driver.navigate().refresh();
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        //点击私钥管理
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSiYao();
    }
}
