package lemon.pagesLesson.Material.Photo;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ModifyGroupName extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickSelect = By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/input");

    private By ClickModifyButton = By.xpath("//*[@id=\"menu\"]/li[1]/button/span");

    private By ClickGroupName = By.xpath("//div[@class='el-input']//input");

    private By ClearGroupName = By.xpath("//div[@class='el-input']//input");

    private By InputGroupName = By.xpath("//div[@class='el-input']//input");

    private By EnterModify = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[1]/div[6]/div/div/div[3]/div/button[2]/span");



    public ModifyGroupName(WebDriver driver) {
        super(driver);
    }

    public void ClickLesson(){
        click(ClickLesson,"课程");
    }

    public void ClickMaterial(){
        click(ClickMaterial,"素材中心");
    }

    public void ClickModifyButton(){
        click(ClickModifyButton,"修改按钮");
    }

    public void ClickGroupName(){
        click(ClickGroupName,"点击");
    }

    public void ClearGroupName(){
        clear(ClearGroupName,"清除");
    }

    public void InputGroupName(String name){
        type(InputGroupName,name,"分组名");
    }

    public void ClickSelect(){
        click(ClickSelect,"查找");
    }

    public void EnterModify(){
        click(EnterModify,"确定");
    }

}
