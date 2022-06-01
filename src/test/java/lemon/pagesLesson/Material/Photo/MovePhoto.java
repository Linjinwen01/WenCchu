package lemon.pagesLesson.Material.Photo;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovePhoto extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickMoveButton = By.xpath("//table[@class='el-table__body']//tbody//tr[1]//td[6]//div//div//div[2]");

    private By ClickSelectButton = By.xpath("//div[@class='body']//div[@class='el-select']");

    private By ClickSelectGroup = By.xpath("//div[@x-placement='bottom-start']//div//ul//li[1]");

    private By ClickEnter = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[3]/div/div/div[3]/span/button[2]/span");


    public MovePhoto(WebDriver driver) {
        super(driver);
    }

    public void ClickLesson(){
        click(ClickLesson,"课程");
    }

    public void ClickMaterial(){
        click(ClickMaterial,"素材中心");
    }

    public void ClickMoveButton(){
        click(ClickMoveButton,"移动按钮");
    }

    public void ClickSelectButton(){
        click(ClickSelectButton,"选择按钮");
    }

    public void ClickSelectGroup(){
        click(ClickSelectGroup,"选择分组");
    }

    public void ClickEnter(){
        click(ClickEnter,"确定");
    }


}
