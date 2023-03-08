package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a3xwars2.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.a3xwars2.adapter.AdapterAddUser;
import com.example.a3xwars2.objetos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class addFriend extends AppCompatActivity {

RecyclerView recyclerView;
EditText usernameET;
Button sendRequest;
ImageView backArrow;
List<Usuario> usuarios = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        addusers();
        initall();
    }

    public void initall(){




        usernameET = (EditText) findViewById(R.id.addFriendUsernameET);


        sendRequest = (Button) findViewById(R.id.addFriendSendRequestBTN);
        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Request send to " + String.valueOf(usernameET.getText()),Toast.LENGTH_SHORT).show();
            }
        });

        backArrow=(ImageView) findViewById(R.id.flechaenrereAddafriend);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(addFriend.this,lobby.class);
                startActivity(a);
            }
        });

    }
     
    public void addusers(){


        for (int i = 0; i < 10; i++) {
            usuarios.add(new Usuario("usuario" + i));
        }

        AdapterAddUser adapter = new AdapterAddUser(usuarios);

        recyclerView = findViewById(R.id.recyclerAddfriend);
        ScaleCenterItemLayoutManager layoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapter.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_SHORT).show();
                usernameET.setText(usuarios.get(recyclerView.getChildAdapterPosition(v)).getNom());
            }
        });
        recyclerView.setAdapter(adapter);
    }

    
}