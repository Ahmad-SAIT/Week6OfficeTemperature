package models;

import java.io.Serializable;


public class OfficeTemperature implements Serializable {
    private int officeTemperature;

    public OfficeTemperature(int officeTemperature) {
        this.officeTemperature = officeTemperature;
    }

    public OfficeTemperature() {
    }

    public int getOfficeTemperature() {
        return officeTemperature;
    }

    public void setOfficeTemperature(int officeTemperature) {
        this.officeTemperature = officeTemperature;
    }
    
}