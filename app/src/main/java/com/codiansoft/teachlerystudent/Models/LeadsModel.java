package com.codiansoft.teachlerystudent.Models;

import java.util.List;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class LeadsModel {
    private String name ;
    private String title ;
    private String description;
    private String imageLink;


    public LeadsModel(String name ,String title ,String description,String imageLink)
    {
        this.name=name;
        this.title=title;
        this.description=description;
        this.imageLink=imageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
