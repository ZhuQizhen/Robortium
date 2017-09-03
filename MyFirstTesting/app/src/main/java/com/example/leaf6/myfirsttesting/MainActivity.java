package com.example.leaf6.myfirsttesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_click;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m();

    }

    public void m()
    {
        btn_click = (Button) findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
        btn_click.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tv.setText("testing");
                    }
                }
        );
    }

}
