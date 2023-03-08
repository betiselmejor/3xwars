package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.DateIntervalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.a3xwars2.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.a3xwars2.adapter.AdapterSkins1;
import com.example.a3xwars2.objetos.Skin;

import java.util.ArrayList;
import java.util.List;

public class Skins extends AppCompatActivity implements SelectListner {
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
        addfieldskins();


    }

    public void addfieldskins(){
        Skin rojo= new Skin(R.drawable.tablerorojo,"Red","T");
        Skin azul= new Skin(R.drawable.tableroazul,"Blue","T");
        Skin winsiete= new Skin(R.drawable.winsiete,"Win 7","T");
        Skin rojoazul= new Skin(R.drawable.tableroazulrojo,"Degrade","T");



        skinsfield.add(rojo);
        skinsfield.add(azul);
        skinsfield.add(winsiete);
        skinsfield.add(rojoazul);


        AdapterSkins1 adapter = new AdapterSkins1(skinsfield,this);

        ScaleCenterItemLayoutManager layoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        fieldskins.setLayoutManager(layoutManager);
        fieldskins.setAdapter(adapter);
    }

    public void addxSkins(){
        Skin espadasx= new Skin(R.drawable.espadasx,"espadasx","X");
        Skin espadasLaser= new Skin(R.drawable.espadaslaser,"Espadas L.","X");
        Skin hachas= new Skin(R.drawable.hachas,"Hachas","X");
        Skin hachasrojas= new Skin(R.drawable.hachasrojas,"Hachas R.","X");
        Skin hachasazules= new Skin(R.drawable.hachasazules,"Hachas A.","X");

        skinsx.add(espadasx);
        skinsx.add(espadasLaser);
        skinsx.add(hachas);
        skinsx.add(hachasrojas);
        skinsx.add(hachasazules);

        AdapterSkins1 adapter = new AdapterSkins1(skinsx,this);
        xskins.setLayoutManager( new LinearLayoutManager(getApplicationContext()));

        xskins.setAdapter(adapter);
    }

    public void addoSkins(){
        Skin escudo= new Skin(R.drawable.escudo,"Escudo","O");
        Skin bola= new Skin(R.drawable.pelota,"Bola F.","O");
        Skin bolabetis= new Skin(R.drawable.bolabetislila,"Bola F.B.","O");
        Skin bolabetislila= new Skin(R.drawable.bolabetisverde,"Bola F.B.L.","O");

        skinso.add(escudo);
        skinso.add(bola);
        skinso.add(bolabetis);
        skinso.add(bolabetislila);

        AdapterSkins1 adapter = new AdapterSkins1(skinso,this);
        oskins.setLayoutManager( new LinearLayoutManager(getApplicationContext()));
        oskins.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(Skin skin) {

        SharedPreferences preferences = getSharedPreferences("skins",MODE_PRIVATE);

        SharedPreferences.Editor editor= preferences.edit();
        if (skin.getType().equals("X")){
            editor.putInt("skinX",skin.getSkin());
            Toast.makeText(getApplicationContext(),skin.getNom()+"Selected for x",Toast.LENGTH_SHORT).show();
        }else if (skin.getType().equals("O")){
            editor.putInt("skinO",skin.getSkin());
            Toast.makeText(getApplicationContext(),skin.getNom()+"Selected for o",Toast.LENGTH_SHORT).show();
        }else if (skin.getType().equals("T")){
            editor.putInt("skinT",skin.getSkin());
            Toast.makeText(getApplicationContext(),skin.getNom()+"Selected for table",Toast.LENGTH_SHORT).show();
        }
        editor.commit();
    }
}