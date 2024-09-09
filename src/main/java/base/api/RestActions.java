package base.api;

import base.utils.Substep;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

public class RestActions {

    private List<Substep> substeps;

    public RestActions() {
        this.substeps = new ArrayList<>();
    }

    public void perform() {
        substeps.forEach(substep -> {
            try {
                substep.runnable.run();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }

    //////////////////////////////////////////////////////////////////
    //////////////////////// API REST Methods ////////////////////////
    //////////////////////////////////////////////////////////////////

    public RestActions get(String url) {
        substeps.add(new Substep(() -> {
            RequestSpecification request = Rapi.prepareRequest(url);
            RapiResponse response = new RapiResponse(request.get().andReturn());

            System.out.println("Código de respuesta: " + response.getCode());
            System.out.println("Respuesta: " + response.getText());
        }));
        return this;
    }

    public RestActions bodyContains(String url, String campo) {
        substeps.add(new Substep(() -> {
            RequestSpecification request = Rapi.prepareRequest(url);
            RapiResponse response = new RapiResponse(request.get().andReturn());

            if (!response.getText().contains(campo)) {
                throw new RuntimeException("El campo " + campo + " no se encuentra en la respuesta");
            }
        }));
        return this;
    }

    public RestActions assertStatusCode(String url, int expectedStatusCode) {
        substeps.add(new Substep(() -> {
            RequestSpecification request = Rapi.prepareRequest(url);
            RapiResponse response = new RapiResponse(request.get().andReturn());

            if (response.getCode() != expectedStatusCode) {
                throw new RuntimeException("El código de respuesta esperado no coincide con el obtenido. Esperado: " + expectedStatusCode + " Obtenido: " + response.getCode());
            }
        }));
        return this;
    }

}
