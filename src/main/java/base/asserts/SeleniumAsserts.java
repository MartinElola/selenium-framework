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
        if (!actualText.equals(text)) {
            throw new AssertionError("El texto [" + actualText + "] no es igual a [" + text + "]");
        }
        return this;
    }

}
