package com.example.akshay.olcademylogin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class My_courses extends Fragment {




    public My_courses() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_my_courses, container, false);
//      recyclerView1=view.findViewById(R.id.r1);
//        recyclerView1.setAdapter(adapter);
//        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
     return view;
    }

}
