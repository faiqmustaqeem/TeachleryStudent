package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 06/01/2018.
 */

public class BookingsModel {
    private String name;
    private String course_name;
    private String date;
    private String time;
    private String status;

    public BookingsModel(String name , String course_name , String date , String time , String status)
    {
        this.name=name;
        this.course_name=course_name;
        this.date=date;
        this.time=time;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
