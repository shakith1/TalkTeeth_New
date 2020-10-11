package com.example.talkteeth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.fragment.app.Fragment;

public class Appointments extends Fragment {


    Button addappoint;
    View appoedit;
    private CalendarView calendarView;

    public Appointments(){

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.appointmnets, container, false);


        calendarView = (CalendarView) view.findViewById(R.id.app_calendarView);
        addappoint = (Button) view.findViewById(R.id.app_add_btn);
        appoedit = (View) view.findViewById(R.id.edit_one_view);

        addappoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(17);
            }
        });


        appoedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(18);
            }
        });

        return view;
    }
}
