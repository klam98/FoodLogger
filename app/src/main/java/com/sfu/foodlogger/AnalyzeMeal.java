package com.sfu.foodlogger;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class AnalyzeMeal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analyze_meal);
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, AnalyzeMeal.class);
    }

}
