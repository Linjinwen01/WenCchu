package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 */
public class CartPage extends BasePage {
    //商品标题
    private By goodsTitle = By.xpath("//div[@class='activity-goods']//a[@class='name']");
    //商品价格
    private By goodsPrice = By.xpath("//div[@class='unit-price']");
    //商品数量
    private By goodsNum = By.xpath("//input[@class='number']");
    private WebDriver driver;

    public CartPage(WebDriver driver){
        super(driver);
    }

    /**
     * 获取购物车页面的商品标题
     * @return
     */
    public String getGoodsTitle(){
        return getElementText(goodsTitle,"购物车页面-商品标题");
    }

    public String getGoodsPrice(){
        return getElementText(goodsPrice,"购物车页面-商品价格").trim();
    }

    public String getGoodsNum(){
        return getElementAttribute(goodsNum,"value","购物车页面-商品数量");
    }

}
