package com.example.a3xwars2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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

    String torn;
    private Handler manejador= new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_battle);




        initall();

        partida();
    }

    public void initall(){
         X= new Jugador(R.drawable.espadaslaser);
         O= new Jugador(R.drawable.escudo);

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

        Tauler tauler= new Tauler(R.drawable.tauler);
        tablero = (ImageView) findViewById(R.id.tableroSkin);
        tablero.setImageResource(tauler.getSkin());




        huecoC1L1n8 = (ImageView) findViewById(R.id.huecoC1L1n8);
        huecoC1L1n8.setImageResource(R.drawable.trans);
        huecoC1L1n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC1L1n8)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes,retira 1",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC1L1n8);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC1L2n3 = (ImageView) findViewById(R.id.huecoC1L2n3);
        huecoC1L2n3.setImageResource(R.drawable.trans);
        huecoC1L2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC1L2n3)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC1L2n3);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC1L3n4 = (ImageView) findViewById(R.id.huecoC1L3n4);
        huecoC1L3n4.setImageResource(R.drawable.trans);
        huecoC1L3n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC1L3n4)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC1L3n4);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });




        huecoC2L1n1 = (ImageView) findViewById(R.id.huecoC2L1n1);
        huecoC2L1n1.setImageResource(R.drawable.trans);
        huecoC2L1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L1n1)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC2L1n1);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC2L2n5 = (ImageView) findViewById(R.id.huecoC2L2n5);
        huecoC2L2n5.setImageResource(R.drawable.trans);
        huecoC2L2n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L2n5)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC2L2n5);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC2L3n9 = (ImageView) findViewById(R.id.huecoC2L3n9);
        huecoC2L3n9.setImageResource(R.drawable.trans);
        huecoC2L3n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L3n9)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC2L3n9);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });



        huecoC3L1n6 = (ImageView) findViewById(R.id.huecoC3L1n6);
        huecoC3L1n6.setImageResource(R.drawable.trans);
        huecoC3L1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L1n6)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC3L1n6);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC3L2n7 = (ImageView) findViewById(R.id.huecoC3L2n7);
        huecoC3L2n7.setImageResource(R.drawable.trans);
        huecoC3L2n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L2n7)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC3L2n7);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });

        huecoC3L3n2 = (ImageView) findViewById(R.id.huecoC3L3n2);
        huecoC3L3n2.setImageResource(R.drawable.trans);
        huecoC3L3n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L3n2)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();
                        retiraFitxa();

                    }else{
                        click(huecoC3L3n2);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

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

    public void partida(){
        boolean victoria=false;




    }

    public void click(ImageView iv){

        if (torn.equals("X")){
            /* mira si el jugador X te les 3 fitxes colocades*/
            if (X.getFitxes()==3){
                Toast.makeText(getApplicationContext(),"TENS 3 FITXES X",Toast.LENGTH_SHORT).show();
            }


            /*Si esta insertem a la casella la foto de la skin del jugador xi li sumem al contador de fitxes d'aquest 1 mes*/
            iv.setImageResource(X.getSkin());
            X.setFitxes(X.getFitxes()+1);

            cambiaTorn();
        }else if(torn.equals("O")){
            if (O.getFitxes()==3){
                Toast.makeText(getApplicationContext(),"TENS 3 FITXES O",Toast.LENGTH_SHORT);
            }

            int drawableID= getResources().getIdentifier("trans","drawable",getPackageName());

            if (drawableID == R.drawable.trans){
                iv.setImageResource(O.getSkin());
                O.setFitxes(O.getFitxes()+1);
            }

            cambiaTorn();
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

    public boolean te3fitxes(){
        boolean t3f=false;
        if (torn.equals("X")){
            if (X.getFitxes()==3){
                t3f= true;
            }else {
                t3f= false;
            }
        }else if(torn.equals("O")){
            if (O.getFitxes()==3){
                t3f= true;
            }else {
                t3f= false;
            }
        }

        return t3f;
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
                if (checkOcupada(huecoC1L1n8)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC1L1n8);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });




        huecoC1L2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC1L2n3)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC1L2n3);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });


        huecoC1L3n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC1L3n4)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC1L3n4);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });





        huecoC2L1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L1n1)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC2L1n1);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });





        huecoC2L2n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L2n5)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC2L2n5);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });



        huecoC2L3n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC2L3n9)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC2L3n9);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });




        huecoC3L1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L1n6)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC3L1n6);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });




        huecoC3L2n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L2n7)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC3L2n7);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });





        huecoC3L3n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkOcupada(huecoC3L3n2)==false){
                    if (te3fitxes()==true){
                        Toast.makeText(getApplicationContext(),"tens 3 fitxes",Toast.LENGTH_SHORT).show();


                    }else{
                        click(huecoC3L3n2);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"OCUPADA,busca una altre",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }


    public int getDrawableId(Drawable drawable) {
        Resources resources = getResources();
        final int id;

        if (drawable == null) {
            id = 0;
        } else {
            String packageName = getPackageName();
            String resourceName = resources.getResourceEntryName(drawable.getConstantState().newDrawable().getChangingConfigurations());
            String resourceType = resources.getResourceTypeName(resources.getIdentifier(resourceName, "drawable", packageName));

            id = resources.getIdentifier(resourceName, resourceType, packageName);
        }

        return id;
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

}