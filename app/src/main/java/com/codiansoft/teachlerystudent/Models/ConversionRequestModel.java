package com.codiansoft.teachlerystudent.Models;

/**
 * Created by CodianSoft on 08/01/2018.
 */

public class ConversionRequestModel {

    private String email ;
    private String date ;
    private String time ;
    private String status;
    private String count ;

    public ConversionRequestModel(String email ,String date ,String time ,String status,String count)
    {
        this.setEmail(email);
        this.setDate(date);
        this.setTime(time);
        this.setStatus(status);
        this.setCount(count);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
