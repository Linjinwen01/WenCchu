package lemon.test.sale;

import lemon.common.BaseTest;
import lemon.pagesOther.addOtherMessage;
import lemon.pagesSale.AddSaleRule;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddSaleRuleTest extends BaseTest {
    @Test
    public void test_rule_AddSaleRuleTest() throws InterruptedException{
        WebDriver driver = openBrowser("chrome");
        driver.get("http://192.168.8.44:9528/#/overview");
        Thread.sleep(3000);
        WebDriver.Window window = driver.manage().window();
        window.maximize();
        AddSaleRule addSaleRule = new AddSaleRule(driver);
        addSaleRule.ClickSale();
        Thread.sleep(3000);
        addSaleRule.ClickRatingRule();
        Thread.sleep(3000);
        addSaleRule.ClickAddRating();
        Thread.sleep(3000);
        addSaleRule.ClickRatingName();
        Thread.sleep(3000);
        addSaleRule.InputRatingName("文储推广团队");
        Thread.sleep(3000);
        addSaleRule.ClickRatingRule1();
        addSaleRule.ClickRule1();
        addSaleRule.ClearRule();
        Thread.sleep(3000);
        addSaleRule.ClickRatingRule2();
        addSaleRule.ClickRule2();
        addSaleRule.ClearRule2();
        Thread.sleep(3000);
        addSaleRule.ClickRatingRule3();
        addSaleRule.ClickRule3();
        addSaleRule.ClearRule3();
        Thread.sleep(3000);
        addSaleRule.InputRatingRule1("200");
        Thread.sleep(3000);
        addSaleRule.InputRatingRule2("2000");
        Thread.sleep(3000);
        addSaleRule.InputRatingRule3("20");
        Thread.sleep(3000);
        addSaleRule.ClickPromote();
        Thread.sleep(3000);
        addSaleRule.InputPromote("10%");
        Thread.sleep(3000);
        addSaleRule.ClickInvite();
        Thread.sleep(3000);
        addSaleRule.InputInvite("10%");
        Thread.sleep(3000);
        addSaleRule.Save();
    }
}
