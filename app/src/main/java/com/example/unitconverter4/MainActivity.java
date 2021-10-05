package com.example.unitconverter4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private TextView mUnit1, mUnit1Label, mUnit2, mUnit2Label;
    private EditText mUserNum;
    private Button mEnterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUnit1 = findViewById(R.id.tvUnit1);
        mUnit1Label = findViewById(R.id.tvUnit1Label);
        mUnit2 = findViewById(R.id.tvUnit2);
        mUserNum = findViewById(R.id.etUserNum);
        mEnterBtn = findViewById(R.id.btnLaunchActivity);

        // Implement onClickListener for btnLaunchActivity button
        mEnterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "On Click the Launch Converter Activity button");
                launchConverterActivity();
            }
        });

        //prepare the random selection of units
        prepareUnits();
    }

    // Called when the user clicks the launch Converter Activity button
    private void launchConverterActivity(String message){
    Intent intent = new Intent(this, ConverterActivity.class);
    intent.putExtra(ConverterActivity.INTENT_MESSAGE, message);
    startActivity(intent);
    }

    //prepare the random selection of units
    public void prepareUnits() {
        List<String> myUnitList = Arrays.asList("mm to cm", "cm to mm", "cm to m", "m to cm", "m to km", "km to m");

        Random rand = new Random();
        int randomItem = rand.nextInt(myUnitList.size());
        String randomUnit = myUnitList.get(randomItem);
    }
}