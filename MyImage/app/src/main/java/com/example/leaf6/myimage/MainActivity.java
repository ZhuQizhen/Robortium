package com.example.leaf6.myimage;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView i;
    private static Button b1;
    private int current_image_index;
    private int[] image ={R.mipmap.ic_launcher,R.mipmap.ic_launcher_round};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerForButton();
    }


    public void addListenerForButton()
    {
        i=(ImageView) findViewById(R.id.imageView);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index++;
                        current_image_index = current_image_index % image.length;
                        i.setImageResource(image[current_image_index]);
                    }
                }
        );
    }
}
//res -> drawable
//->new -> image asset