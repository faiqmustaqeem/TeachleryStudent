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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.codiansoft.teachlerystudent.Activities.MainActivity;
import com.codiansoft.teachlerystudent.Adapters.CoursesAdapter;
import com.codiansoft.teachlerystudent.Models.CourseModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;


public class CourseFragment extends Fragment {


    RecyclerView recyclerView;
    CoursesAdapter adapter;
    public CourseFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CourseFragment newInstance(String param1, String param2) {
        CourseFragment fragment = new CourseFragment();

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
        View view =  inflater.inflate(R.layout.fragment_course, container, false);

        MainActivity.frameLayout.setVisibility(View.VISIBLE);
        MainActivity.searchBar.setHint("Search");

        recyclerView=view.findViewById(R.id.courseRecycleView);
        adapter=new CoursesAdapter(getCourses() , getContext());
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
    List<CourseModel> getCourses()
    {
        List<CourseModel> list=new ArrayList<>();

        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));
        list.add(new CourseModel("java Programming", "Java Progarmming Course","https://s-media-cache-ak0.pinimg.com/originals/c4/34/24/c43424186b9c089b9aa1d64c7f1989c1.png"));
        list.add(new CourseModel("Photoshop", "Photoshop","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZFsZAb_o1GgFeS1MU6AfzJX7fg-sLOGQf2B7AfGF1h1OZk-sr"));
        list.add(new CourseModel("C#", "C#","http://innovativeteams.net/wp-content/uploads/2017/12/csharp.png"));



        return list;

    }


}
