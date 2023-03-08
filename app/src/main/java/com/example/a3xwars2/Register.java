package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText usernameET, passwordET,passwordET2,gmail;
    Button  loginbtn;
    ImageView flechaEnrere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
    }

    public void init(){
        usernameET = (EditText) findViewById(R.id.usernameET2);
        passwordET = (EditText) findViewById(R.id.passwordET2);
        passwordET2 = (EditText) findViewById(R.id.passwordET22);
        gmail = (EditText) findViewById(R.id.gmail2);

        flechaEnrere=(ImageView) findViewById(R.id.flechaenrereRegister);
        flechaEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Register.this,loginPage.class);
                startActivity(a);
            }
        });

        loginbtn=(Button) findViewById(R.id.loginbtn2);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterAction();
            }
        });


    }

    public void RegisterAction(){

    }
}