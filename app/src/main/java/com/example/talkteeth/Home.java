package com.example.talkteeth;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    CardView add_doctor;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        add_doctor = (CardView) view.findViewById(R.id.add_doctor);

        add_doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(1);
            }
        });

        return view;
    }


}
