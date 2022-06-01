package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddHotLesson extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div/span");

    private By ClickHot = By.xpath("/html/body/div[2]/ul/div[3]/a/li/span");

    private By ClickLesson = By.xpath("//div[@class='body']//button[3]");

    private By choice1 = By.xpath("//div[@class='el-dialog__body']//tbody//tr[1]//span[@class='el-checkbox__inner']");

    private By choice2 = By.xpath("//div[@class='el-dialog__body']//tbody//tr[2]//span[@class='el-checkbox__inner']");

    private By choice3 = By.xpath("//div[@class='el-dialog__body']//tbody//tr[3]//span[@class='el-checkbox__inner']");

    private By Enter = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[5]/div/div/div[2]/div/div[2]/div[4]/button[2]/span");

    public AddHotLesson(WebDriver driver){
        super(driver);
    }

    public void Click(){
        click(Click,"点击店铺");
    }

    public void ClickHot(){
        click(ClickHot,"点击热门推荐");
    }

    public void ClickLesson(){
        click(ClickLesson,"点击选择课程");
    }

    public void choice1(){
        click(choice1,"选择区块链基础课程");
    }

    public void choice2(){
        click(choice2,"选择区块链基础课程");
    }

    public void choice3(){
        click(choice3,"选择区块链基础课程");
    }

    public void Enter(){
        click(Enter,"点击确定");
    }
}
