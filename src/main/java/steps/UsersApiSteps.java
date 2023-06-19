package steps;


import api_model.response.createNewPet.RespNewPet;
import com.jayway.jsonpath.JsonPath;
import env.Base_api;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static constants.end_point.Endpoints.*;
import static helpers.api.ApiHelper.getParamJson;
import static helpers.api.ApiHelper.getResource;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;

public class UsersApiSteps extends Base_api {

    public void createNewUser(String id, String userName, String firstName, String lastName,
                                         String email, String phone) {
        String body = getUserJson(id,userName,firstName,lastName,email,phone);
        step( "Создание нового user", () -> {

            String response = given()
                    .spec(defaultSpec)
                    .body(body)
                    .post(user.path()).asString();

            // steps.checkResponseWithStatusCodeAndLogView(response, 200);
            String msg = getParamJson(JsonPath.read(response, "$..code").toString());

            Assert.assertEquals(msg,"[250]","Msg should be displayed.");

        });
    }

    public String getUserJson(String id, String userName, String firstName, String lastName,
    String email, String phone) {
        String textBlock = getResource("src/test/resources/Api/user.json");

        textBlock = textBlock
                .replace("__id", id)
                .replace("__username", userName)
                .replace("__firstName", firstName)
                .replace("__lastName", lastName)
                .replace("__email", email)
                .replace("__password", "1234")
                .replace("__phone", phone)
                .replace("__userStatus", "0")

        ;

        return textBlock;

    }

}
