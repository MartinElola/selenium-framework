package pages.actions;
import base.api.RapiResponse;

import static base.api.RestBuilder.Rapi;


public class ServiciosMLPageActions {

    public void obtenerCodigoDeRespuesta(String servicio){
        Rapi()
            .get(servicio)
            .perform();
    }

    public void validarExistenciaCampo(String url, String campo) {
        Rapi()
            .bodyContains(url, campo)
            .perform();
    }

}
