package com.example.leaf6.mygesture;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.gesture.Gesture;
import android.widget.TextView;

import static android.view.GestureDetector.*;


public class MainActivity extends AppCompatActivity implements
        OnGestureListener, OnDoubleTapListener{

    private static TextView t;
    private GestureDetectorCompat g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m();
    }

    public void m()
    {
        t = (TextView) findViewById(R.id.textview);
        g = new GestureDetectorCompat(this,this);
        g.setOnDoubleTapListener(this);
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        t.setText("onSingleTapConfirmed: " + motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        t.setText("onDoubleTap: "+ motionEvent.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        t.setText("onDoubleTapEvent: "+ motionEvent.toString());

        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        t.setText("onDown: "+ motionEvent.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        t.setText("onShowPress: "+ motionEvent.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        t.setText("onSingleTapUp: "+ motionEvent.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        t.setText("onScroll: "+ motionEvent.toString()+ ", "+ motionEvent1.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        t.setText("onLongPress: "+ motionEvent.toString());
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        t.setText("onFling: "+ motionEvent.toString()+ ", "+ motionEvent1.toString());
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent e)
    {
        g.onTouchEvent(e);
        return super.onTouchEvent(e);
    }
}

