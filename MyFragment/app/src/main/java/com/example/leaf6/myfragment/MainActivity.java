package com.example.leaf6.myfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

import layout.Fragment1;
import layout.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view)
    {
        Fragment f;
        if(view == findViewById(R.id.button))
        {
            f= new Fragment1();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction  ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, f).commit();
        }
        else if( view == findViewById(R.id.button2))
        {
            f=  new Fragment2();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction  ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place,f).commit();
        }


    }


}


//what is fragment?
//A fragment represents a behavior of  a portion of user interface in an Activity.
//We can combine multiple fragments in a single acticity to build a multi-pane UI and reuse a fragment in multiple activities

//fragment can simplifies the task of creating UI for multiple screen sizes.
//A activity
//
// can contain any number of fragments.