package lemon.testcases;/*
package com.lemon.testcases;

import com.lemon.common.BaseTest;
import com.lemon.pages.IndexPage;
import com.lemon.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

*/

import lemon.common.BaseTest;
import lemon.pages.LoginPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * @author 歪歪欧巴

 */

public class LoginTest extends BaseTest {
    @Test
    public void test_login_success() throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.48:9528/#/login?redirect=%2Foverview");
        Thread.sleep(3000);
       /* System.out.println(driver.manage().getCookies());
        Cookie c1 = new Cookie("laravel_session", "eyJpdiI6Ikxaa2htVkVuUUdxaW15bVorTUdrbHc9PSIsInZhbHVlIjoiVGNORmROR1JWSEZvempJYS95a2U4aldPREZ3TTBGUG9IdTIyV3pXUDVENHJlV2JmUXUyM202VVFXUGgrMExrVllzUU83cUdjQVJRNVZWbHhsWU1DODFUTGhDZjBxTFptWnNqUlBvNVNXcklPc0xYYTRqQ3JTaSs4VElESzhRMkEiLCJtYWMiOiIxMTcxMjVhMGZhYzhkZTc0YjI0NGFhZGM0NjA5ZmI3ZWExOGJiM2RiYjUxOTg2ZmEzMDhiODlhMTFjOWZmMGZmIiwidGFnIjoiIn0%3D");
        Cookie c2 = new Cookie("edu_token", "98de2cad29ed2f3dd5e728c5d1d191524cadca12c90232239c3ad8d37f0223f8");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);*/
        WebDriver.Window window = driver.manage().window();
        window.maximize();

        /*LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","Aa111111","123");*/
        //driver.navigate().refresh();


    }
}