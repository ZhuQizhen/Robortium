package com.example.leaf6.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText password;
    private Button button_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton()
    {
        password = (EditText)findViewById(R.id.editText);
        button_submit = (Button) findViewById(R.id.button);
        button_submit.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(
                                MainActivity.this,
                                password.getText(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}
