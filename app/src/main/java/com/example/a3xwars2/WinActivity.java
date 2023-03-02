package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    TextView winnerTV;
    Button goLobby,PlayAgain;
    ImageView winnerSkin;

    String guanyador;
    int skin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        Intent intent=getIntent();
         guanyador= intent.getStringExtra("guanyador");

         skin = intent.getIntExtra("skin",0);

        initall();
    }

    public void initall(){
        winnerTV = (TextView) findViewById(R.id.winnerTV);
        if (guanyador.equals("X")){
            winnerTV.setText("X WINS");
        }else {
            winnerTV.setText("O WINS");
        }

        winnerSkin = (ImageView) findViewById(R.id.winnerSkin);
        winnerSkin.setImageResource(skin);

    }
}