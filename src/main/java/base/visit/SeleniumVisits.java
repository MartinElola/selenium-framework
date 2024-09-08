package base.visit;

import base.SeleniumActions;

public class SeleniumVisits {

    private SeleniumActions base;

    public SeleniumVisits(SeleniumActions base) {
        this.base = base;
    }

    public SeleniumVisits visit(String url) {
        base.getDriver().get(url);
        return this;
    }

}
