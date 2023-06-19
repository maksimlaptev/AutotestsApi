package env;

import configs.DataEnvConfig;
import helpers.api.Steps;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;

import static helpers.api.Spec_api.default_spec;

public class Base_api {
    protected static final DataEnvConfig dataEnv = ConfigFactory.create(DataEnvConfig.class, System.getProperties());
    String urlPetStore;
    public static RequestSpecification defaultSpec;
    public static Steps steps = new Steps();
    @BeforeSuite
    public void setup() {

        urlPetStore = dataEnv.getPetStoreUrl();

        RestAssured.defaultParser = Parser.JSON;
        defaultSpec = default_spec(urlPetStore);


    }

    protected void getTokens(){

    }

}