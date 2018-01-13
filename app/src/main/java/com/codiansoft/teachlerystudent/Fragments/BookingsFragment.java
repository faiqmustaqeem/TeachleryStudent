package com.codiansoft.teachlerystudent.Fragments;


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
import com.codiansoft.teachlerystudent.Adapters.BookingsAdapter;
import com.codiansoft.teachlerystudent.Models.BookingsModel;
import com.codiansoft.teachlerystudent.R;

import java.util.ArrayList;
import java.util.List;


public class BookingsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    String TAG="bookings";

    RecyclerView recyclerView;
    BookingsAdapter adapter;
    public BookingsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BookingsFragment newInstance(String param1, String param2) {
        BookingsFragment fragment = new BookingsFragment();

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

        View view = inflater.inflate(R.layout.fragment_bookings, container, false);

        MainActivity.frameLayout.setVisibility(View.VISIBLE);
        MainActivity.searchBar.setHint("Filter");


        recyclerView=view.findViewById(R.id.bookingsRecycleView);
        adapter=new BookingsAdapter(getBookings() , getContext());
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
                Log.e(TAG , charSequence.toString());
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        return view;
    }
    List<BookingsModel> getBookings()
    {
        List<BookingsModel> bookingsModels=new ArrayList<>();

        bookingsModels.add(new BookingsModel("Michel John","Androdid","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","java","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Bussiness Maths","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));


        bookingsModels.add(new BookingsModel("Michel John","Maths","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","calculus","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","php","12-12-2018","5 Months","Cancelled"));

        bookingsModels.add(new BookingsModel("Michel John","Androdid","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","java","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Bussiness Maths","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));


        bookingsModels.add(new BookingsModel("Michel John","Maths","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","calculus","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","Javascript","12-12-2018","5 Months","Cancelled"));
        bookingsModels.add(new BookingsModel("Michel John","php","12-12-2018","5 Months","Cancelled"));


        return  bookingsModels;
    }


}
