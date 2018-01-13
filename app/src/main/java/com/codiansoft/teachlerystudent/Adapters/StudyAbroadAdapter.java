package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codiansoft.teachlerystudent.Models.StudyAbroadModel;
import com.codiansoft.teachlerystudent.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by CodianSoft on 12/01/2018.
 */

public class StudyAbroadAdapter extends RecyclerView.Adapter<StudyAbroadAdapter.MyViewHolder> {

    List<StudyAbroadModel> list;
    Context context;
    public StudyAbroadAdapter(List<StudyAbroadModel> list , Context context)
    {
        this.list=list;
        this.context=context;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView name , desc;
        public MyViewHolder(View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image_study_abroad);
            name=itemView.findViewById(R.id.course_name);
            desc=itemView.findViewById(R.id.course_desc);
        }
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.study_in_abroad_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        StudyAbroadModel model=list.get(position);
        holder.name.setText(model.getCourseName());
        holder.desc.setText(model.getCourseDescription());
        Picasso.with(context).load(model.getImageLink()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
