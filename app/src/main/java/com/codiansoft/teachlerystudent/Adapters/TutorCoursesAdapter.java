package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.codiansoft.teachlerystudent.Models.TutorCourseModel;
import com.codiansoft.teachlerystudent.R;


import java.util.List;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class TutorCoursesAdapter extends RecyclerView.Adapter<TutorCoursesAdapter.MyViewHolder> {

    List<TutorCourseModel> tutorCourseModelList;
    List<TutorCourseModel> tutorCourseModelListFiltered;
    Context context;

    public TutorCoursesAdapter(List<TutorCourseModel> list ,Context context )
    {
        this.tutorCourseModelList=list;
        this.tutorCourseModelListFiltered=list;
        this.context=context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView courseName , date , duration  , day;
        ImageView bin;
        public MyViewHolder(View itemView) {
            super(itemView);

            courseName=itemView.findViewById(R.id.course_name);
            date=itemView.findViewById(R.id.date);
            duration=itemView.findViewById(R.id.duration);
            day=itemView.findViewById(R.id.day);
            bin=itemView.findViewById(R.id.delete);


        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tutor_courses_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        TutorCourseModel model=tutorCourseModelListFiltered.get(position);

        holder.courseName.setText(model.getCourseTitle());
        holder.date.setText(model.getDate());
        holder.duration.setText(model.getDuration());
        holder.day.setText(model.getDay());

        holder.bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialDialog.Builder(context)
                        .title("Delete")
                        .content("Are you sure you want to delete ?")
                        .positiveText("Yes")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                               tutorCourseModelListFiltered.remove(position);
                                notifyDataSetChanged();
                            }
                        })
                        .negativeText("N0")
                        .onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            }
                        })
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tutorCourseModelListFiltered.size();
    }
}
