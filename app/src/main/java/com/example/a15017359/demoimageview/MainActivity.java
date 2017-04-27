package com.example.a15017359.demoimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay2;
    ImageView ivDay4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        // Set the image for ivDay2
        ivDay2.setImageResource(R.drawable.day2);

        // Get the ImageView obj and assign to ivDay2
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        // Set the image for ivDay2
        ivDay4.setImageResource(R.drawable.day4);


    }
}
