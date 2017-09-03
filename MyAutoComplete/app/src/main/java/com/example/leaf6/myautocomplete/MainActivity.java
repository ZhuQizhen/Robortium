package com.example.leaf6.myautocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView a;
    private String[] s={
            "Aa",
            "Ab",
            "Ac",
            "Ad",
            "Ae",
            "Af",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListener();
    }

    public void addListener()
    {
        a = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item,s);

        a.setThreshold(1);
        a.setAdapter(adapter);


    }
}
