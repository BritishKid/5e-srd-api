package uk.co.rowney.esrdapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.rowney.esrdapi.service.RaceService;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class RaceController {

    @Autowired
    private RaceService raceService;

    @RequestMapping("/race/all")
    public List<String> getAllRaces() throws FileNotFoundException {
        return raceService.getRaceList();
    }

    @RequestMapping(path="/race/name={raceName}")
    public String getSpecficRace(@PathVariable("raceName") String raceName) throws FileNotFoundException {
        return raceService.getRace(raceName);
    }
}
