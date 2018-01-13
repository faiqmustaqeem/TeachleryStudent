package com.codiansoft.teachlerystudent.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.codiansoft.teachlerystudent.R;

import java.util.List;

/**
 * Created by faiq on 31/12/2017.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.MyViewHolder> {

    List<String> options;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView text;

        public MyViewHolder(View itemView) {
            super(itemView);
            text=(TextView) itemView.findViewById(R.id.settings_options_text);
        }
    }

    public SettingsAdapter(List<String> list)
    {
        this.options=list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.settings_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.text.setText(options.get(position));
    }

    @Override
    public int getItemCount() {
        return options.size();
    }
}
