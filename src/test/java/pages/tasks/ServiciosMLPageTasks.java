package pages.tasks;

import base.props.SeleniumProps;
import io.cucumber.java.es.*;
import pages.actions.ServiciosMLPageActions;

public class ServiciosMLPageTasks extends ServiciosMLPageActions {

    String baseURI;
    String endpoint;

    @Dado("un servicio de MercadoLibre para obtener departamentos")
    public void obtenerServicioDepartamentos() {
        baseURI = SeleniumProps.getProperty("ml_uris", "ML_DEPARTAMENTOS");
        endpoint = SeleniumProps.getProperty("ml_uris", "ML_DEPARTAMENTOS_END");
    }

    @Cuando("el usuario realiza una peticion para obtener departamentos")
    public void realizarPeticionDepartamentos() {
        obtenerCodigoDeRespuesta(baseURI + endpoint);
    }

    @Entonces("se valida la existencia de un campo {string}")
    public void validarBody(String campo) {
        validarExistenciaCampo(baseURI + endpoint, campo);
    }

}
