package com.example.talkteeth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class patient_files extends Fragment {

    ImageView appointments, operations, imageLibrary, patientDetails;
    TextView name, age, contact, medical, address;
    TextInputEditText  searchName;
    Button search;

    public patient_files() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_patient_files, container, false);

        operations = (ImageView) view.findViewById(R.id.imageView6);
        imageLibrary = (ImageView) view.findViewById(R.id.imageView7);

        search = (Button) view.findViewById(R.id.sBtn);
        name = (TextView) view.findViewById(R.id.p_name);
        age = (TextView) view.findViewById(R.id.p_age);
        contact = (TextView) view.findViewById(R.id.p_contactNumber);
        medical = (TextView) view.findViewById(R.id.p_medical);
        address = (TextView) view.findViewById(R.id.p_addresss);
        searchName = (TextInputEditText) view.findViewById(R.id.searchName);

        operations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(4);
            }
        });

        imageLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Dashboard)getActivity()).setViewPager(8);
            }
        });


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(searchName.equals("Amanda")){

                }else {
                    name.setText("Amanda");
                    contact.setText("077 3456213");
                    age.setText("25");
                    medical.setText("Infection in 13th Tooth");
                    address.setText("No, 2/A, Sihnagiri Mw, Colombo");
                }


            }
        });


        return view;
    }


}