package utilities;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
public class JsonUtils {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();//from codehaus
    }
    //1. Method: converts Json Data to Java Object.(De-Serialization)
    public static <T> T convertJsonToJava(String json, Class<T> cls) {//Generic Method
        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        //2. Method: converts Java Object to Json Data.(Serialization)

    public static String convertJavaObjectToJson(Object obj) {
        String jsonResult = null;
        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonResult;
    }


}