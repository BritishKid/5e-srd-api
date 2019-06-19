package uk.co.rowney.esrdapi.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Repository;
import uk.co.rowney.esrdapi.model.ClassInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;

@Repository
public class ClassJsonReader extends JsonReader {

    private Gson gson = new Gson();

    public ClassInfo getClass(String className) throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<ClassInfo>() {
        }.getType();
        URL url = getClass().getResource(String.format("/json/classes/%s.json", className));
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));

       return gson.fromJson(reader, REVIEW_TYPE);
    }

//    private String formatRequest(String className) {
//        className = className.substring(0, 1).toUpperCase() + className.substring(1).toLowerCase();
//        return className;
//    }
}
