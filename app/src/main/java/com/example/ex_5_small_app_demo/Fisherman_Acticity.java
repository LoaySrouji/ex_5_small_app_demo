package com.example.ex_5_small_app_demo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Fisherman_Acticity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisherman_acticity);
        imageView = (ImageView) findViewById(R.id.imageView_Fisherman);
        Drawable myDrawable = getResources().getDrawable(R.drawable.fisherman);
        imageView.setImageDrawable(myDrawable);
//        imageView.setImageResource(getResources().
//                getIdentifier("com.example.ex_5_small_app_demo:drawable/fisherman.jpg", null, null));
    }
}
