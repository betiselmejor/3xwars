package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private Button startProgress;
    private Handler manejador= new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);


        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);progressBar.setMax(100);
                if (CurrentProgress==100){
                    Intent intent = new Intent(MainActivity.this, loginPage.class);
                    startActivity(intent);
                }
            }
        });




//        while(true){
//            manejador.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    progressBar.setProgress(CurrentProgress);
//                    CurrentProgress = CurrentProgress +10;
//
//                }
//            },1000);
//        }
    }
}