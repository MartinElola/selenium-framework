package pages.tasks;

import base.props.SeleniumProps;
import io.cucumber.java.es.*;
import pages.actions.LoginPageActions;

public class LoginPageTasks extends LoginPageActions {

    @Dada("la pagina de login")
    public void ingresoALaPaginaDeLogin() {
        visitarPagina();
        validarCargaLogo();
    }

    @Cuando("el usuario {string} ingresa sus datos de ingreso")
    public void ingresarDatosUsuario(String usuario) {
        String usuario_props = SeleniumProps.getProperty("users", usuario);
        String password_props = SeleniumProps.getProperty("users", "PASSWORD_USER");

        completarCampoUsername(usuario_props);
        completarCampoPassword(password_props);
    }

    @Entonces("el usuario hace click en el boton de login")
    public void ingresarAlSistema() {
        clickearBotonLogin();
        validarBotonLoginInhabilitado();
    }

}
