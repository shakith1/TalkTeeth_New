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

    CardView add_doctor,doctor_details, clinic_info, pickers_data, patient_files, add_patient,todolist, appoit;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        add_doctor = (CardView) view.findViewById(R.id.add_doctor);
        doctor_details = (CardView) view.findViewById(R.id.doctor_details);
        clinic_info = (CardView) view.findViewById(R.id.clinic_info);
        pickers_data = (CardView) view.findViewById(R.id.pickets_data);
        patient_files = (CardView) view.findViewById(R.id.patient_file);

        add_patient = (CardView) view.findViewById(R.id.new_patient);
        todolist = (CardView) view.findViewById(R.id.to_do_list);
        appoit = (CardView) view.findViewById(R.id.appoinments);

        add_doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(1);
            }
        });

        doctor_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(2);
            }
        });

        clinic_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(4);
            }
        });

        pickers_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(5);
            }
        });

        patient_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(6);
            }
        });


        //***************************************************//

        add_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(12);
            }
        });


        todolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(13);
            }
        });

        appoit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(16);
            }
        });



        return view;
    }


}
