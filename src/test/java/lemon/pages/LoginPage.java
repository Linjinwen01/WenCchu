package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 */
public class LoginPage extends BasePage {
    //1、元素定位
    private By phone_input = By.xpath("//input[@placeholder='请输入您的账号']");
    private By password_input = By.xpath("//input[@placeholder='请输入您的密码']");
    private By code_input = By.xpath("//input[@placeholder='请输入验证码']");
    private By login_button = By.xpath("//button");
    //有参构造
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //2、登录操作
    public void login(String phone,String password,String code){
        /*driver.findElement(phone_input).sendKeys(phone);
        driver.findElement(password_input).sendKeys(password);
        driver.findElement(login_button).click();*/
        /*waitElementVisible(driver,phone_input).sendKeys(phone);
        waitElementVisible(driver,password_input).sendKeys(password);
        waitElementClickable(driver,login_button).click();*/
        type(phone_input,phone,"登录页面-账号输入框");
        type(password_input,password,"登录页面-密码输入框");
        type(code_input,code,"登录页面-验证码输入框按钮");
        click(login_button,"登录页面-登录");

    }

}
