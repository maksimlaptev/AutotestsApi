package steps;

import api_model.request.createNewPet.Category;
import api_model.request.createNewPet.ReqCreateNewPet;
import api_model.request.createNewPet.TagsItem;
import api_model.response.createNewPet.RespNewPet;
import env.Base_api;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static constants.end_point.Endpoints.pet;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;

public class PetsApiSteps extends Base_api {

    public void createNewPet(String petName) {
        List<String> url = new ArrayList<>();
        step( "Создание нового пета", () -> {
            ReqCreateNewPet body = ReqCreateNewPet.builder().id(1)
                    .category(Category.builder().id(1).name("Dogs").build())
                    .name(petName).photoUrls(url)
                    .tags(Collections.singletonList(TagsItem.builder().id(1).name("tags name").build()))
                    .status("available").build();
            Response response = given()
                    .spec(defaultSpec)
                    .body(body)
                    .post(pet.path());

            steps.checkResponseWithStatusCodeAndLogView(response, 200).as(RespNewPet.class);

        });
    }

}
