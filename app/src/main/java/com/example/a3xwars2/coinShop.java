package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class coinShop extends AppCompatActivity {

EditText coinsET, dollarsET;
Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_shop);

        calculate = (Button) findViewById(R.id.calculateButton);
        coinsET = (EditText) findViewById(R.id.coinsET);
        dollarsET = (EditText) findViewById(R.id.dollarsET);
    }
}