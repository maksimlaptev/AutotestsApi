package apiTests;

import env.Base_api;
import helpers.Generator;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.PetsApiSteps;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class TestApi_Pets extends Base_api {

    Generator generator;
    PetsApiSteps petsApiSteps = new PetsApiSteps();

    @BeforeMethod
    private void getTokensForMerchant(){
        generator = new Generator();
    }

    @AfterMethod
    private void logout(){

    }

    @Test
    @Description("Создание нового пета.")
    public void testCreateNewPets() throws MalformedURLException, UnsupportedEncodingException {
        // prepare
        String petName = generator.getFirstName();

        //action
        petsApiSteps.createNewPet(petName);


    }

}
