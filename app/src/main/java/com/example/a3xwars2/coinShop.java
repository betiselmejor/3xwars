package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class coinShop extends AppCompatActivity {

EditText coinsET, dollarsET;
Button calculate;
    ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_shop);

        calculate = (Button) findViewById(R.id.calculateButton);
        coinsET = (EditText) findViewById(R.id.coinsET);
        dollarsET = (EditText) findViewById(R.id.dollarsET);

        backArrow=(ImageView) findViewById(R.id.flechaenrereCoinshop);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(coinShop.this,lobby.class);
                startActivity(a);
            }
        });
    }
}