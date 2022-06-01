package lemon.pagesLesson.Material.Music;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMusicMaterial extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickMusic = By.xpath("//div[@role='tablist']//div[3]");

    private By ClickAddMaterial = By.xpath("//div[@class='body']//div[@class='tableArea']//div[@class='search_area']//form//button");

    private By ClickGroup = By.xpath("//div[@class='el-select']//input");

    private By SelectGroup = By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span");

    private By AddPhoto = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[6]/div[1]/div/div[2]/div/form/div[2]/div/div/div[1]/button/span");

    private By EnterMusic = By.xpath("//div[@class='addGroup']//div[@role='dialog']//div[@class='el-dialog__footer']//button[2]");


    public AddMusicMaterial(WebDriver driver) {
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

    public void ClickAddMaterial(){
        click(ClickAddMaterial,"上传素材");
    }

    public void ClickGroup(){
        click(ClickGroup,"选择分组");
    }

    public void SelectGroup(){
        click(SelectGroup,"确定分组");
    }

    public void AddPhoto(){
        click(AddPhoto,"点击上传");
    }

    public void EnterMusic(){
        click(EnterMusic,"确定");
    }


}
