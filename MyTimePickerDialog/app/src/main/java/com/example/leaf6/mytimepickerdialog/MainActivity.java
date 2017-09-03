package com.example.leaf6.mytimepickerdialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b;
    static final int DIALOG_ID=0;
    int hour_x;
    int minute_x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForButton();
    }

    public void addListenerForButton()
    {
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(DIALOG_ID);
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id)
    {
        if(id == DIALOG_ID)
            return new TimePickerDialog(
                    MainActivity.this,
                    TimePickerListener,
                    hour_x,
                    minute_x,
                    false
            );
        return null;
    }

    protected  TimePickerDialog.OnTimeSetListener TimePickerListener =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    hour_x = i;
                    minute_x =i1;
                    Toast.makeText(
                            MainActivity.this,
                            hour_x+": "+minute_x,
                            Toast.LENGTH_SHORT
                    ).show();
                }
            };
}
