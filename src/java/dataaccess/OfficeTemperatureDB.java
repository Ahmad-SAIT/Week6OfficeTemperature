package dataaccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import models.OfficeTemperature;

public class OfficeTemperatureDB {
    private final String path;
    
    public OfficeTemperatureDB(String path) {
        this.path = path;
    }
    
    public OfficeTemperature getOfficeTemperature() throws FileNotFoundException, IOException {
        BufferedReader br;
        br = new BufferedReader(new FileReader(new File(path)));
        String line = br.readLine();
        br.close();

        int temperature = Integer.parseInt(line);
        OfficeTemperature officeTemperature = new OfficeTemperature(temperature);
        return officeTemperature;
    }
}