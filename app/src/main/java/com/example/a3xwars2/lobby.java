package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class lobby extends AppCompatActivity {

    Button addAFriend, battleAFriend, offlineBattle , randomBattle;
    ImageView message, options, shop, profile;
    TextView username;
    String usernameS;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
//
//        Intent i = this.getIntent();
//        bundle = i.getExtras();
//        usernameS = bundle.getString("userName");


        initall();
    }

    public void initall() {
        addAFriend = (Button) findViewById(R.id.addAFriendbtn);
        addAFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,addFriend.class);
                startActivity(a);
            }
        });

        battleAFriend = (Button) findViewById(R.id.BattleAFriendbtn);
        battleAFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,TODO.class);
                startActivity(a);
            }
        });

        offlineBattle = (Button) findViewById(R.id.offlineBattlebtn);
        offlineBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,offlineBattleConfig.class);
                a.putExtra("message","activityLobby");
                startActivity(a);
            }
        });

        randomBattle = (Button) findViewById(R.id.randomBattleebtn);
        randomBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,TODO.class);
                startActivity(a);
            }
        });



        message = (ImageView) findViewById(R.id.messagebtn);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,Messages.class);
                startActivity(a);
            }
        });
        options = (ImageView) findViewById(R.id.optionsbtn);
        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,options.class);
                startActivity(a);
            }
        });

        shop = (ImageView) findViewById(R.id.shopbtn);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,coinShop.class);
                startActivity(a);
            }
        });


        profile = (ImageView) findViewById(R.id.profilebtn);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(lobby.this,perfil.class);
                startActivity(a);
            }
        });

        username = (TextView) findViewById(R.id.usernameLobbyTV);
        username.setText(usernameS);

    }
}