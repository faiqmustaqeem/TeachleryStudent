package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.codiansoft.teachlerystudent.Models.ConversionRequestModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodianSoft on 08/01/2018.
 */

public class ConversionRequestAdapter extends RecyclerView.Adapter<ConversionRequestAdapter.MyViewHolder> implements Filterable {

    List<ConversionRequestModel> conversionRequestModelList;
    List<ConversionRequestModel> conversionRequestModelFilteredList;
    Context context;

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    conversionRequestModelFilteredList = conversionRequestModelList;
                } else {
                    List<ConversionRequestModel> filteredList = new ArrayList<>();
                    for (ConversionRequestModel row : conversionRequestModelList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getEmail().toLowerCase().contains(charString.toLowerCase())
                                || row.getStatus().toLowerCase().contains(charString.toLowerCase())
                                || row.getDate().toLowerCase().contains(charString.toLowerCase())) {
                            //Log.e("bookings_adapter",row.getCourse_name());
                            filteredList.add(row);
                        }
                    }

                    conversionRequestModelFilteredList = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = conversionRequestModelFilteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                conversionRequestModelFilteredList = (ArrayList<ConversionRequestModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
    public ConversionRequestAdapter(List<ConversionRequestModel> list , Context context)
    {
        this.conversionRequestModelList=list ;
        this.conversionRequestModelFilteredList=list;
        this.context=context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView email , date , time , status , count;
        RelativeLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            email=itemView.findViewById(R.id.email);
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.time);
            status=itemView.findViewById(R.id.status);
            count=itemView.findViewById(R.id.count);
            layout=itemView.findViewById(R.id.status_layout);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.conversion_requests_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ConversionRequestModel requestModel=conversionRequestModelFilteredList.get(position);

        holder.email.setText(requestModel.getEmail());
        holder.date.setText(requestModel.getDate());
        holder.time.setText(requestModel.getTime());
        holder.status.setText(requestModel.getStatus());
        holder.count.setText(requestModel.getCount());

        if(holder.status.getText().toString().toLowerCase().equals("done"))
        {
            holder.layout.setBackgroundColor(ContextCompat.getColor(context , R.color.gray));
        }
        else
        {
            holder.layout.setBackgroundColor(ContextCompat.getColor(context , R.color.red));
        }
    }

    @Override
    public int getItemCount() {
        return conversionRequestModelFilteredList.size();
    }
}
