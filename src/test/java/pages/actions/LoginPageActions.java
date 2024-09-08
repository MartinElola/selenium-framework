package pages.actions;

import static base.SeleniumBuilder.Selenium;

public class LoginPageActions {

    private final String URL_LOGIN_SWAGLABS = "https://www.saucedemo.com/";

    public void visitarPagina() {
        Selenium()
                .visit(URL_LOGIN_SWAGLABS)
                .perform();
    }

}
