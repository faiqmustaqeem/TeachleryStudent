package com.codiansoft.teachlerystudent.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codiansoft.teachlerystudent.Activities.MainActivity;
import com.codiansoft.teachlerystudent.R;


public class DashboardFragment extends Fragment {

    public DashboardFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();

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
        View view= inflater.inflate(R.layout.fragment_dashboard, container, false);
        MainActivity.frameLayout.setVisibility(View.GONE);
       // MainActivity.searchBar.setVisibility(View.GONE);
        return view;

    }

}
