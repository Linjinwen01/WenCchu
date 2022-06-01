package lemon.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 */
public class BasePage {
    private Logger logger = Logger.getLogger(BasePage.class);
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }


    /**
     * 显式等待-->等待元素存在的封装
     *
     * @param by
     * @return
     */
    public WebElement waitElementPresence(By by) {
        //1、实例化webDriverWait对象
        WebDriverWait webDriverWait = new WebDriverWait(driver, 8);
        //2、设置显式等待的条件（可见、可被点击...）
        WebElement webElement = webDriverWait.
                until(ExpectedConditions.presenceOfElementLocated(by));
        return webElement;
    }



    /**
     * 显式等待-->等待元素可见的封装
     *
     * @param by
     * @return
     */
    public WebElement waitElementVisible(By by) {
        //1、实例化webDriverWait对象
        WebDriverWait webDriverWait = new WebDriverWait(driver, 8);
        //2、设置显式等待的条件（可见、可被点击...）
        WebElement webElement = webDriverWait.
                until(ExpectedConditions.visibilityOfElementLocated(by));
        return webElement;
    }

    /**
     * 显式等待-->等待元素可被点击的封装
     *
     * @param by
     * @return
     */
    public WebElement waitElementClickable(By by) {
        //1、实例化webDriverWait对象
        WebDriverWait webDriverWait = new WebDriverWait(driver, 8);
        //2、设置显式等待的条件（可见、可被点击...）
        WebElement webElement = webDriverWait.
                until(ExpectedConditions.elementToBeClickable(by));
        return webElement;
    }



    public void click(By by,String desc){
        //日志记录
        logger.info("点击了元素【"+desc+"】");
        waitElementClickable(by).click();
    }

    public void clear(By by,String desc){
        //日志记录
        logger.info("清除元素【"+desc+"】");
        waitElementClickable(by).clear();
    }


    public void type(By by,String data,String desc){
        logger.info("往元素【"+desc+"】输入了数据【"+data+"】");
        waitElementVisible(by).sendKeys(data);
    }



    public String getElementText(By by,String desc){
        String text = waitElementVisible(by).getText();
        logger.info("获取元素【"+desc+"】文本值【"+text+"】");
        return text;
    }

    public String getElementAttribute( By by,String attributeName, String desc){
        String value = waitElementVisible(by).getAttribute(attributeName);
        logger.info("获取元素【"+desc+"】的属性【"+attributeName+"】对应的属性值为【"+value+"】");
        return value;
    }
}
