package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        usernameET = (EditText) findViewById(R.id.addFriendUsernameET);


        sendRequest = (Button) findViewById(R.id.addFriendSendRequestBTN);
        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Request send to " + String.valueOf(usernameET.getText()),Toast.LENGTH_SHORT).show();
            }
        });

    }
     
    public void addusers(){
        List<Usuario> usuarios = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            usuarios.add(new Usuario("usuario" + i));
        }

        AdapterAddUser adapter = new AdapterAddUser(usuarios);
        adapter.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameET.setText(usuarios.get(recyclerView.getChildAdapterPosition(v)).getNom());
            }
        });
        recyclerView.setAdapter(adapter);
    }
    
}