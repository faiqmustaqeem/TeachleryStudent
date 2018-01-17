package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 15/01/2018.
 */

public class LocationModel {
    private String location;
    private boolean isChecked;

    public LocationModel( String location,boolean isChecked){

        this.setLocation(location);
        this.setChecked(isChecked);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
