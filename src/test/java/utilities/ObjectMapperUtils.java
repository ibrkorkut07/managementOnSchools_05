package utilities;






import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.jsoup.nodes.Document.OutputSettings.Syntax.xml;

public class ObjectMapperUtils {

    public static <T> T convertJsonToJava(String json,Class<T> tClass){

        try {
           return new ObjectMapper().readValue(json,tClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
