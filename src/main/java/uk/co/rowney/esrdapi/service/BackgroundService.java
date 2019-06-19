package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.BackgroundJsonReader;
import uk.co.rowney.esrdapi.model.Background;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class BackgroundService {

    @Autowired
    private BackgroundJsonReader backgroundJsonReader;

    public List<String> getBackgroundList() throws FileNotFoundException {

        return backgroundJsonReader.getListOf("Backgrounds");
    }

    public Background getBackground(String backgroundName) {
        return null;
    }
}
