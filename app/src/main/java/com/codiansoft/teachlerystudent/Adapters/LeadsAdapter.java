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

import com.codiansoft.teachlerystudent.Models.LeadsModel;
import com.codiansoft.teachlerystudent.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodianSoft on 09/01/2018.
 */

public class LeadsAdapter extends RecyclerView.Adapter<LeadsAdapter.MyViewHolder> implements Filterable {

    List<LeadsModel> leadsModelList;
    List<LeadsModel> filteredLeadsModelsList;
    Context context;

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    filteredLeadsModelsList = leadsModelList;
                } else {
                    List<LeadsModel> filteredList = new ArrayList<>();
                    for (LeadsModel row : leadsModelList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getTitle().toLowerCase().contains(charString.toLowerCase()) ) {
                            //Log.e("bookings_adapter",row.getCourse_name());
                            filteredList.add(row);
                        }
                    }

                    filteredLeadsModelsList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredLeadsModelsList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredLeadsModelsList = (ArrayList<LeadsModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }


    public LeadsAdapter(List<LeadsModel> list , Context context)
    {
        this.leadsModelList=list;
        this.filteredLeadsModelsList=list;
        this.context=context;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image ;
        TextView name , title ,description ;

        public MyViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageLead);
            name=itemView.findViewById(R.id.name);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);


        }
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.leads_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        LeadsModel leadsModel=filteredLeadsModelsList.get(position);

        holder.name.setText(leadsModel.getName());
        holder.title.setText(leadsModel.getTitle());
        holder.description.setText(leadsModel.getDescription());

        Picasso.with(context).load(leadsModel.getImageLink()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return filteredLeadsModelsList.size();
    }
}
