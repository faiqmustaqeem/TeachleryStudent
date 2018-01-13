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
import com.codiansoft.teachlerystudent.Adapters.LeadsAdapter;
import com.codiansoft.teachlerystudent.Models.LeadsModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;


public class LeadsFragment extends Fragment {

    LeadsAdapter adapter;
    RecyclerView recyclerView;
    public LeadsFragment() {
        // Required empty public constructor
    }


    public static LeadsFragment newInstance(String param1, String param2) {
        LeadsFragment fragment = new LeadsFragment();
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

        View view = inflater.inflate(R.layout.fragment_leads, container, false);

        MainActivity.frameLayout.setVisibility(View.VISIBLE);
        MainActivity.searchBar.setHint("Search");
        MainActivity.searchBar.setText("");

        recyclerView=view.findViewById(R.id.leadsRecycleView);
        adapter=new LeadsAdapter(getLeads() , getContext());
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

     List<LeadsModel> getLeads()
     {
         List<LeadsModel> list=new ArrayList<>();

         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MjokzWv9sDUy9aSRF_mImvTJFQsJ1BgA9QMtxsHJYyaLnKjF"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2y_uDszWdPbQ4gG2a8ZP_o4-EJ4T1x4MqrIRyWS2lJq4-XaUD"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MjokzWv9sDUy9aSRF_mImvTJFQsJ1BgA9QMtxsHJYyaLnKjF"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://media.licdn.com/mpr/mpr/p/4/005/088/084/0fdfda1.jpg"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2y_uDszWdPbQ4gG2a8ZP_o4-EJ4T1x4MqrIRyWS2lJq4-XaUD"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://media.licdn.com/mpr/mpr/p/4/005/088/084/0fdfda1.jpg"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MjokzWv9sDUy9aSRF_mImvTJFQsJ1BgA9QMtxsHJYyaLnKjF"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://media.licdn.com/mpr/mpr/p/4/005/088/084/0fdfda1.jpg"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MjokzWv9sDUy9aSRF_mImvTJFQsJ1BgA9QMtxsHJYyaLnKjF"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2y_uDszWdPbQ4gG2a8ZP_o4-EJ4T1x4MqrIRyWS2lJq4-XaUD"));
         list.add(new LeadsModel("Mahelet Dalasia","Need HTML tutor", "tutor should start from basic , i have know knoledge from beginner , i am such a nulla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7MjokzWv9sDUy9aSRF_mImvTJFQsJ1BgA9QMtxsHJYyaLnKjF"));


         return  list;
     }




}
