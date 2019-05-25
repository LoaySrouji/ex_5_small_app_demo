package com.example.ex_5_small_app_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class InsertDigits extends AppCompatActivity {
    EditText insert5Digits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_digits);
        insert5Digits = (EditText) findViewById(R.id.insertion_of_5_digits_editText);
        insert5Digits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() == 5)
                {
                    Intent intent = new Intent(InsertDigits.this, MainActivity.class);
                    intent.putExtra(MainActivity.FIVE_DIGITS_KEY, s.toString());
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
