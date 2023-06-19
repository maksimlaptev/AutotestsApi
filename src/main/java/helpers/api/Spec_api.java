package helpers.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Spec_api {

    public static RequestSpecification default_spec(String baseUrl) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .addFilter(LogFilter.filters().withCustomTemplates())
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification spec_client_with_token(String baseUrl, String token_session, String token_name) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .addCookie(""+token_name+"="+token_session+";")
                .setContentType(ContentType.JSON)
                .addFilter(LogFilter.filters().withCustomTemplates())
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification spec_upload_file(String baseUrl, String x_xsrf_token, String token_session, String token_name) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .addHeader("x-token",x_xsrf_token)
                .addCookie("TOKEN=" + x_xsrf_token +";"+""+token_name+"="+token_session+";")
                .setContentType("multipart/form-data")
                .addFilter(LogFilter.filters().withCustomTemplates())
                .log(LogDetail.ALL)
                .build();
    }

}
