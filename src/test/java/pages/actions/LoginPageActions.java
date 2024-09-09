package pages.actions;

import io.cucumber.java.eo.Se;

import static base.SeleniumBuilder.Selenium;
import static pages.screen.LoginPageScreen.*;

public class LoginPageActions {

    private final String URL_LOGIN_SWAGLABS = "https://www.saucedemo.com/";

    public void visitarPagina() {
        Selenium()
                .visit(URL_LOGIN_SWAGLABS)
                .perform();
    }

    public void validarCargaLogo() {
        Selenium()
                .waitForElementToAppear(lblLoginLogo, 30)
                .assertText(lblLoginLogo, "Swag Labs")
                .perform();
    }

    public void completarCampoUsername(String usuario) {
        Selenium()
                .waitForElementToAppear(txtCampoUsuario, 30)
                .waitType(txtCampoUsuario, usuario, 30)
                .perform();
    }

    public void completarCampoPassword(String contrasenia) {
        Selenium()
                .waitForElementToBeEnabled(txtCampoContrasenia, 30)
                .typeKeys(txtCampoContrasenia, contrasenia)
                .perform();
    }

    public void clickearBotonLogin() {
        Selenium()
                .waitClick(btnLogin, 30)
                .perform();
    }

    public void validarBotonLoginInhabilitado() {
        Selenium()
                .waitForElementToDisappear(btnLogin, 30)
                .perform();
    }

}
