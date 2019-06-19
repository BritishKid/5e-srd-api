package uk.co.rowney.esrdapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.rowney.esrdapi.model.ClassInfo;
import uk.co.rowney.esrdapi.service.ClassService;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class ClassController {

    @Autowired
    private ClassService classService;

    @RequestMapping("/class/all")
    public List<String> getAllClasses() throws FileNotFoundException {

        return classService.getClassList();
    }

    @RequestMapping(path="/class/name={className}")
    public ClassInfo getSpecificClass(@PathVariable("className") String className) throws FileNotFoundException {

        return classService.getClass(className);
    }
}
