package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PhotoPage extends BasePage{

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div/span");

    private By ClickPhoto = By.xpath("/html/body/div[2]/ul/div[1]/a/li/span");

    private By ClickButton = By.xpath("//section[@class='app-main']//button[3]");

    private By SendPhotoName = By.xpath("//*[@id='app']//div[@class='el-input']//input[@placeholder='请输入轮播图名称']");

    private By selectPhoto =By.xpath("//div[@class='body']//div[@class='choosePicBtn']//div");

    private By selectLesson = By.xpath("//tbody//tr[1]//span[@class='el-radio__inner']");

    private By SelectButton = By.xpath("//div[@class='el-dialog__body']//button[@class='el-button el-button--primary']");

    private By ClickSendPhotoAddress = By.xpath("//*[@id='app']/div/div[2]/section/div/div[3]/form/div[3]/div/div[1]/input");

    private By SendPhotoAddress = By.xpath("//*[@id='app']/div/div[2]/section/div/div[3]/form/div[3]/div/div[1]/input");

    private By DateTime = By.xpath("//input[@placeholder='选择日期时间']");

    private By ClickDate = By.xpath("//table[@class='el-date-table']//tr[4]//td[6]");

    private By ClickDateButton  = By.xpath("//div[@class='el-picker-panel__footer']//button[2]");

    private By save = By.xpath("//div[@class='body']//form//div[5]//button[2]");

    public PhotoPage(WebDriver driver){
        super(driver);
    }

    public void click(){
        click(Click,"主页-店铺");
    }

    public void clickPhoto(){
        click(ClickPhoto,"主页-轮播图管理");
    }

    public void clickButton(){
        click(ClickButton,"主页-新增轮播图");
    }

    public void SendPhotoName(String PhotoName){
        type(SendPhotoName,PhotoName,"轮播图名称输入框");
    }

    public void setSelectPhoto(){
        click(selectPhoto,"上传图片");
    }

    public void setSelectLesson(){
        click(selectLesson,"选择课程");
    }

    public void setSelectButton(){
        click(SelectButton,"点击确定");
    }

    public void setClickSendPhotoAddress(){
        click(ClickSendPhotoAddress,"点击跳转至");
    }

    public void setSendPhotoAddress(String address){
        type(SendPhotoAddress,address,"输入了地址www.baidu.com");
    }

    public void setDateTime(){
        click(DateTime,"点击定时上传");
    }

    public void setClickDate(){
        click(ClickDate,"选择日期");
    }

    public void setClickDateButton(){
        click(ClickDateButton,"选择日期后点击确定");
    }

    public void setSave(){
        click(save,"点击保存");
    }
}
