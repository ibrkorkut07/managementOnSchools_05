package us16_test_data;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper mapper ;

    static{

        mapper = new ObjectMapper();

    }
    //1st. Method: this method will convert a json data to java object (De-serialization)

    public static <T> T convertJsonToJavaObject(String json, Class<T> cls){//Generic Method

        T javaResult = null;
        try {
            javaResult = mapper.readValue(json, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaResult;
    }

    //2nd. Method: This method will convert the java object to Json data (Serialization)

    public static String convertJavaObjectToJson (Object obj){

        String jsonResult = null;

        try {
            mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResult;
    }
}
