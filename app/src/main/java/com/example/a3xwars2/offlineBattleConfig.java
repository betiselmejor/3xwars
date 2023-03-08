package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class offlineBattleConfig extends AppCompatActivity {

    TextView vsiaTV,easyModeTv,betisMode,dosplayers;
    Button gobtn;
    String tipusPartida="a";
    ImageView backArrow;
    String beforeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_battle_config);

        beforeActivity = getIntent().getStringExtra("message");

        init();
    }

    public void init(){
        backArrow=(ImageView) findViewById(R.id.flechaenrereOfflinebattleconfiguration);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beforeActivity.equals("activityLogin")){
                    Intent a = new Intent(offlineBattleConfig.this,loginPage.class);
                    startActivity(a);
                }else if (beforeActivity.equals("activityLobby")){
                    Intent a = new Intent(offlineBattleConfig.this,lobby.class);
                    startActivity(a);
                }

            }
        });

        vsiaTV = (TextView) findViewById(R.id.vsiaTV);

        easyModeTv = (TextView) findViewById(R.id.easyModeTV);
        easyModeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectGameType(easyModeTv);
            }
        });

        betisMode = (TextView) findViewById(R.id.betisModeTV);
        betisMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectGameType(betisMode);

            }
        });

        dosplayers = (TextView) findViewById(R.id.dosplayers);
        dosplayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectGameType(dosplayers);
            }
        });


        gobtn = (Button) findViewById(R.id.gobtn);
        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gonextActivity();
            }
        });
    }

    public void selectGameType(TextView tv){

        if (tv.getId()==R.id.easyModeTV){
            easyModeTv.setTextColor(Color.parseColor("#FFFFFF"));
            tipusPartida= "easymode";
            vsiaTV.setTextColor(Color.parseColor("#FFFFFF"));

            betisMode.setTextColor(Color.parseColor("#2f2a2a"));
            dosplayers.setTextColor(Color.parseColor("#2f2a2a"));

        }
        if (tv.getId()==R.id.betisModeTV){
            /*poner en blanco lo seleccionado y cambiar el string*/
            betisMode.setTextColor(Color.parseColor("#FFFFFF"));
            tipusPartida= "betismode";
            vsiaTV.setTextColor(Color.parseColor("#FFFFFF"));

            /*poner lo demas en negro*/
            easyModeTv.setTextColor(Color.parseColor("#2f2a2a"));
            dosplayers.setTextColor(Color.parseColor("#2f2a2a"));
//

        }
        if (tv.getId()==R.id.dosplayers){
            /*poner en blanco lo seleccionado y cambiar el string*/
            dosplayers.setTextColor(Color.parseColor("#FFFFFF"));
            tipusPartida= "dosplayers";


            /*poner lo demas en negro*/
            vsiaTV.setTextColor(Color.parseColor("#2f2a2a"));
            easyModeTv.setTextColor(Color.parseColor("#2f2a2a"));
            betisMode.setTextColor(Color.parseColor("#2f2a2a"));

        }

    }

    public void gonextActivity(){
        Intent a = new Intent(offlineBattleConfig.this,TODO.class);
        Intent b = new Intent(offlineBattleConfig.this,TODO.class);
        Intent c = new Intent(offlineBattleConfig.this,offlineBattle.class);

        if (tipusPartida.equals("easymode")){
            startActivity(a);
        }if (tipusPartida.equals("betismode")){
            startActivity(b);
        }if (tipusPartida.equals("dosplayers")){
            startActivity(c);
        }
    }
}