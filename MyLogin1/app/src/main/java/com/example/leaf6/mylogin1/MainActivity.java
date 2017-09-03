package com.example.leaf6.mylogin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//1st activity is login
//2nd activity is user
public class MainActivity extends AppCompatActivity {
    private static EditText e1,e2;
    private static Button b1;
    private static TextView t1;

    int attempt_count = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForButton();
    }

    public void addListenerForButton()
    {
        b1 = (Button)findViewById(R.id.button);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String username = e1.getText().toString();
                        String password = e2.getText().toString();

                        if(username.equals("admin") &&
                                password.equals("admin123"))
                        {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Login successfully!",
                                    Toast.LENGTH_SHORT
                            ).show();
                            // direct to 2nd activity
                            Intent intent = new Intent("com.example.leaf6.mylogin1.Main2Activity");
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Login Failed!",
                                    Toast.LENGTH_SHORT
                            ).show();
                            attempt_count -- ;
                            t1.setText("Attempt: " + attempt_count);
                            if(attempt_count == 0)
                            {
                                b1.setEnabled(false);
                            }
                        }
                    }
                }
        );

    }
}
