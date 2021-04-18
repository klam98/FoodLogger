package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MealReport extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_report);
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, MealReport.class);
    }
}
