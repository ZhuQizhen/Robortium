package com.example.leaf6.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static ListView l;
    private static String[] Names = new String[]{"A","B","C","D","E","F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView();
    }

    public void listView()
    {
        l = (ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.name_list,Names);
        l.setAdapter(adapter);
        l.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String value = (String)l.getItemAtPosition(position);
                        Toast.makeText(
                                MainActivity.this,
                                "Postion: "+position+"  Value"+value,
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }

}
//res-->layout --> new -->xml -->layout xml file