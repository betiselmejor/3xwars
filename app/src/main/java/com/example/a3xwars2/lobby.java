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
        usernameS = getIntent().getExtras().getString("userName");


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
        offlineBattle = (Button) findViewById(R.id.offlineBattlebtn);
        randomBattle = (Button) findViewById(R.id.randomBattleebtn);


        message = (ImageView) findViewById(R.id.messagebtn);
        options = (ImageView) findViewById(R.id.optionsbtn);
        shop = (ImageView) findViewById(R.id.shopbtn);
        profile = (ImageView) findViewById(R.id.profilebtn);

        username = (TextView) findViewById(R.id.usernameLobbyTV);
        username.setText(usernameS);

    }
}