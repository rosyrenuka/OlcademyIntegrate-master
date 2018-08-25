package com.example.akshay.olcademylogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    Button b1;
    TextView showMore;
    LinearLayout Layout;
    TextView textbig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        b1=findViewById(R.id.b1);
        textbig=findViewById(R.id.big);
        showMore=findViewById(R.id.showmore);
        Layout=findViewById(R.id.layout);
        b1.setText("37 people");
        textbig.setText("Hi!Welcome to the advanced Web Developer Bootcamp, the complete course that will help you learn the latest technologies,tools and libraries to become a proficient web developer.Think of this course as an enclyopedia of all the knowledge you nedd to take your developer skills to the next level"+"                                                          " +"There are quite a few options out there for online trainig, but we are certain this course is the most comprehensive nd frankly the best one out there.");

        showMore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                showMore.setVisibility(View.GONE);
                textbig.getLayoutParams().height = 550;
                textbig.setText("Hi!Welcome to the advanced Web Developer Bootcamp, the complete course that will help you learn the latest technologies,tools and libraries to become a proficient web developer.Think of this course as an enclyopedia of a your developer skills to the next ou nedd to take your developerke  your developer skills tlevel"+"                                                          " +"There are quite a few options out there for online trainig, but we are certain this course is the most comprehensive nd frankly the best one out there.");
//                Layout.getLayoutParams().height=100;

                textbig.requestLayout();
            }
        });
    }
}
