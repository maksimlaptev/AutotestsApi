package helpers;

import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PUBLIC)
/** The class generates various data for tests**/
public class Generator {
    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userName = faker.name().username(),
            company = faker.company().name(),
            email = faker.internet().emailAddress(),
            longName = faker.lorem().characters(130,false,false),
            phoneNumb = "+7900" + faker.number().digits(7),
            id = String.valueOf(faker.idNumber());
}
