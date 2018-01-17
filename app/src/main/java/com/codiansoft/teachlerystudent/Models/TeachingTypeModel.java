package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 15/01/2018.
 */

public class TeachingTypeModel {
    private String type;
    private boolean isChecked;

    public TeachingTypeModel(String type,boolean isChecked)
    {
        this.setType(type);
        this.setChecked(isChecked);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
