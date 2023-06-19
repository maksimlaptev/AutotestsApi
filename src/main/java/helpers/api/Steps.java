package helpers.api;

import io.restassured.response.Response;

public class Steps {

    public Response checkResponseWithStatusCodeAndLogView(Response response, int statusCode) {
        response.then()
                .log().body()
                .statusCode(statusCode);
        return response;
    }
}
