package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class TutorsModel {
    private String name;
    private String demo;
    private String experience;
    private String qualification;
    private String imageLink;
    private boolean isOnline;


    public TutorsModel(String name,String demo,String experience,String qualification,String imageLink,boolean isOnline)
    {
        this.name=name;
        this.demo=demo;
        this.experience=experience;
        this.qualification=qualification;
        this.imageLink=imageLink;
        this.isOnline=isOnline;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
