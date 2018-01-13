package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.codiansoft.teachlerystudent.Activities.CourseDetailsactivity;
import com.codiansoft.teachlerystudent.Models.CourseModel;
import com.codiansoft.teachlerystudent.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodianSoft on 08/01/2018.
 */

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.MyViewHolder> implements Filterable {

    List<CourseModel> list;
    List<CourseModel> filterdCourseList;
    Context context;

    public CoursesAdapter(List<CourseModel> list , Context context)
    {
        this.list=list;
        this.filterdCourseList=list;
        this.context=context;
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    filterdCourseList = list;
                } else {
                    List<CourseModel> filteredList = new ArrayList<>();
                    for (CourseModel row : list) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getCourseName().toLowerCase().contains(charString.toLowerCase()) ) {
                            //Log.e("bookings_adapter",row.getCourse_name());
                            filteredList.add(row);
                        }
                    }

                    filterdCourseList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filterdCourseList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filterdCourseList = (ArrayList<CourseModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name ;
        TextView desc;
        ImageView image;


        public MyViewHolder(View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.course_name);
            desc=itemView.findViewById(R.id.course_desc);
            image=itemView.findViewById(R.id.courseImage);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        CourseModel course=filterdCourseList.get(position);

        holder.name.setText(course.getCourseName());
        holder.desc.setText(course.getCourseDescription());
        Picasso.with(context).load(course.getImageLink()).into(holder.image);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context , CourseDetailsactivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return filterdCourseList.size();
    }
}
