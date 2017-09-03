package com.example.leaf6.myratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button b1;
    private static TextView t1;
    private static RatingBar rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForRatingBar();
        addlistenerForButton();
    }

    public void addListenerForRatingBar()
    {
        rb1=(RatingBar)findViewById(R.id.ratingBar);
        t1=(TextView)findViewById(R.id.textView);

        rb1.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                        t1.setText(String.valueOf(rating));
                    }
                }

        );
    }

    public void addlistenerForButton()
    {
        b1 = (Button)findViewById(R.id.button);
        rb1=(RatingBar)findViewById(R.id.ratingBar);

        b1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(
                                MainActivity.this,
                                String.valueOf(rb1.getRating()),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}
