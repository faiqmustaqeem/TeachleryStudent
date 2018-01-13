package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.codiansoft.teachlerystudent.Models.TutorsModel;
import com.codiansoft.teachlerystudent.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class TutorsAdapter extends RecyclerView.Adapter<TutorsAdapter.MyViewHolder> implements Filterable {
    List<TutorsModel> tutorsModelList;
    List<TutorsModel> filteredTutorsModelList;
    Context context;

    public TutorsAdapter(List<TutorsModel> list , Context context)
    {
        this.tutorsModelList=list;
        this.filteredTutorsModelList=list;
        this.context=context;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    filteredTutorsModelList = tutorsModelList;
                } else {
                    List<TutorsModel> filteredList = new ArrayList<>();
                    for (TutorsModel row : tutorsModelList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getName().toLowerCase().contains(charString.toLowerCase()) ) {
                            //Log.e("bookings_adapter",row.getCourse_name());
                            filteredList.add(row);
                        }
                    }

                    filteredTutorsModelList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredTutorsModelList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredTutorsModelList = (ArrayList<TutorsModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }



    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name , demo , experience , qualification ;
        ImageView image , onlineIndicator;

        public MyViewHolder(View itemView) {

            super(itemView);
            name=itemView.findViewById(R.id.name);
            demo=itemView.findViewById(R.id.demo_option);
            experience=itemView.findViewById(R.id.experience_option);
            qualification=itemView.findViewById(R.id.qualification_option);
            image=itemView.findViewById(R.id.imageTutor);
            onlineIndicator=itemView.findViewById(R.id.online_indicator);
        }
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.totors_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        TutorsModel model=filteredTutorsModelList.get(position);

        holder.name.setText(model.getName());
        holder.demo.setText(model.getDemo());
        holder.experience.setText(model.getExperience());
        holder.qualification.setText(model.getQualification());

        Picasso.with(context).load(model.getImageLink()).into(holder.image);

        if(model.isOnline())
        {
            holder.onlineIndicator.setVisibility(View.VISIBLE);
        }
        else
        {
            holder.onlineIndicator.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return filteredTutorsModelList.size();
    }
}
