package com.codiansoft.teachlerystudent.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.codiansoft.teachlerystudent.Models.TeachingTypeModel;
import com.codiansoft.teachlerystudent.R;

import java.util.List;

/**
 * Created by CodianSoft on 15/01/2018.
 */

public class PreferredTeachingtypeAdapter extends RecyclerView.Adapter<PreferredTeachingtypeAdapter.MyViewHolder> {
   List<TeachingTypeModel> list;
    Context context;
    public PreferredTeachingtypeAdapter(List<TeachingTypeModel> list , Context context)
    {
        this.list=list;
        this.context=context;
    }
    @Override
    public PreferredTeachingtypeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.teaching_type_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PreferredTeachingtypeAdapter.MyViewHolder holder, final int position) {
        TeachingTypeModel model=list.get(position);

        holder.type.setText(model.getType());
        if(model.isChecked())
        {
            holder.checkBox.setChecked(true);
        }
        else
        {
            holder.checkBox.setChecked(false);
        }
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    list.get(position).setChecked(true);
                    compoundButton.setChecked(true);

                }
                else
                {
                    list.get(position).setChecked(false);
                    compoundButton.setChecked(false);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView type ;
        CheckBox checkBox;
        public MyViewHolder(View itemView) {
            super(itemView);
            type=itemView.findViewById(R.id.teaching_type);
            checkBox=itemView.findViewById(R.id.teaching_type_checkbox);
        }
    }
}
