package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.a3xwars2.objetos.Tauler;

public class offlineBattle extends AppCompatActivity {

    ImageView tablero,huecoC1L1n8,huecoC1L2n3,huecoC1L3n4,huecoC2L1n1,huecoC2L2n5,huecoC2L3n9,huecoC3L1n6,huecoC3L2n7,huecoC3L3n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_battle);


        initall();
    }

    public void initall(){
        Tauler tauler= new Tauler(R.drawable.tauler);
        tablero = (ImageView) findViewById(R.id.tableroSkin);
        tablero.setImageResource(tauler.getSkin());

    }
}