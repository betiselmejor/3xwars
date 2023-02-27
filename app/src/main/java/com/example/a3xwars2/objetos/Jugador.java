package com.example.a3xwars2.objetos;

import android.widget.ImageView;

public class Jugador {
    int fitxes;

    int skin;

    String fitxa;

    int [][]fitxes_col=new int[3][3];

    int fitxa1v=0;
    int fitxa2v=0;
    int fitxa3v=0;


    //////////////////////////////////////////////////////////////////////////////////////

    public int valorTOTAL(){
        return fitxa1v+fitxa2v+fitxa3v;
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public Jugador(int skin) {
        this.skin = skin;
    }

    public Jugador(String fitxa) {
        this.fitxa = fitxa;
    }

    public Jugador() {
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public int getFitxes() {
        return fitxes;
    }

    public void setFitxes(int fitxes) {
        this.fitxes = fitxes;
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int[][] getFitxes_col() {
        return fitxes_col;
    }

    public void setFitxes_col(int[][] fitxes_col) {
        this.fitxes_col = fitxes_col;
    }

    public int getFitxa1v() {
        return fitxa1v;
    }

    public void setFitxa1v(int fitxa1v) {
        this.fitxa1v = fitxa1v;
    }

    public int getFitxa2v() {
        return fitxa2v;
    }

    public void setFitxa2v(int fitxa2v) {
        this.fitxa2v = fitxa2v;
    }

    public int getFitxa3v() {
        return fitxa3v;
    }

    public void setFitxa3v(int fitxa3v) {
        this.fitxa3v = fitxa3v;
    }

    //////////////////////////////////////////////////////////////////////////////////////
}
