package com.sfu.foodlogger;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubscribePremium extends AppCompatActivity {
    String name, email, cardholdername, expdata;
    int cardnumber, cvv;
    Button submitButton;
    EditText nameInput;
    EditText emailInput;
    EditText cardholdernameInput;
    EditText cardnumberInput;
    EditText expirationdateInput;
    EditText cvvInput;

    String subscribe = "You are now a premium user!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subscribe_premium);

        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        cardholdernameInput = (EditText) findViewById(R.id.cardholdernameInput);
        cardnumberInput = (EditText) findViewById(R.id.cardnumberInput);
        expirationdateInput = (EditText) findViewById(R.id.expirationdateInput);
        cvvInput = (EditText) findViewById(R.id.cvvInput);


        submitButton = (Button) findViewById(R.id.submitButton);
        btnPress(submitButton, LoggedInMenu.makeIntent(SubscribePremium.this));
//        submitButton.setOnClickListener(new View.OnClickListener() {
////            @Override
//            public void onClick(View v) {
//
//
//            }
//        });

    }

    private void btnPress(Button button, final Intent intent) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SubscribePremium.this, "You are now a premium user!", Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);
            }
        });
    }




    //    private void showToast(String text){
//        Toast.makeText(SubscribePremium.this, text, Toast.LENGTH_SHORT).show();
//    }
    public static Intent makeIntent(Context context) {
        return new Intent(context, SubscribePremium.class);
    }
}
