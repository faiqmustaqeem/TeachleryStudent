package com.codiansoft.teachlerystudent.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codiansoft.teachlerystudent.R;


public class CourseDetailsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detailsactivity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
