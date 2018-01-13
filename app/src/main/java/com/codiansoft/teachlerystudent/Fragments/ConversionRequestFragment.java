package com.codiansoft.teachlerystudent.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.codiansoft.teachlerystudent.Activities.MainActivity;
import com.codiansoft.teachlerystudent.Adapters.ConversionRequestAdapter;
import com.codiansoft.teachlerystudent.Models.ConversionRequestModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;


public class ConversionRequestFragment extends Fragment {


    ConversionRequestAdapter adapter;
    RecyclerView recyclerView;

    public ConversionRequestFragment() {
        // Required empty public constructor
    }

    public static ConversionRequestFragment newInstance(String param1, String param2) {
        ConversionRequestFragment fragment = new ConversionRequestFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversion_request, container, false);
        MainActivity.frameLayout.setVisibility(View.VISIBLE);
        MainActivity.searchBar.setHint("Conversion type");

        recyclerView=view.findViewById(R.id.recycle_view_conversion_request);
        adapter=new ConversionRequestAdapter(getConversionRequests() , getContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        MainActivity.searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Log.e(TAG , charSequence.toString());
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        return view;
    }
   List<ConversionRequestModel> getConversionRequests()
   {
       List<ConversionRequestModel> list=new ArrayList<>();

       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Pending","100"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));

       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Pending","100"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));

       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Pending","100"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));

       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Pending","100"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       list.add(new ConversionRequestModel("faiq.mustaqeem54@gmail.com","12-12-2018","20:20:00","Done","12"));
       return list;

   }


}
