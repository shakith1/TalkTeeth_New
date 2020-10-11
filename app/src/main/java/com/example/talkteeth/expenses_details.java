package com.example.talkteeth;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class expenses_details extends Fragment {

    Button ex_dbtn1,ex_dbtn2,ex_dbtn3,ex_dbtn4,ex_dbtn5;
    RelativeLayout list1,list2,list3,list4,list5;

    public expenses_details() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_expenses_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ex_dbtn1 = (Button) view.findViewById(R.id.ex_dbtn1);
        ex_dbtn2 = (Button) view.findViewById(R.id.ex_dbtn2);
        ex_dbtn3 = (Button) view.findViewById(R.id.ex_dbtn3);
        ex_dbtn4 = (Button) view.findViewById(R.id.ex_dbtn4);
        ex_dbtn5 = (Button) view.findViewById(R.id.ex_dbtn5);

        list1 = (RelativeLayout) view.findViewById(R.id.list1);
        list2 = (RelativeLayout) view.findViewById(R.id.list2);
        list3 = (RelativeLayout) view.findViewById(R.id.list3);
        list4 = (RelativeLayout) view.findViewById(R.id.list4);
        list5 = (RelativeLayout) view.findViewById(R.id.list5);

        ex_dbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setCancelable(true);
                builder.setTitle("Delete Record");
                builder.setMessage("Are you sure delete the record?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list1.setVisibility(View.INVISIBLE);
                    }
                });
                builder.show();
            }
        });

        ex_dbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setCancelable(true);
                builder.setTitle("Delete Record");
                builder.setMessage("Are you sure delete the record?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list2.setVisibility(View.INVISIBLE);
                    }
                });
                builder.show();
            }
        });

        ex_dbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setCancelable(true);
                builder.setTitle("Delete Record");
                builder.setMessage("Are you sure delete the record?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list3.setVisibility(View.INVISIBLE);
                    }
                });
                builder.show();
            }
        });

        ex_dbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setCancelable(true);
                builder.setTitle("Delete Record");
                builder.setMessage("Are you sure delete the record?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list4.setVisibility(View.INVISIBLE);
                    }
                });
                builder.show();
            }
        });

        ex_dbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setCancelable(true);
                builder.setTitle("Delete Record");
                builder.setMessage("Are you sure delete the record?");

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        list5.setVisibility(View.INVISIBLE);
                    }
                });
                builder.show();
            }
        });


    }


}
