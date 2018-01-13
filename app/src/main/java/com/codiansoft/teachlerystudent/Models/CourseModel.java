package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 08/01/2018.
 */

public class CourseModel {

    private String courseName;
    private String courseDescription;
    private String imageLink;

    public CourseModel( String courseName, String courseDescription ,String imageLink)
    {
        this.courseName=courseName;
        this.courseDescription=courseDescription;
        this.imageLink=imageLink;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
