package uk.co.rowney.esrdapi.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Repository;
import uk.co.rowney.esrdapi.model.Background;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;

@Repository
public class BackgroundJsonReader extends JsonReader {
    private Gson gson = new Gson();

    public Background getBackground(String backgroundName) throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<Background>() {
        }.getType();
        URL url = getClass().getResource(String.format("/json/backgrounds/%s.json", backgroundName));
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));

        return gson.fromJson(reader, REVIEW_TYPE);
    }


}
