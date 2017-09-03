package com.example.leaf6.actlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String My_tag="the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(My_tag,"onCreate");
    }

    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.i(My_tag,"onStart");
    }

    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.i(My_tag,"onResume");
    }

    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.i(My_tag,"onPause");
    }

    @Override
    protected  void onStop()
    {
        super.onStop();
        Log.i(My_tag,"onStop");
    }

    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.i(My_tag,"onRestart");
    }

    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        Log.i(My_tag,"onDestroy");
    }
}
//then we can add a filter in device monitor
//and then see the output log