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
import com.codiansoft.teachlerystudent.Adapters.TutorsAdapter;
import com.codiansoft.teachlerystudent.Models.TutorsModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;

public class TutorsFragment extends Fragment {


    TutorsAdapter adapter;
    RecyclerView recyclerView;
    public TutorsFragment() {
        // Required empty public constructor
    }
    public static TutorsFragment newInstance(String param1, String param2) {
        TutorsFragment fragment = new TutorsFragment();

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
        View view= inflater.inflate(R.layout.fragment_tutors, container, false);


        MainActivity.frameLayout.setVisibility(View.VISIBLE);
        MainActivity.searchBar.setHint("Search");
        MainActivity.searchBar.setText("");

        recyclerView=view.findViewById(R.id.recycle_view_tutors);
        adapter=new TutorsAdapter(getTutors() , getContext());
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
     List<TutorsModel> getTutors()
     {
         List<TutorsModel> list=new ArrayList<>();
//    public TutorsModel(String name,String demo,String experience,String qualification,String imageLink,boolean isOnline)

         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));

         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));
         list.add(new TutorsModel("Bell Adwerd","YES","5 years","M tech","https://www.livelingua.com/img/profilesTeachers/103/Guillaume-Deneufbourg-Square_Profile_S.jpg",true));
         list.add(new TutorsModel("John Micheal","YES","50 years","Phd","https://dhuh3lqp0wlh3.cloudfront.net/1f/641ab09fc411e7b98b6bbc88e80744/tutor-guy-steeves-new-westminster-ad663be6.jpg",false));

         return list;
     }

}
