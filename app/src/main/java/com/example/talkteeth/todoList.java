package com.example.talkteeth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class todoList extends Fragment {

    Button btnadd;
    View todoone;

    public todoList(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.frag_to_do_list, container, false);

        btnadd = (Button) view.findViewById(R.id.todo_add_btn);
        todoone = (View) view.findViewById(R.id.todo_one_view);




        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(14);
            }
        });

        todoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Dashboard)getActivity()).setViewPager(15);
            }
        });

        return view;
    }
}
