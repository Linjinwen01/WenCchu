package lemon.pagesSale;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddSaleRule extends BasePage {

    private By ClickSale = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[4]/a/li/span");

    private By ClickRatingRule = By.xpath("//div[@class='otherTabBtn']//div[5]");

    private By ClickAddRating = By.xpath("//div[@class='body']//div[@class='addLevel_btn']//div");

    private By ClickRatingName = By.xpath("//tbody//tr[4]//td[2]//div//div//div//input");

    private By InputRatingName = By.xpath("//tbody//tr[4]//td[2]//div//div//div//input");

    private By ClickRatingRule1 = By.xpath("//div[@class='edit_area']//label[1]//span[@class='el-checkbox__inner']");

    private By ClickRatingRule2 = By.xpath("//div[@class='edit_area']//label[2]//span[@class='el-checkbox__inner']");

    private By ClickRatingRule3 = By.xpath("//div[@class='edit_area']//label[3]//span[@class='el-checkbox__inner']");

    private By InputRatingRule1 = By.xpath("//div[@class='edit_area']//label[1]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By InputRatingRule2 = By.xpath("//div[@class='edit_area']//label[2]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By InputRatingRule3 = By.xpath("//div[@class='edit_area']//label[3]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClickPromote = By.xpath("//tbody//tr[4]//td[4]//div[@class='el-input']//input[@class='el-input__inner']");

    private By InputPromote = By.xpath("//tbody//tr[4]//td[4]//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClickInvite = By.xpath("//tbody//tr[4]//td[5]//div[@class='el-input']//input[@class='el-input__inner']");

    private By InputInvite = By.xpath("//tbody//tr[4]//td[5]//div[@class='el-input']//input[@class='el-input__inner']");

    private By Save = By.xpath("//tbody//tr[4]//td[6]//button[1]");

    private By ClickRule1 = By.xpath("//div[@class='edit_area']//label[1]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClickRule2 = By.xpath("//div[@class='edit_area']//label[2]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClickRule3 = By.xpath("//div[@class='edit_area']//label[3]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClearRule = By.xpath("//div[@class='edit_area']//label[1]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClearRule2 = By.xpath("//div[@class='edit_area']//label[2]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    private By ClearRule3 = By.xpath("//div[@class='edit_area']//label[3]//span[@class='el-checkbox__label']//div[@class='el-input']//input[@class='el-input__inner']");

    public AddSaleRule(WebDriver driver) {
        super(driver);
    }

    public void ClickSale(){
        click(ClickSale,"??????");
    }

    public void ClickRatingRule(){
        click(ClickRatingRule,"?????????????????????");
    }

    public void ClickAddRating(){
        click(ClickAddRating,"????????????");
    }

    public void ClickRatingName(){
        click(ClickRatingName,"??????????????????");
    }

    public void InputRatingName(String RatingName){
        type(InputRatingName,RatingName,"??????????????????");
    }

    public void ClickRatingRule1(){
        click(ClickRatingRule1,"??????????????????");
    }

    public void ClickRatingRule2(){
        click(ClickRatingRule2,"??????????????????");
    }

    public void ClickRatingRule3(){
        click(ClickRatingRule3,"??????????????????");
    }

    public void InputRatingRule1(String Rule1){
        type(InputRatingRule1,Rule1,"?????????????????????");
    }

    public void InputRatingRule2(String Rule2){
        type(InputRatingRule2,Rule2,"?????????????????????");
    }

    public void InputRatingRule3(String Rule3){
        type(InputRatingRule3,Rule3,"?????????????????????");
    }

    public void ClickPromote(){
        click(ClickPromote,"????????????????????????");
    }

    public void InputPromote(String Promote){
        type(InputPromote,Promote,"??????????????????????????????");
    }

    public void ClickInvite(){
        click(ClickInvite,"????????????????????????");
    }

    public void InputInvite(String Invite){
        type(InputInvite,Invite,"??????????????????????????????");
    }

    public void Save(){
        click(Save,"??????");
    }

    public void ClearRule(){
        clear(ClearRule,"??????");
    }

    public void ClearRule2(){
        clear(ClearRule2,"??????");
    }

    public void ClearRule3(){
        clear(ClearRule3,"??????");
    }


    public void ClickRule1(){
        click(ClickRule1,"?????????????????????");
    }

    public void ClickRule2(){
        click(ClickRule2,"?????????????????????");
    }

    public void ClickRule3(){
        click(ClickRule3,"?????????????????????");
    }
}
