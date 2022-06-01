package lemon.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**

 */
public class BaseTest {
    private Logger logger = Logger.getLogger(BaseTest.class);

    /**
     * 统一封装的打开浏览器的方法
     * @param browserName 对应浏览器名字
     */
    public WebDriver openBrowser(String browserName){
        if("chrome".equalsIgnoreCase(browserName)){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            logger.info("=====================打开了chrome浏览器====================");
            return new ChromeDriver();
        }else if("firefox".equalsIgnoreCase(browserName)){
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
            logger.info("=====================打开了Firefox浏览器====================");
            return new FirefoxDriver();
        }else if("ie".equalsIgnoreCase(browserName)){
            //取消IE安全设置（忽略IE的Protected Mode的设置）
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //忽略IE的缩放设置问题
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            //告诉代码驱动程序放在那里
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
            logger.info("=====================打开了IE浏览器====================");
            return new InternetExplorerDriver(capabilities);
        }else {
            System.out.println("浏览器类型暂不支持，请确认你的浏览器名字是否正确");
            return null;
        }
    }

    public void toUrl(WebDriver driver,String url){
        //记录日志
        logger.info("访问网页【"+url+"】");
        driver.get(url);
    }


}
