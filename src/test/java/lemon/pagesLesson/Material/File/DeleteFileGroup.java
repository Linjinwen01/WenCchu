package lemon.pagesLesson.Material.File;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteFileGroup extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickFile = By.xpath("//div[@role='tablist']//div[5]");

    private By ClickSelect = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/input");

    private By ClickDelete = By.xpath("//div[@class='treeArea']//ul[@class='menu']//li[2]");

    private By ClickGroupName = By.xpath("//div[@class='el-input']//input");

    private By InputGroupName = By.xpath("//div[@class='el-input']//input");

    private By EnterDelete = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[7]/div/div/div[3]/div/button[2]/span");

    public DeleteFileGroup(WebDriver driver) {
        super(driver);
    }

    public void ClickLesson(){
        click(ClickLesson,"课程");
    }

    public void ClickMaterial(){
        click(ClickMaterial,"素材中心");
    }

    public void ClickFile(){
        click(ClickFile,"音频");
    }

    public void ClickSelect(){
        click(ClickSelect,"查找");
    }

    public void ClickDelete(){
        click(ClickDelete,"删除按钮");
    }

    public void ClickGroupName(){
        click(ClickGroupName,"分组名称输入框");
    }

    public void InputGroupName(String Name){
        type(InputGroupName,Name,"输入分组名称");
    }

    public void EnterDelete(){
        click(EnterDelete,"确定");
    }

}
