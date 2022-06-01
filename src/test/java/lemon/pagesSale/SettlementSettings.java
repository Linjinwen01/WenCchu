package lemon.pagesSale;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettlementSettings extends BasePage {

    private By ClickSale = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/ul/div[4]/a/li/span");

    private By ClickSetting = By.xpath("//div[@class='otherTabBtn']//div[1]");

    private By ClickOPen = By.xpath("//*[@id=\"app\"]/div/div[2]/section/div/div[3]/form/div[2]/div/div/label[1]/span[1]/span");

    public SettlementSettings(WebDriver driver) {
        super(driver);
    }

}
