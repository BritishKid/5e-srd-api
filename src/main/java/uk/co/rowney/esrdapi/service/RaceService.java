package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.RaceJsonReader;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class RaceService {

    @Autowired
    private RaceJsonReader raceJsonReader;

    public List<String> getRaceList() throws FileNotFoundException {
        return raceJsonReader.getListOf("Races");
    }

    public String getRace(String raceName) throws FileNotFoundException {
        return raceJsonReader.getRace(raceName);
    }
}
