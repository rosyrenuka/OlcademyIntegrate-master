package com.example.akshay.olcademylogin;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends Fragment {
    RecyclerView recyclerView1;
    adapter1 adapter;
    ViewFlipper viewFlipper1;
    ViewFlipper viewFlipper2;
    ImageView search;
    RecyclerView recyclerView2;


    int images[]={R.drawable.add2,R.drawable.add4,R.drawable.add5,R.drawable.add6,R.drawable.add7,R.drawable.add8};




    public CourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_course, container, false);
        recyclerView1=view.findViewById(R.id.r1);
        recyclerView2=view.findViewById(R.id.r2);


        adapter=new adapter1(getContext());
        recyclerView1.setAdapter(adapter);
        recyclerView2.setAdapter(adapter);

        viewFlipper1=view.findViewById(R.id.viewflipper1);
        viewFlipper2=view.findViewById(R.id.viewflipper2);
        search=view.findViewById(R.id.search);

        search.setColorFilter(Color.GRAY);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
       recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
      adapter.notifyDataSetChanged();


        for(int i=0;i<images.length;i++)
        {
            flipperImages1(images[i]);
            flipperImages2(images[i]);
        }



        return view;
    }


    private void flipperImages2(int image) {

        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(image);
        viewFlipper1.addView(imageView);
        viewFlipper1.setFlipInterval(2000);
        viewFlipper1.setAutoStart(true);
        viewFlipper1.setInAnimation(getContext(),android.R.anim.slide_in_left);
        viewFlipper1.setOutAnimation(getContext(),android.R.anim.slide_out_right);
    }


    private void flipperImages1(int image) {

        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(image);
        viewFlipper2.addView(imageView);
        viewFlipper2.setFlipInterval(2000);
        viewFlipper2.setAutoStart(true);
        viewFlipper2.setInAnimation(getContext(),android.R.anim.slide_in_left);
        viewFlipper2.setOutAnimation(getContext(),android.R.anim.slide_out_right);
    }


}
