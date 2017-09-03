package com.example.leaf6.mydatepickerdialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    int year_x,month_x,day_x;
    static final int DIALOG_ID=0;

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
        {
            return new DatePickerDialog(
                    MainActivity.this,
                    datePickListener,
                    year_x,
                    month_x,
                    day_x
                    );
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener datePickListener=
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    year_x=i;
                    month_x=i1;
                    day_x=i2;

                    Toast.makeText(
                            MainActivity.this,
                            year_x+"/ "+month_x+"/ "+day_x,
                            Toast.LENGTH_SHORT
                    ).show();
                }
            };
}
