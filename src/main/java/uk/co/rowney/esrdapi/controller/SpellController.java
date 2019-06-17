package uk.co.rowney.esrdapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.rowney.esrdapi.service.SpellService;

import java.io.FileNotFoundException;
import java.util.Map;

@RestController
public class SpellController {

    @Autowired
    private SpellService spellService;

    @RequestMapping("/spell/all")
    public Map<Integer, String> getAllSpells() throws FileNotFoundException {

        return spellService.getAllSpells();
    }
}
