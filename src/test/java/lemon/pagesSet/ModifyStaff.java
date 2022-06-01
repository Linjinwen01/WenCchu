package lemon.pagesSet;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModifyStaff extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[8]/li/div/span");

    private By ClickAdmin = By.xpath("/html/body/div[2]/ul/div[1]/a/li/span");

    private By ClickEdit = By.xpath("//tbody//tr[1]//td[7]//div[@class='cell']//div//div[1]");

    private By ClickPhone = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[2]/div/div/input");

    private By ClearPhone = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[2]/div/div/input");

    private By InputPhone = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[2]/div/div/input");

    private By ClickPassword = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[3]/div/div/input");

    private By ClearPassword = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[3]/div/div/input");

    private By InputPassword = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[3]/div/div/input");

    private By ClickName = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[4]/div/div/input");

    private By ClearName = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[4]/div/div/input");

    private By InputName = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/form/div[4]/div/div/input");

    private By Enter = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[3]/span/button[2]/span");

    public ModifyStaff(WebDriver driver) {
        super(driver);
    }

    public void Click(){
        click(Click,"设置");
    }

    public void ClickAdmin(){
        click(ClickAdmin,"员工列表");
    }

    public void ClickEdit(){
        click(ClickEdit,"编辑");
    }

    public void ClickPhone(){
        click(ClickPhone,"手机号输入框");
    }

    public void ClearPhone(){
        clear(ClearPhone,"清除");
    }

    public void InputPhone(String Phone){
        type(InputPhone,Phone,"手机号");
    }

    public void ClickPassword(){
        click(ClickPassword,"密码输入框");
    }

    public void ClearPassword(){
        clear(ClearPassword,"清除");
    }

    public void InputPassword(String Password){
        type(InputPassword,Password,"密码");
    }

    public void ClickName(){
        click(ClickName,"姓名输入框");
    }

    public void ClearName(){
        clear(ClearName,"清除");
    }

    public void InputName(String name){
        type(InputName,name,"姓名");
    }

    public void Enter(){
        click(Enter,"确定");
    }
}
