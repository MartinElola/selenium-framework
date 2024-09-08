package base.buttons;

import base.SeleniumActions;
import base.driver.DriverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumButtons {

    private SeleniumActions base;

    public SeleniumButtons(SeleniumActions base) {
        this.base = base;
    }

    public SeleniumButtons click(By locator) {
        base.getDriver().findElement(locator).click();
        return this;
    }

    public SeleniumButtons waitClick(By locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(base.getDriver(), Duration.ofSeconds(seconds));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();

        return this;
    }

}
