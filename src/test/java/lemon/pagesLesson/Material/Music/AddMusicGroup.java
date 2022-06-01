package lemon.pagesLesson.Material.Music;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMusicGroup extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickMusic = By.xpath("//div[@role='tablist']//div[3]");

    private By ClickNewGroup = By.xpath("//div[@class='treeArea']//div[2]");

    private By ClickGroupName = By.xpath("//div[@class='treeArea']//div[5]//input[@placeholder='请输入分组名称']");

    private By InputGroupName = By.xpath("//div[@class='treeArea']//div[5]//input[@placeholder='请输入分组名称']");

    private By EnterGroup = By.xpath("//div[@class='treeArea']//div[5]//div//div//div[@class='el-dialog__footer']//button[2]");


    public AddMusicGroup(WebDriver driver) {
        super(driver);
    }

    public void ClickLesson(){
        click(ClickLesson,"课程");
    }

    public void ClickMaterial(){
        click(ClickMaterial,"素材中心");
    }

    public void ClickMusic(){
        click(ClickMusic,"音频");
    }

    public void ClickNewGroup(){
        click(ClickNewGroup,"新增分组");
    }

    public void ClickGroupName(){
        click(ClickGroupName,"分组输入框");
    }

    public void InputGroupName(String name){
        type(InputGroupName,name,"分组输入框");
    }

    public void EnterGroup(){
        click(EnterGroup,"确定");
    }

}
