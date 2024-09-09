package base.asserts;

import base.SeleniumActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SeleniumAsserts {

    private SeleniumActions base;

    public SeleniumAsserts(SeleniumActions base){
        this.base = base;
    }

    public SeleniumAsserts assertText(By locator, String text) {
        String actualText = base.getDriver().findElement(locator).getText();
        Assert.assertEquals(actualText, text);

        return this;
    }

}
