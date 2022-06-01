package lemon.pagesOther;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addOtherMessage extends BasePage {

    private By Click = By.xpath("//div[@class='el-scrollbar__view']//ul//div[7]");

    private By ClickNewMessage = By.xpath("//div[@class='search_area']//button[3]");

    private By ClickMessageType = By.xpath("//div[@class='el-select']//input[@placeholder='请选择消息类型']");

    private By SelectMessageType = By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]/span");

    private By  ClickTitle = By.xpath("//div[@class='el-form-item__content']//input[@placeholder='输入消息标题']");

    private By  InputTitle = By.xpath("//div[@class='el-form-item__content']//input[@placeholder='输入消息标题']");

    private By ClickContent = By.xpath("//div[@class='el-textarea']//textarea[@placeholder='输入内容']");

    private By InputContent = By.xpath("//div[@class='el-textarea']//textarea[@placeholder='输入内容']");

    private By Enter = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[3]/div/div/div[3]/div/button[2]/span");


    public addOtherMessage(WebDriver driver) {
        super(driver);
    }

    public void ClickOther(){
        click(Click,"点击其他");
    }

    public void ClickNewMessage(){
        click(ClickNewMessage,"点击新增消息");
    }

    public void ClickMessageType(){
        click(ClickMessageType,"点击类型");
    }

    public void SelectMessageType(){
        click(SelectMessageType,"选择类型");
    }

    public void ClickTitle(){
        click(ClickTitle,"点击标题");
    }

    public void InputTitle(String Title){
        type(ClickTitle,Title,"输入标题内容");
    }

    public void ClickContent(){
        click(InputTitle,"点击内容");
    }

    public void InputContent(String Content){
        type(InputContent,Content,"输入标题内容");
    }

    public void Enter(){
        click(Enter,"点击确定");
    }


}

