package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginPage extends AppCompatActivity {

    EditText usernameET, passwordET;
    Button login, offline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initall();
    }

    public void initall(){
        login = findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeLoginLobby = new Intent(loginPage.this, lobby.class);
                changeLoginLobby.putExtra("userName", usernameET.getText());
                startActivity(changeLoginLobby);
            }
        });



        offline = findViewById(R.id.goOflinebtn);
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
    }
}