package lemon.pages;

import lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *文储
 */
public class IndexPage extends BasePage {
    //登录链接
    //private By login = By.xpath("//a[text()='登录']");
    //商品列表元素
    //private By goodsList = By.linkText("商品列表");
    //要浏览的商品
    //private By selectedGoods = By.xpath("//div[text()='香梨']");
    //购物车
    //private By cart = By.xpath("//span[@data-route='cart']");

    private By JieDian = By.xpath("//ul[@role='menubar']//li[3]");

    private WebDriver driver;

    public IndexPage(WebDriver driver){
        super(driver);
    }

    /*public void clickLogin(){
        //driver.findElement(login).click();
        //waitElementClickable(driver,login).click();
        click(login,"主页-登录链接");
    }

    public void clickGoodslist(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //waitElementClickable(driver,goodsList).click();
        click(goodsList,"主页-商品列表");
    }

    public void selectGoods(){
        //waitElementClickable(driver,selectedGoods).click();
        click(selectedGoods,"主页-浏览商品");
    }

    public void clickCart(){
        //waitElementClickable(driver,cart).click();
        click(cart,"主页-购物车");
    }*/

    public void clickSiYao(){
        click(JieDian,"主页-私钥管理");
    }


}
