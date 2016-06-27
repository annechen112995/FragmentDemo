package com.codepath.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    OneFragment oneFragment;
    TwoFragment twoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();

        //Find view
    }

    public void onOneClick(View view) {
        //Get the support fragment manager
        FragmentManager fm = getSupportFragmentManager();

        //Create transaction
        FragmentTransaction ft = fm.beginTransaction();

        //Add or remove fragment
        ft.replace(R.id.flContainer, oneFragment);
        ft.addToBackStack("one");

        //Commit the transaction
        ft.commit();
    }

    public void onTwoClick(View view) {
        //Get the support fragment manager
        FragmentManager fm = getSupportFragmentManager();

        //Create transaction
        FragmentTransaction ft = fm.beginTransaction();

        //Add or remove fragment
        ft.replace(R.id.flContainer, twoFragment);
        ft.addToBackStack("two");

        //Commit the transaction
        ft.commit();
    }
}
