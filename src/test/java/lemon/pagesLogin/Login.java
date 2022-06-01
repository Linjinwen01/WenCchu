package lemon.pagesLogin;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage {

    private By ClickAccount = By.xpath("//input[@placeholder='请输入您的账号']");

    private By InputAccount = By.xpath("//input[@placeholder='请输入您的账号']");

    private By ClickPassword = By.xpath("//input[@placeholder='请输入您的密码']");

    private By InputPassword = By.xpath("//input[@placeholder='请输入您的密码']");

    private By ClickButton = By.xpath("//button");

    public Login(WebDriver driver) {
        super(driver);
    }

    public void ClickAccount(){
        click(ClickAccount,"账号输入框");
    }

    public void InputAccount(String Account){
        type(InputAccount,Account,"账号");
    }

    public void ClickPassword(){
        click(ClickPassword,"密码输入框");
    }

    public void InputPassword(String Password){
        type(InputPassword,Password,"密码");
    }

    public void ClickButton(){
        click(ClickButton,"登录");
    }
}
