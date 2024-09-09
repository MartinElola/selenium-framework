package pages.actions;

import io.cucumber.java.eo.Se;

import static base.SeleniumBuilder.Selenium;
import static pages.screen.LoginPageScreen.*;

public class LoginPageActions {

    private final String URL_LOGIN_SWAGLABS = "https://www.saucedemo.com/";

    /* Les damos a los métodos una única responsabilidad.. completar un campo, hacer un click, etc, etc...*/

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
        /* Forma Nro 1 de completar un campo: esperando a que el elemento en cuestión este disponible para
        * interactuar...*/

        Selenium()
                .waitForElementToAppear(txtCampoUsuario, 30)
                .waitType(txtCampoUsuario, usuario, 30)
                .perform();
    }

    public void completarCampoPassword(String contrasenia) {
        /* Forma Nro 2 de completar un campo: directamente completando el mismo, presuponiendo que el campo ya se
        * encuentra disponible... */
        Selenium()
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
