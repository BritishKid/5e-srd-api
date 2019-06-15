package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.ClassJsonReader;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassJsonReader classJsonReader;

    public List<String> getClassList() throws FileNotFoundException {
        return classJsonReader.getListOf("Classes");
    }

    public String getClass(String className) throws FileNotFoundException {
        return classJsonReader.getClass(className);
    }
}
