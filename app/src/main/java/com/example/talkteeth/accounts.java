package com.example.talkteeth;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class accounts extends Fragment {

    CardView balance_sheet,doctor_income,add_expenses;

    public accounts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_accounts, container, false);

        balance_sheet = (CardView) view.findViewById(R.id.balance_sheet);
        doctor_income = (CardView) view.findViewById(R.id.doctor_income);
        add_expenses = (CardView) view.findViewById(R.id.add_expenses);


        balance_sheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(20);
            }
        });

        doctor_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(21);
            }
        });

        add_expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(22);
            }
        });

        return view;

    }


}
