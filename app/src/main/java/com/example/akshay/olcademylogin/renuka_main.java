package com.example.akshay.olcademylogin;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class renuka_main extends AppCompatActivity {

  private TextView mTextMessage;
    Intent phoneIntent=getIntent();


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {
                case R.id.courses:
                {
                    CourseFragment fragment1=new CourseFragment();
                    LoadFragment(fragment1);
                    return true;
                }

                case R.id.account:
                {

                    Profile fragment2=new Profile();
                    LoadFragment(fragment2);
                    return true;
                }

                case R.id.my_courses:
                {

                    My_courses fragment3=new My_courses();
                    LoadFragment(fragment3);
                    return true;
                }

                case R.id.bookmark:

                {
                    item.collapseActionView();
                    bookmark fragment3=new bookmark();
                    LoadFragment(fragment3);

                    return true;
                }

                case R.id.notification:
                {
                    bookmark fragment3=new bookmark();
                    LoadFragment(fragment3);
                    return true;
                }
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        CourseFragment fragment1=new CourseFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment1).commit();


        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.example.hp.chattingapp" ,
                    PackageManager.GET_SIGNATURES);

            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");

                md.update(signature.toByteArray());
                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }

    public boolean LoadFragment(Fragment fragment)
    {
        if(fragment!=null)
        {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_container,fragment).commit();
            return true;
        }

        return false;
    }
}
