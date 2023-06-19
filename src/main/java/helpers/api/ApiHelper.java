package helpers.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Class for working with api functions **/
public class ApiHelper {


    // simple functions for work with JSON
    public static String getParamJson(String param)  {
        return param.replaceAll("\\[\"|\"\\]", "");

    }
    public static String clearQuery(String param)  {
        return param.replaceAll("^\\[|\\]$", "");

    }

    public static String getResource(String name) {

        try {
            return new String(Files.readAllBytes(Paths.get(name)));
        } catch (IOException ex) {
            //Logger.getLogger(testResult.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }


}
