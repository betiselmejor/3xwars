package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginPage extends AppCompatActivity {

    EditText usernameET, passwordET;
    TextView createAccount;
    Button login, offline;
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initall();
    }

    public void initall(){



        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
        login = findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username= String.valueOf(usernameET.getText());
                Intent changeLoginLobby = new Intent(loginPage.this, lobby.class);
                changeLoginLobby.putExtra("userName",username);
                startActivity(changeLoginLobby);
            }
        });

        createAccount=(TextView) findViewById(R.id.register);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(loginPage.this,Register.class);
                startActivity(a);
            }
        });



        offline = findViewById(R.id.goOflinebtn);
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(loginPage.this,offlineBattleConfig.class);
                a.putExtra("message","activityLogin");
                startActivity(a);
            }
        });

    }
}