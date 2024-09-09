package pages.screen;

import org.openqa.selenium.By;

public class LoginPageScreen {

    // Utilizo camelCase para los nombres de las variables.

    public static By txtCampoUsuario = By.id("user-name");
    public static By txtCampoContrasenia = By.id("password");
    public static By btnLogin = By.id("login-button");
    public static By lblLoginLogo = By.className("login_logo");

}
