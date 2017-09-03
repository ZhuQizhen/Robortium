package com.example.leaf6.myseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static SeekBar s;
    private static TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar();
    }

    public void seekbar()
    {
        s = (SeekBar) findViewById(R.id.seekBar);
        t= (TextView) findViewById(R.id.textView);

        t.setText("Covered : " + s.getProgress() + "/" + s.getMax());


        s.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        t.setText("Covered : " +  progress + "/" + s.getMax());
                        Toast.makeText(
                                MainActivity.this,
                                "SeekBar in Progress",
                                Toast.LENGTH_SHORT
                        ).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(
                                MainActivity.this,
                                "SeekBar in StartTracking",
                                Toast.LENGTH_SHORT
                        ).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(
                                MainActivity.this,
                                "SeekBar in StopTracking",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }

}
