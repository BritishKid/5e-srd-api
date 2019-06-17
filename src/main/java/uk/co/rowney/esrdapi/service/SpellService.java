package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.SpellJsonReader;
import uk.co.rowney.esrdapi.model.Spell;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpellService {

    @Autowired
    private SpellJsonReader spellJsonReader;

    public Map<Integer, String> getAllSpells() throws FileNotFoundException {
        List<Spell> allSpells = spellJsonReader.getAllSpells();
        Map<Integer, String> spellMap = new HashMap<>();

        for (Spell spell: allSpells) {
            spellMap.put(spell.getId(), spell.getName());
        }

        return spellMap;
    }
}
