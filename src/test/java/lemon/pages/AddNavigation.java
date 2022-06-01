package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNavigation extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div/span");

    private By ClickNavigation = By.xpath("/html/body/div[2]/ul/div[2]/a/li/span");

    private By ClickAddNavigation = By.xpath("//div[@class='body']//div[@class='search_area']//span");

    private By ClickAddNavigationName = By.xpath("//div[@class='body']//div[@class='el-input']//input[@placeholder='请输入导航名称']");

    private By SendAddNavigationName = By.xpath("//div[@class='body']//div[@class='el-input']//input[@placeholder='请输入导航名称']");

    private By selectPhoto =By.xpath("//div[@class='body']//div[@class='choosePicBtn']//div");

    private By selectLesson = By.xpath("//tbody//tr[1]//span[@class='el-radio__inner']");

    private By SelectButton = By.xpath("//div[@class='el-dialog__body']//button[@class='el-button el-button--primary']");

    private By ClickSendPhotoAddress = By.xpath("//*[@id='app']/div/div[2]/section/div/div[3]/form/div[3]/div/div[1]/input");

    private By SendPhotoAddress = By.xpath("//*[@id='app']/div/div[2]/section/div/div[3]/form/div[3]/div/div[1]/input");

    private By DateTime = By.xpath("//input[@placeholder='选择日期时间']");

    private By ClickDate = By.xpath("//table[@class='el-date-table']//tr[4]//td[6]");

    private By ClickDateButton  = By.xpath("//div[@class='el-picker-panel__footer']//button[2]");

    private By save = By.xpath("//div[@class='body']//form//div[5]//button[2]");



    public AddNavigation(WebDriver driver){
        super(driver);
    }

    public void click(){
        click(Click,"主页-店铺");
    }

    public void ClickNavigation(){
        click(ClickNavigation,"主页-图文导航管理");
    }

    public void ClickAddNavigation(){
        click(ClickAddNavigation,"主页-新增图文导航");
    }

    public void ClickAddNavigationName(){
        click(ClickAddNavigationName,"主页-点击导航");
    }

    public void SendAddNavigationName(String NavigationName){
        type(SendAddNavigationName,NavigationName,"导航名称输入");
    }

    public void selectPhoto(){
        click(selectPhoto,"上传图片");
    }

    public void SelectLesson(){
        click(selectLesson,"选择课程");
    }

    public void SelectButton(){
        click(SelectButton,"点击确定");
    }

    public void ClickSendPhotoAddress(){
        click(ClickSendPhotoAddress,"点击跳转至");
    }

    public void SendPhotoAddress(String address){
        type(SendPhotoAddress,address,"输入了地址www.baidu.com");
    }

    public void DateTime(){
        click(DateTime,"点击定时上传");
    }

    public void ClickDate(){
        click(ClickDate,"选择日期");
    }

    public void ClickDateButton(){
        click(ClickDateButton,"选择日期后点击确定");
    }

    public void save(){
        click(save,"点击保存");
    }

}
