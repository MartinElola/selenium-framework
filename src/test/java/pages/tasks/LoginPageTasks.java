package pages.tasks;

import io.cucumber.java.es.*;
import pages.actions.LoginPageActions;

public class LoginPageTasks extends LoginPageActions {

    @Dada("la pagina de login")
    public void ingresoALaPaginaDeLogin() {
        visitarPagina();
    }

}
