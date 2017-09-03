package com.example.leaf6.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox c1,c2,c3;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerOnCheckBox();
    }

    public void addListenerOnCheckBox()
    {
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        b1 = (Button) findViewById(R.id.button);

        c1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        if( ((CheckBox)v).isChecked())
                        {
                            Toast.makeText(
                                    MainActivity.this, "dog is selected",Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
        );
    }


    public void addListenerOnButton()
    {
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        StringBuffer result = new StringBuffer();
                        result.append("Dog: ").append(c1.isChecked())
                        .append("\nCat: ").append(c2.isChecked())
                        .append("\nFish: ").append(c3.isChecked());

                        Toast.makeText(
                            MainActivity.this, result.toString(),Toast.LENGTH_LONG
                        ).show();
                    }
                }
        );
    }
}
