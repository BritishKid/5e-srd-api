package uk.co.rowney.esrdapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.rowney.esrdapi.model.Background;
import uk.co.rowney.esrdapi.service.BackgroundService;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class BackgroundController {

    @Autowired
    private BackgroundService backgroundService;

    @RequestMapping("/background/all")
    public List<String> getAllBackgrounds() throws FileNotFoundException {

        return backgroundService.getBackgroundList();
    }

    @RequestMapping(path="/background/name={backgroundName}")
    public Background getSpecificBackground(@PathVariable("backgroundName") String backgroundName) throws FileNotFoundException {

        return backgroundService.getBackground(backgroundName);
    }
}
