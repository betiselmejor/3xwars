package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a3xwars2.objetos.Jugador;
import com.example.a3xwars2.objetos.Tauler;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class offlineBattle extends AppCompatActivity {

    ImageView tablero,huecoC1L1n8,huecoC1L2n3,huecoC1L3n4,huecoC2L1n1,huecoC2L2n5,huecoC2L3n9,huecoC3L1n6,huecoC3L2n7,huecoC3L3n2;
    CardView indicadorTornX,indicadorTornO;
    TextView tornTV,xtornIndicador,otornIndicador;
    Jugador X,O;

    ArrayList<ImageView> huecos;

    boolean tresx=false;
    boolean treso=false;

    String torn;
    private Handler manejador= new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_battle);




        initall();


    }

    public void initall(){
        SharedPreferences preferences = getSharedPreferences("skins",MODE_PRIVATE);
        int skinX= preferences.getInt("skinX",R.drawable.hachasazules);
        int skinO= preferences.getInt("skinO",R.drawable.escudo);
        int skinT= preferences.getInt("skinT",R.drawable.asd);

         X= new Jugador(skinX);
         O= new Jugador(skinO);

        tornTV= (TextView) findViewById(R.id.torn);
        torn = initTorn();
        tornTV.setText(torn);

        indicadorTornO=(CardView) findViewById(R.id.cvindicadorTornO);
        indicadorTornO.setBackgroundResource(R.drawable.cardview1);

        indicadorTornX=(CardView) findViewById(R.id.cvindicadorTornX);
        indicadorTornX.setBackgroundResource(R.drawable.cardview1);

        otornIndicador = (TextView) findViewById(R.id.oTornIndicador);
        xtornIndicador = (TextView) findViewById(R.id.xTornIndicador);

        if  (torn.equals("X")){
            xtornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#00a62c"))));
        }else if (torn.equals("O")){
            otornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#00a62c"))));
        }

        indicadorTornX=(CardView) findViewById(R.id.cvindicadorTornX);

        Tauler tauler= new Tauler(skinT);
        tablero = (ImageView) findViewById(R.id.tableroSkin);
        tablero.setImageResource(tauler.getSkin());




        huecoC1L1n8 = (ImageView) findViewById(R.id.huecoC1L1n8);
        huecoC1L1n8.setImageResource(R.drawable.trans);
        huecoC1L1n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L1n8);

            }
        });

        huecoC1L2n3 = (ImageView) findViewById(R.id.huecoC1L2n3);
        huecoC1L2n3.setImageResource(R.drawable.trans);
        huecoC1L2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L2n3);

            }
        });

        huecoC1L3n4 = (ImageView) findViewById(R.id.huecoC1L3n4);
        huecoC1L3n4.setImageResource(R.drawable.trans);
        huecoC1L3n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L3n4);

            }
        });




        huecoC2L1n1 = (ImageView) findViewById(R.id.huecoC2L1n1);
        huecoC2L1n1.setImageResource(R.drawable.trans);
        huecoC2L1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L1n1);

            }
        });

        huecoC2L2n5 = (ImageView) findViewById(R.id.huecoC2L2n5);
        huecoC2L2n5.setImageResource(R.drawable.trans);
        huecoC2L2n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L2n5);

            }
        });

        huecoC2L3n9 = (ImageView) findViewById(R.id.huecoC2L3n9);
        huecoC2L3n9.setImageResource(R.drawable.trans);
        huecoC2L3n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L3n9);

            }
        });



        huecoC3L1n6 = (ImageView) findViewById(R.id.huecoC3L1n6);
        huecoC3L1n6.setImageResource(R.drawable.trans);
        huecoC3L1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L1n6);

            }
        });

        huecoC3L2n7 = (ImageView) findViewById(R.id.huecoC3L2n7);
        huecoC3L2n7.setImageResource(R.drawable.trans);
        huecoC3L2n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L2n7);

            }
        });

        huecoC3L3n2 = (ImageView) findViewById(R.id.huecoC3L3n2);
        huecoC3L3n2.setImageResource(R.drawable.trans);
        huecoC3L3n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L3n2);

            }
        });




    }




    public void cambiaTorn(){
        if (torn.equals("X")){
            otornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#00a62c"))));
            xtornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#FFFFFF"))));
            torn = "O";
            tornTV.setText(torn);
        }else if (torn.equals("O")){
            torn = "X";
            tornTV.setText(torn);
            otornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#FFFFFF"))));
            xtornIndicador.setTextColor(Integer.parseInt(String.valueOf(Color.parseColor("#00a62c"))));

        }

    }

    public String initTorn(){

        String tornS="null";
        int torn= (int) (Math.random()*2);
        while( torn ==2){
            torn= (int) (Math.random()*2);
        }
        if (torn==0){
            tornS="X";
        }else if(torn==1){
            tornS="O";
        }


        return tornS;

    }


    public void posarFitxa(ImageView iv){

        if (torn.equals("X")){



            /*Si esta insertem a la casella la foto de la skin del jugador xi li sumem al contador de fitxes d'aquest 1 mes*/
            iv.setImageResource(X.getSkin());

            X.setFitxes(X.getFitxes()+1);


        }else if(torn.equals("O")){


            iv.setImageResource(O.getSkin());
                O.setFitxes(O.getFitxes()+1);



        }

    }

    public boolean checkOcupada(ImageView iv){
        boolean ocupada= false;

        Drawable drawable  = iv.getDrawable();
        Drawable drawableTrans = getResources().getDrawable(R.drawable.trans);

        if (drawable != null && drawable.getConstantState().equals(drawableTrans.getConstantState())) {
                ocupada=false;
        } else if (drawable != null && !drawable.getConstantState().equals(drawableTrans.getConstantState())) {
            ocupada=true;

        }
    return ocupada;
    }

    public void retiraFitxa(){
        Jugador j = new Jugador();
        int skinJugador= 0;
        if (torn.equals("X")){
            j = X;
            skinJugador=X.getSkin();
        }else if (torn.equals("O")){
            j=O;
            skinJugador=O.getSkin();
        }

        int finalSkinJugador = skinJugador;
        huecoC1L1n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC1L1n8.getDrawable();
                if (esMateixaFoto(huecoC1L1n8,finalSkinJugador)){
                    huecoC1L1n8.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });




        huecoC1L2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC1L2n3.getDrawable();
                if (esMateixaFoto(huecoC1L2n3,finalSkinJugador)){
                    huecoC1L2n3.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });



        huecoC1L3n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC1L3n4.getDrawable();
                if (esMateixaFoto(huecoC1L3n4,finalSkinJugador)){
                    huecoC1L3n4.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });




        huecoC2L1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC2L1n1.getDrawable();
                if (esMateixaFoto(huecoC2L1n1,finalSkinJugador)){
                    huecoC2L1n1.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });



        huecoC2L2n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC2L2n5.getDrawable();
                if (esMateixaFoto(huecoC2L2n5,finalSkinJugador)){
                    huecoC2L2n5.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });



        huecoC2L3n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC2L3n9.getDrawable();
                if (esMateixaFoto(huecoC2L3n9,finalSkinJugador)){
                    huecoC2L3n9.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
                });


        huecoC3L1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC3L1n6.getDrawable();
                if (esMateixaFoto(huecoC3L1n6,finalSkinJugador)){
                    huecoC3L1n6.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });
        huecoC3L2n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC3L2n7.getDrawable();
                if (esMateixaFoto(huecoC3L2n7,finalSkinJugador)){
                    huecoC3L2n7.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });
        huecoC3L3n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = huecoC3L3n2.getDrawable();
                if (esMateixaFoto(huecoC3L3n2,finalSkinJugador)){
                    huecoC3L3n2.setImageResource(R.drawable.trans);
                    if (torn.equals("X")){
                        X.setFitxes(X.getFitxes()-1);
                    }else if (torn.equals("O")){
                        O.setFitxes(O.getFitxes()-1);
                    }
                    restartListeners();
                }else{
                    Toast.makeText(getApplicationContext(),"Aquesta casella no hi ha una fitxa teva o esta buida;",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void restartListeners(){
        huecoC1L1n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L1n8);

            }
        });




        huecoC1L2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L2n3);

            }
        });


        huecoC1L3n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC1L3n4);

            }
        });





        huecoC2L1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L1n1);

            }
        });





        huecoC2L2n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L2n5);

            }
        });



        huecoC2L3n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC2L3n9);

            }
        });




        huecoC3L1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L1n6);

            }
        });




        huecoC3L2n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L2n7);

            }
        });





        huecoC3L3n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickarEspai(huecoC3L3n2);

            }
        });






    }



    public boolean esMateixaFoto(ImageView iv, int skinJugador){
        boolean retuurn;
        Drawable drawable = getResources().getDrawable(skinJugador);
        Drawable ivDrawable = iv.getDrawable();
        if (ivDrawable != null && drawable != null && ivDrawable.getConstantState().equals(drawable.getConstantState())) {
            retuurn=true;
        } else {
            retuurn=false;
        }
        return retuurn;
    }

    public boolean seguentTe3fitxes(){
        boolean t3f = false;

        if (torn.equals("X")){
            if (O.getFitxes()==3){
                t3f=true;
            }else{
                t3f=false;
            }
        }else if(torn.equals("O")){
            if (X.getFitxes()==3){
                t3f=true;
            }else{
                t3f=false;
            }
        }

        return t3f;
    }

    public void clickarEspai(ImageView iv){
        if (checkOcupada(iv)==false){

            posarFitxa(iv);

comprovaVictoria();

            if (seguentTe3fitxes()==true){
                cambiaTorn();
                Toast.makeText(getApplicationContext(),"Tens 3 fitxes, treu una de les que tens posades" + torn,Toast.LENGTH_SHORT).show();

                retiraFitxa();


            }else {
                cambiaTorn();
            }

        }else{
            Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
        }

    }

    public void comprovaVictoria(){
        boolean victoria=false;
        Intent a = new Intent(offlineBattle.this, WinActivity.class);

        Drawable transd = getResources().getDrawable(R.drawable.trans);
        Drawable.ConstantState transCS= transd.getConstantState();

//        drawables columna 1
        Drawable.ConstantState c1_l1=huecoC1L1n8.getDrawable().getConstantState();
        Drawable.ConstantState c1_l2=huecoC1L2n3.getDrawable().getConstantState();
        Drawable.ConstantState c1_l3=huecoC1L3n4.getDrawable().getConstantState();

        //        drawables columna 2
        Drawable.ConstantState c2_l1=huecoC2L1n1.getDrawable().getConstantState();
        Drawable.ConstantState c2_l2=huecoC2L2n5.getDrawable().getConstantState();
        Drawable.ConstantState c2_l3=huecoC2L3n9.getDrawable().getConstantState();

        //        drawables columna 3
        Drawable.ConstantState c3_l1=huecoC3L1n6.getDrawable().getConstantState();
        Drawable.ConstantState c3_l2=huecoC3L2n7.getDrawable().getConstantState();
        Drawable.ConstantState c3_l3=huecoC3L3n2.getDrawable().getConstantState();

        if ( !c1_l1.equals(transCS) &&       c1_l1.equals(c1_l2) && c1_l2.equals(c1_l3)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();
                }
            },1000);

        }else if (!c2_l1.equals(transCS) &&       c2_l1.equals(c2_l2) && c2_l2.equals(c2_l3)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);

        }else if (!c3_l1.equals(transCS) &&       c3_l1.equals(c3_l2) && c3_l2.equals(c3_l3)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }/*lineas*/else if (!c1_l1.equals(transCS) &&       c1_l1.equals(c2_l1) && c3_l1.equals(c2_l1)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }else if (!c1_l2.equals(transCS) &&  c1_l2.equals(c2_l2) && c3_l2.equals(c2_l2)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }else if (!c1_l3.equals(transCS) &&c1_l3.equals(c2_l3) && c3_l3.equals(c2_l3)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }/*diagonal*/else if (!c1_l1.equals(transCS) &&c1_l1.equals(c2_l2) && c3_l3.equals(c2_l2)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }else if (!c3_l1.equals(transCS) && c3_l1.equals(c2_l2) && c1_l3.equals(c2_l2)){
            manejador.postDelayed(new Runnable() {
                @Override
                public void run() {
                    enviaVictoria();

                }
            },1000);
        }

    }


    public void enviaVictoria(){
        Intent a = new Intent(offlineBattle.this, WinActivity.class);

        if (torn=="X"){
            a.putExtra("skin",O.getSkin());
            a.putExtra("guanyador","O");
        }else{
            a.putExtra("skin",X.getSkin());
            a.putExtra("guanyador","X");
        }


        startActivity(a);
    }


}