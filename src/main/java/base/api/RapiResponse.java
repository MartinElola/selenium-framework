package base.api;

import io.restassured.response.Response;


public class RapiResponse {

    private String text;
    private int code;
    private Response response;

    public RapiResponse(Response response){
        this.text = response.asString();
        this.code = response.getStatusCode();
        this.response = response;
    }

    public String getText(){
        return text;
    }

    public int getCode(){
        return code;
    }

}
