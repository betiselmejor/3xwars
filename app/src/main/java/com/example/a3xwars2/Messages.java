package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.a3xwars2.adapter.AdapterMessage;
import com.example.a3xwars2.objetos.Message;

import java.util.ArrayList;
import java.util.List;

public class Messages extends AppCompatActivity {
    ImageView backArrow;
    RecyclerView recyclerView;
    List<Message> messageList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        backArrow=(ImageView) findViewById(R.id.flechaenrereMessages);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Messages.this,lobby.class);
                startActivity(a);
            }
        });

        addMessages();
    }
    public void addMessages(){
        Message m1 = new Message("20% OFF COINS","3xWARS");
        Message m2 = new Message("Combat invite","paquitoxd");
        Message m3 = new Message("Friend request","ElRubius");
        Message m4 = new Message("New skin released!","3xWARS");
        Message m5 = new Message("Purchase confirmation","3xWARS");
        Message m6 = new Message("Report sent","3xWARS");
        Message m7 = new Message("10% OFF COINS","3xWARS");
        Message m8 = new Message("TOP 1!!","3xWARS");
        Message m9 = new Message("20% OFF COINS","3xWARS");
        Message m10 = new Message("20% OFF COINS","3xWARS");

        messageList.add(m1);
        messageList.add(m2);
        messageList.add(m3);
        messageList.add(m4);
        messageList.add(m5);
        messageList.add(m6);
        messageList.add(m7);
        messageList.add(m8);
        messageList.add(m9);
        messageList.add(m10);

        AdapterMessage adapterMessage = new AdapterMessage(messageList);

        recyclerView = findViewById(R.id.recyclerMessages);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapterMessage);
    }


}