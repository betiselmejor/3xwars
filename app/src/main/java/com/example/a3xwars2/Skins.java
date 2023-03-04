package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.a3xwars2.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.a3xwars2.adapter.AdapterSkins1;
import com.example.a3xwars2.objetos.Skin;

import java.util.ArrayList;
import java.util.List;

public class Skins extends AppCompatActivity {
    RecyclerView xskins,oskins,fieldskins;
    List<Skin> skinsx = new ArrayList<>();
    List<Skin> skinso = new ArrayList<>();
    List<Skin> skinsfield = new ArrayList<>();
    ImageView backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skins);

        initall();

    }


    public void initall(){

        backArrow=(ImageView) findViewById(R.id.flechaenrereSkins);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Skins.this,lobby.class);
                startActivity(a);
            }
        });



        xskins=(RecyclerView) findViewById(R.id.xskins);
        addxSkins();


        oskins=(RecyclerView) findViewById(R.id.oskins);
        addoSkins();


        fieldskins=(RecyclerView) findViewById(R.id.fieldskins);


    }

    public void addxSkins(){
        Skin espadasx= new Skin(R.drawable.espadasx,"espadasx");
        Skin espadasLaser= new Skin(R.drawable.espadaslaser,"Espadas L.");
        Skin hachas= new Skin(R.drawable.hachas,"Hachas");
        Skin hachasrojas= new Skin(R.drawable.hachasrojas,"Hachas R.");
        Skin hachasazules= new Skin(R.drawable.hachasazules,"Hachas A.");

        skinsx.add(espadasx);
        skinsx.add(espadasLaser);
        skinsx.add(hachas);
        skinsx.add(hachasrojas);
        skinsx.add(hachasazules);

        AdapterSkins1 adapter = new AdapterSkins1(skinsx);
        xskins.setLayoutManager( new LinearLayoutManager(getApplicationContext()));

        xskins.setAdapter(adapter);
    }

    public void addoSkins(){
        Skin escudo= new Skin(R.drawable.escudo,"Escudo");
        Skin bola= new Skin(R.drawable.pelota,"Bola F.");
        Skin bolabetis= new Skin(R.drawable.bolabetislila,"Bola F.B.");
        Skin bolabetislila= new Skin(R.drawable.bolabetisverde,"Bola F.B.L.");

        skinso.add(escudo);
        skinso.add(bola);
        skinso.add(bolabetis);
        skinso.add(bolabetislila);

        AdapterSkins1 adapter = new AdapterSkins1(skinso);
        oskins.setLayoutManager( new LinearLayoutManager(getApplicationContext()));
        oskins.setAdapter(adapter);
    }
}