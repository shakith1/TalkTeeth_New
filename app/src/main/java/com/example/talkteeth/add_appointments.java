package com.example.talkteeth;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.app.AlertDialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;
import java.util.Date;

public class add_appointments extends Fragment {

    Button btncancel,btnadd;

    private static final String TAG = "edit_appointments";
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    ImageButton adddate;
    EditText date;
    DatePickerDialog.OnDateSetListener dateSetListener;

    Calendar c;
    //DatePickerDialog dpd;

    public add_appointments(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.add_appointments, container, false);

        //date = (EditText) view.findViewById(R.id.add_appo_date_txt);




        adddate = (ImageButton) view.findViewById(R.id.appo_add_date_pick);

        btncancel = (Button) view.findViewById(R.id.add_appo_cancl_btn);
       // btnadd = (Button) view.findViewById(R.id.add_appo_save_btn);




        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(16);
            }
        });

        /*btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(6);
            }
        });*/

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        date = (EditText) view.findViewById(R.id.add_appo_date_txt);


        btnadd = (Button) view.findViewById(R.id.add_appo_save_btn);


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();

                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        getContext(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });



        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;

                String dateSet = month + "/" + day + "/" + year;
                date.setText(dateSet);
            }
        };

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());


                builder.setCancelable(true);
                builder.setTitle("Data Saved");
                builder.setMessage("Data Saved Successfully...");


                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((Dashboard)getActivity()).setViewPager(16);
                    }
                });
                builder.show();

            }
        });

    }
}
