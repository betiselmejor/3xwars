package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a3xwars2.objetos.Jugador;
import com.example.a3xwars2.objetos.Tauler;

import java.util.ArrayList;

public class offlineBattle extends AppCompatActivity {

    ImageView tablero,huecoC1L1n8,huecoC1L2n3,huecoC1L3n4,huecoC2L1n1,huecoC2L2n5,huecoC2L3n9,huecoC3L1n6,huecoC3L2n7,huecoC3L3n2;
    CardView indicadorTornX,indicadorTornO;
    TextView tornTV;

    ArrayList<ImageView> huecos;
    private Handler manejador= new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_battle);




        initall();

        partida();
    }

    public void initall(){
        Jugador j1= new Jugador(R.drawable.espadaslaser);
        Jugador j2= new Jugador(R.drawable.escudo);

        tornTV= (TextView) findViewById(R.id.torn);

        indicadorTornO=(CardView) findViewById(R.id.cvindicadorTornO);
        indicadorTornO.setBackgroundResource(R.drawable.cardview1);

        indicadorTornX=(CardView) findViewById(R.id.cvindicadorTornX);

        Tauler tauler= new Tauler(R.drawable.tauler);
        tablero = (ImageView) findViewById(R.id.tableroSkin);
        tablero.setImageResource(tauler.getSkin());

        huecoC1L1n8 = (ImageView) findViewById(R.id.huecoC1L1n8);

        huecoC1L2n3 = (ImageView) findViewById(R.id.huecoC1L2n3);

        huecoC1L3n4 = (ImageView) findViewById(R.id.huecoC1L3n4);


        huecoC2L1n1 = (ImageView) findViewById(R.id.huecoC2L1n1);

        huecoC2L2n5 = (ImageView) findViewById(R.id.huecoC2L2n5);

        huecoC2L3n9 = (ImageView) findViewById(R.id.huecoC2L3n9);


        huecoC3L1n6 = (ImageView) findViewById(R.id.huecoC3L1n6);
        huecoC3L2n7 = (ImageView) findViewById(R.id.huecoC3L2n7);
        huecoC3L3n2 = (ImageView) findViewById(R.id.huecoC3L3n2);




    }


    public void cambiarImg(ImageView iv, Jugador j){
        iv.setImageResource(j.getSkin());



    }

    public String initTorn(){

        String tornS="null";
        int torn= (int) (Math.random()*2);
        while( torn ==2){
            torn= (int) (Math.random()*2);
        }
        if (torn==0){
            tornS="J1";
        }else if(torn==1){
            tornS="J2";
        }


        return tornS;

    }

    public void partida(){
        boolean victoria=false;




    }
}