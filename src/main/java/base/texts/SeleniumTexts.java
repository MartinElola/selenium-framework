package base.texts;
import base.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumTexts {

    private SeleniumActions base;

    public SeleniumTexts(SeleniumActions base) {
        this.base = base;
    }

    public SeleniumTexts typeKeys(By locator, String text) {
        base.getDriver().findElement(locator).sendKeys(text);
        return this;
    }

    public SeleniumTexts waitType(By locator, String text, long seconds) {
        WebDriverWait wait = new WebDriverWait(base.getDriver(), Duration.ofSeconds(seconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.sendKeys(text);
        return this;
    }

}
