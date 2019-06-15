package uk.co.rowney.esrdapi.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RaceJsonReader extends JsonReader {
    public String getRace(String raceName) {
        return raceName;
    }
}
