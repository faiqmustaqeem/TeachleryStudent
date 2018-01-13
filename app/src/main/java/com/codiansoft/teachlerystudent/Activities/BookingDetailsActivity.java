package com.codiansoft.teachlerystudent.Activities;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.codiansoft.teachlerystudent.R;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class BookingDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Set up the white button on the lower right corner
        // more or less with default parameter
        final ImageView fabIconNew = new ImageView(this);
        fabIconNew.setImageDrawable(getResources().getDrawable(R.drawable.click_me_fab));
        final FloatingActionButton rightLowerButton = new FloatingActionButton.Builder(this)
                .setContentView(fabIconNew)
                .setBackgroundDrawable(getResources().getDrawable(R.drawable.circle1_fab))
                .build();

        FloatingActionButton.LayoutParams starParams = new FloatingActionButton.LayoutParams(80,80);
        starParams.setMargins(20,20,20,20);

        SubActionButton.Builder rLSubBuilder = new SubActionButton.Builder(this);
        rLSubBuilder.setBackgroundDrawable(getResources().getDrawable(R.drawable.circle1_fab));

        ImageView rlIcon1 = new ImageView(this);
        rlIcon1.setLayoutParams(starParams);

        ImageView rlIcon2 = new ImageView(this);
        rlIcon2.setLayoutParams(starParams);

        ImageView rlIcon3 = new ImageView(this);
        rlIcon3.setLayoutParams(starParams);

        ImageView rlIcon4 = new ImageView(this);
        rlIcon4.setLayoutParams(starParams);


        rlIcon1.setImageDrawable(getResources().getDrawable(R.drawable.question_mark_fab));


        rlIcon2.setImageDrawable(getResources().getDrawable(R.drawable.comment_fab));


        rlIcon3.setImageDrawable(getResources().getDrawable(R.drawable.call_fab));



        rlIcon4.setImageDrawable(getResources().getDrawable(R.drawable.mail_fab));



        // Build the menu with default options: light theme, 90 degrees, 72dp radius.
        // Set 4 default SubActionButtons
        final FloatingActionMenu rightLowerMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(rLSubBuilder.setContentView(rlIcon1).build())
                .addSubActionView(rLSubBuilder.setContentView(rlIcon2).build())
                .addSubActionView(rLSubBuilder.setContentView(rlIcon3).build())
                .addSubActionView(rLSubBuilder.setContentView(rlIcon4).build())
                .attachTo(rightLowerButton)
                .build();

        // Listen menu open and close events to animate the button content view
        rightLowerMenu.setStateChangeListener(new FloatingActionMenu.MenuStateChangeListener() {
            @Override
            public void onMenuOpened(FloatingActionMenu menu) {
                // Rotate the icon of rightLowerButton 45 degrees clockwise
                fabIconNew.setRotation(0);
                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 45);
                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                animation.start();
            }

            @Override
            public void onMenuClosed(FloatingActionMenu menu) {
                // Rotate the icon of rightLowerButton 45 degrees counter-clockwise
                fabIconNew.setRotation(45);
                PropertyValuesHolder pvhR = PropertyValuesHolder.ofFloat(View.ROTATION, 0);
                ObjectAnimator animation = ObjectAnimator.ofPropertyValuesHolder(fabIconNew, pvhR);
                animation.start();
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
