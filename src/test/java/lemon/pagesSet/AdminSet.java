package lemon.pagesSet;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminSet extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[8]/li/div/span");

    private By ClickAdmin = By.xpath("/html/body/div[2]/ul/div[2]/a/li/span");

    private By ClickNew = By.xpath("//div[@class='body']//button");

    private By ClickAccount = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入账号']");

    private By InputAccount = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入账号']");

    private By ClickPhone = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入手机号']");

    private By InputPhone = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入手机号']");

    private By ClickPassword = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入密码']");

    private By InputPassword = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入密码']");

    private  By ClickName = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入姓名']");

    private By InputName = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请输入姓名']");

    private By ClickRole = By.xpath("//div[@class='dataTable']//div[@class='el-dialog__body']//form[@class='el-form']//div[@class='el-form-item__content']//div//input[@placeholder='请选择角色']");

    private By SelectRole = By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]/span");

    public AdminSet(WebDriver driver) {
        super(driver);
    }

    public void Click(){
        click(Click,"点击设置");
    }

    public void ClickAdmin(){
        click(ClickAdmin,"点击角色管理");
    }

    public void ClickNew(){
        click(ClickNew,"点击新增员工");
    }

    public void ClickAccount(){
        click(ClickAccount,"点击账号输入框");
    }

    public void InputAccount(String account){
        type(InputAccount,account,"输入账号JinWenTest");
    }

    public void ClickPhone(){
        click(ClickPhone,"点击手机号输入框");
    }

    public void InputPhone(String phone){
        type(InputPhone,phone,"输入手机号13680347519");
    }

    public void ClickPassword(){
        click(ClickPassword,"点击密码输入框");
    }

    public void InputPassword(String password){
        type(InputPassword,password,"输入密码Aa111111");
    }

    public void ClickName(){
        click(ClickName,"点击姓名输入框");
    }

    public void InputName(String name){
        type(InputName,name,"输入姓名：林锦文");
    }

    public void ClickRole(){
        click(ClickRole,"点击角色");
    }

    public void SelectRole(){
        click(SelectRole,"选择角色");
    }
}
