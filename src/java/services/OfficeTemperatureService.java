package services;

import dataaccess.OfficeTemperatureDB;
import java.io.IOException;
import models.OfficeTemperature;

public class OfficeTemperatureService {
    private final String path;
    
    public OfficeTemperatureService(String path) {
        this.path = path;
    }
    
    public OfficeTemperature getCurrentOfficeTemperature() {
        OfficeTemperature officeTemperature;
        try {
            OfficeTemperatureDB temperatureDB = new OfficeTemperatureDB(path);
            officeTemperature = temperatureDB.getOfficeTemperature();
        } catch (IOException ex) {
            return null;
        }
        
        if (officeTemperature.getOfficeTemperature() < 0 || officeTemperature.getOfficeTemperature() > 100) {
            return null;  // your choice here: either return null or throw exception
        }
        
        return officeTemperature;
    }
    
    public boolean isInRange(OfficeTemperature officeTemperature) {
        return officeTemperature.getOfficeTemperature() >= 18 && officeTemperature.getOfficeTemperature() <= 22;
    }
}