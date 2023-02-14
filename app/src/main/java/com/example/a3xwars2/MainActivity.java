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
    int i ;
    private ProgressBar progressBar;
    private Button startProgress;
    private Handler manejador= new Handler(Looper.getMainLooper());
    boolean inActivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);


        progressBar.setMax(100);




    manejador.postDelayed(new Runnable() {
        @Override
        public void run() {
            carrega();
        }
    },1000);


    }


    public void carrega(){
        if (!inActivo){
            Thread hilo = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (i<=100){
                        manejador.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setProgress(i);
                            }
                        });
                        try {
                            Thread.sleep(10);
                        }catch (InterruptedException e ){
                            e.printStackTrace();
                        }
                        if(i==100){
                            Intent a = new Intent(MainActivity.this, loginPage.class);
                            startActivity(a);

                        }
                        i++;
                        inActivo= true;
                    }
                }
            });
            hilo.start();
        }


    }
}