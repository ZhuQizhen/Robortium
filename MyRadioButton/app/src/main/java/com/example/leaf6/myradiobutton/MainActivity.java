package com.example.leaf6.myradiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup rg;
    private static RadioButton rb;
    private static Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOnClickListenerButton();
    }

    public void addOnClickListenerButton()
    {
        rg=(RadioGroup)findViewById(R.id.RadioGroup);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v)
                    {
                        int select_id = rg.getCheckedRadioButtonId();
                        rb= (RadioButton)findViewById(select_id);
                        Toast.makeText(
                                MainActivity.this,
                                rb.getText().toString(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}
