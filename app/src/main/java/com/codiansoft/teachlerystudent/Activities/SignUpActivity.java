package com.codiansoft.teachlerystudent.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.codiansoft.teachlerystudent.R;


public class SignUpActivity extends AppCompatActivity {

    AppCompatSpinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        spinner=findViewById(R.id.regsiter_as_spinner);

        String[] items={"Student" , "Tutor" , "Institute"};

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.regsiter_as_items, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
