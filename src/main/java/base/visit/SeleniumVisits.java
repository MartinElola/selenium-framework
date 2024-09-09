package base.visit;

import base.SeleniumActions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumVisits {

    private SeleniumActions base;

    public SeleniumVisits(SeleniumActions base) {
        this.base = base;
    }

    public SeleniumVisits visit(String url) {
        base.getDriver().get(url);
        return this;
    }

    public SeleniumVisits checkUrl(String url) {
        WebDriverWait wait = new WebDriverWait(base.getDriver(), Duration.ofSeconds(30));
        wait.until(driver -> driver.getCurrentUrl().equals(url));
        return this;
    }

}
