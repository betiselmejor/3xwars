package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.a3xwars2.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.a3xwars2.adapter.AdapterAddUser;
import com.example.a3xwars2.objetos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class addFriend extends AppCompatActivity {
RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        initall();
    }

    public void initall(){
        recyclerView = findViewById(R.id.recyclerAddfriend);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        ScaleCenterItemLayoutManager layoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        addusers();

    }
     
    public void addusers(){
        List<Usuario> usuarios = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            usuarios.add(new Usuario("usuario"));
        }

        AdapterAddUser adapter = new AdapterAddUser(usuarios);
        recyclerView.setAdapter(adapter);
    }
    
}