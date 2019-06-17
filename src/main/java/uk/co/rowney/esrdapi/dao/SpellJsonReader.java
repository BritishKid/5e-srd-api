package uk.co.rowney.esrdapi.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Repository;
import uk.co.rowney.esrdapi.model.Spell;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

@Repository
public class SpellJsonReader extends JsonReader{

    private Gson gson = new Gson();

    public List<Spell> getAllSpells() throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<List<Spell>>() {
        }.getType();
        URL url = getClass().getResource("/json/spells/Spells.json");
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));
        return gson.fromJson(reader, REVIEW_TYPE);
    }
}
