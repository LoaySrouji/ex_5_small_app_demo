package com.example.ex_5_small_app_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String FIVE_DIGITS_KEY = "five_digits";
    Button goFishButton;
    TextView tapOnMeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String five_digits = getIntent().getStringExtra(FIVE_DIGITS_KEY);
        goFishButton = (Button) findViewById(R.id.button_go_fish);
        goFishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fisherman_Acticity.class));
            }
        });
        tapOnMeTextView = (TextView) findViewById(R.id.textView_insert_5_digits);
        tapOnMeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertDigits.class));
            }
        });

        if(five_digits == null)
        {
            tapOnMeTextView.setText("tap on me!");
        }
        else
        {

            tapOnMeTextView.setText("you have entered: " + five_digits);
        }
    }
}
