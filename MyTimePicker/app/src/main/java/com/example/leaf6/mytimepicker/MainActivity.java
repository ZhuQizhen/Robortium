package com.example.leaf6.mytimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TimePicker t;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForButton();
    }

    public void addListenerForButton()
    {
        t=(TimePicker) findViewById(R.id.timePicker);
        b=(Button) findViewById(R.id.button);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(
                                getBaseContext(),
                                t.getCurrentHour() +" : " + t.getCurrentMinute(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}
