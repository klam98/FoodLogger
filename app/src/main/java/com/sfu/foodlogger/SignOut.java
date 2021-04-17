package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignOut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_out);

        Button signUpBtn = (Button) findViewById(R.id.sign_up_btn);

        btnPress(signUpBtn, MainActivity.makeIntent(SignOut.this));
    }

    private void btnPress(Button button, final Intent intent) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, SignOut.class);
    }
}
