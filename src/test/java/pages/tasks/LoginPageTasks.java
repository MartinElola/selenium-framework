package pages.tasks;

import base.props.SeleniumProps;
import io.cucumber.java.es.*;
import org.testng.Assert;
import pages.actions.LoginPageActions;

public class LoginPageTasks extends LoginPageActions {

    /* Comformamos los steps a partir de un conjunto de acciones, por ello extendemos la clase LoginPageActions,
    * respetando el patrón ScreenPlay..*/

    @Dada("la pagina de login")
    public void ingresoALaPaginaDeLogin() {
        visitarPagina();
        validarCargaLogo();
    }

    @Cuando("el usuario {string} ingresa sus datos de ingreso")
    public void ingresarDatosUsuario(String usuario) {
        /* Hacemos uso de la clase SeleniumProps para facilitar el acceso a los archivos .properties*/
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
