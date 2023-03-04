package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.a3xwars2.adapter.AdapterSkins1;
import com.example.a3xwars2.objetos.Skin;
import com.example.a3xwars2.objetos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class perfil extends AppCompatActivity {
    ImageView backArrow;
    Button seeyourskins;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


        initall();
    }

    public void initall(){

        backArrow=(ImageView) findViewById(R.id.flechaenrerePerfil);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(perfil.this,lobby.class);
                startActivity(a);
            }
        });


        seeyourskins= (Button) findViewById(R.id.seeyourskins);
        seeyourskins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(perfil.this,Skins.class);
                startActivity(a);
            }
        });




    }




}