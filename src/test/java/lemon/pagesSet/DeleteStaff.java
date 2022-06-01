package lemon.pagesSet;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteStaff extends BasePage {

    private By Click = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[8]/li/div/span");

    private By ClickAdmin = By.xpath("/html/body/div[2]/ul/div[1]/a/li/span");

    private By ClickDeleteButton = By.xpath("//tbody//tr[1]//td[7]//div[@class='cell']//div//div[2]");

     public By EnterButton = By.xpath("//div[@class='el-dialog__wrapper']//div//div[3]//span//button[2]");


    public DeleteStaff(WebDriver driver) {
        super(driver);
    }

    public void Click() {
        click(Click, "设置");
    }

    public void ClickAdmin() {
        click(ClickAdmin, "员工列表");
    }

    public void ClickDeleteButton() {
        click(ClickDeleteButton, "删除按钮");
    }

    public void EnterButton(){
        click(EnterButton,"确定");
    }
}
