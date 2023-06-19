package apiTests;

import env.Base_api;
import helpers.Generator;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.PetsApiSteps;
import steps.UsersApiSteps;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class TestApi_Users extends Base_api {

    Generator generator;
    UsersApiSteps usersApiSteps = new UsersApiSteps();

    @BeforeMethod
    private void getTokensForMerchant(){
        generator = new Generator();
    }

    @AfterMethod
    private void logout(){

    }

    @Test
    @Description("Создание нового юзера.")
    public void testCreateNewUser() {
        // prepare
        String id = generator.getId();
        String userName = generator.getUserName();
        String firstName = generator.getFirstName();
        String lastName = generator.getLastName();
        String email = generator.getEmail();
        String phoneNumber = generator.getPhoneNumb();

        //action
        usersApiSteps.createNewUser("12",userName,firstName,lastName,email,phoneNumber);


    }

}
