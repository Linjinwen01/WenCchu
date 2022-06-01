package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddClassification extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div/span");

    private By ClickNavigation = By.xpath("/html/body/div[2]/ul/div[4]/a/li/span");

    private By ClickButton = By.xpath("//div[@class='body']//button");

    private By ClickName = By.xpath("//div[@class='el-dialog__wrapper']//input[@placeholder='输入分类名称']");

    private By SendName = By.xpath("//div[@class='el-dialog__wrapper']//input[@placeholder='输入分类名称']");

    private By Clear = By.xpath("//div[@class='el-dialog__wrapper']//input[@placeholder='输入分类名称']");

    private By Enter = By.xpath("//div[@class='el-dialog__footer']//button[2]");

    public AddClassification(WebDriver driver) {
        super(driver);
    }

    public void Click(){
        click(Click,"点击店铺");
    }

    public void ClickNavigation(){
        click(ClickNavigation,"点击首页分类");
    }

    public void ClickButton(){
        click(ClickButton,"点击新增分类");
    }

    public void ClickName(){
        click(ClickName,"点击分类名称输入框");
    }

    public void SendName(String name){
        type(SendName,name,"输入内容测试分组");
    }

    public void ClearName(){
        clear(Clear,"清除");
    }

    public void Enter(){
        click(Enter,"点击确定");
    }

}