package configs;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/env/data_env.properties"
})

/** data for tests of the merchant.
   path config/env/data_env.properties **/
public interface DataEnvConfig extends Config {

    @Key("petstore.url")
    String getPetStoreUrl();

}
