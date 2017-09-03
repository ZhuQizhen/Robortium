package com.example.leaf6.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//add <uses-permission android:name="android.permission.INTERNET"/>
//in Manifest file
public class MainActivity extends AppCompatActivity {
    private static WebView w;
    private static EditText e;
    private static Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForButton();
    }

    public void addListenerForButton()
    {
        w= (WebView) findViewById(R.id.webview);
        e= (EditText) findViewById(R.id.editText);
        b= (Button) findViewById(R.id.button);


        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String URL = e.getText().toString();
                        w.getSettings().setLoadsImagesAutomatically(true);
                        w.getSettings().setJavaScriptEnabled(true);
                        w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        w.loadUrl(URL);
                    }
                }
        );
    }
}
