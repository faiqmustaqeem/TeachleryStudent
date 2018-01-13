package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class TutorCourseModel {
    private String courseTitle;
    private String date;
    private String duration;
    private String day ;

    public TutorCourseModel(String courseTitle , String date , String duration , String day)
    {
        this.courseTitle=courseTitle;
        this.date=date;
        this.duration=duration;
        this.day=day;
    }
    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
