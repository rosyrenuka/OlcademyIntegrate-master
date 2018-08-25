package com.example.akshay.olcademylogin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by HP on 19-07-2018.
 */

public class adapter1 extends RecyclerView.Adapter<adapter1.UserHolder> {

    Context context;
    String course_name[]={"The Complete Python Bootcamp", "Django-Python Full Stack development" , "The Complete Pyhton Bootcamp","Django-Python Full Stack development", "The Complete Pyhton Bootcamp","Django-Python Full Stack development", "The Complete Pyhton Bootcamp"};
    int images[]={R.drawable.new1,R.drawable.new3,R.drawable.new2,R.drawable.new2,R.drawable.new4,R.drawable.new1,R.drawable.new5};

    public adapter1(Context context) {
        this.context = context;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.course_single,parent,false);
        UserHolder holder=new UserHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {

       // holder.toggleButton.setBackground(context,R.drawable.heartblank);
//        holder.toggleButton.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.heartblank));
//        holder.toggleButton.setBackgroundColor(Color.RED);
     holder.toggleButton.setChecked(false);
     holder.image.setImageResource(images[position]);
     holder.title.setText(course_name[position]);
     holder.star.setColorFilter((context.getResources().getColor(R.color.gold1)));


     holder.toggleButton.setDrawingCacheBackgroundColor(Color.YELLOW);

     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent intent = new Intent(context, Description.class);
             context.startActivity(intent);

         }
     });


    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class UserHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        View view;
        ImageView star;
        ToggleButton toggleButton;


        public UserHolder(View itemView) {
            super(itemView);
            this.view=itemView;
            star=view.findViewById(R.id.star1);
            image=view.findViewById(R.id.image);
            title=view.findViewById(R.id.title);
            toggleButton=view.findViewById(R.id.toggle);

        }
    }
}
