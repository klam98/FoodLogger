package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPrevMeals  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prev_meals_list);
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, ViewPrevMeals.class);
    }
}
