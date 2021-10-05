package com.example.unitconverter4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class ConverterActivity extends AppCompatActivity {
    private static final String TAG = "ConverterActivity";
    public static final String INTENT_MESSAGE = "com.example.unitconverter4";
    private TextView mUnit1, mUnit1Label, mUnit2;
    private EditText mUserNum;
    private Button mEnterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        mUnit1 = findViewById(R.id.tvUnit1);
        mUnit1Label = findViewById(R.id.tvUnit1Label);
        mUnit2 = findViewById(R.id.tvUnit2);
        mUserNum = findViewById(R.id.etUserNum);

        Intent intent = getIntent();
        if (intent.hasExtra(INTENT_MESSAGE)) {
            Double convert = Double.parseDouble(mUserNum.getText().toString());
            mUnit1.setText(mUserNum);
        };
    }
}
