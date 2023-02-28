package com.example.a3xwars2.objetos;

public class Tauler {
    String[][] tauler = new String [3][3];
    int[][] cuadrat_magic= new int [3][3];

    int skin;

    int cont=0;

    public Tauler(int skin) {
        this.skin = skin;
        cuadrat_magic[0][0]=8 ;
        cuadrat_magic[0][1]=1 ;
        cuadrat_magic[0][2]=6 ;

        cuadrat_magic[1][0]=3 ;
        cuadrat_magic[1][1]=5 ;
        cuadrat_magic[1][2]=7 ;

        cuadrat_magic[2][0]=4 ;
        cuadrat_magic[2][1]=9 ;
        cuadrat_magic[2][2]=2 ;
    }

    public boolean comprobarVictoria(){
       return true;
    }


    public String[][] getTauler() {
        return tauler;
    }

    public void setTauler(String[][] tauler) {
        this.tauler = tauler;
    }

    public int[][] getCuadrat_magic() {
        return cuadrat_magic;
    }

    public void setCuadrat_magic(int[][] cuadrat_magic) {
        this.cuadrat_magic = cuadrat_magic;
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
