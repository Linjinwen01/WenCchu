package lemon.pagesLesson.Material.Music;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteMusic extends BasePage {

    private By ClickLesson = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[3]/li/div/span");

    private By ClickMaterial = By.xpath("/html/body/div[2]/ul/div[5]/a/li/span");

    private By ClickMusic = By.xpath("//div[@role='tablist']//div[3]");

    private By ClickDeleteButton  = By.xpath("//table[@class='el-table__body']//tbody//tr[1]//td[6]//div//div//div[3]");

    private By ClickEnter = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[2]/div[5]/div/div/div[3]/span/button[2]/span");

    public DeleteMusic(WebDriver driver) {
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

    public void ClickDeleteButton(){
        click(ClickDeleteButton,"删除按钮");
    }

    public void ClickEnter(){
        click(ClickEnter,"确定");
    }
}
