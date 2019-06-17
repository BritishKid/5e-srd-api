package uk.co.rowney.esrdapi.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

@Repository
public class JsonReader {

    private Gson gson = new Gson();

    public List<String> getListOf(String source) throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<List<String>>() {}.getType();
        URL url = getClass().getResource(String.format("/json/lists/%s.json", source));
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));

        return gson.fromJson(reader, REVIEW_TYPE);
    }
}
