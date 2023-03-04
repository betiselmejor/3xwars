package com.example.a3xwars2.objetos;

public class Skin {
    int skin;

    String nom;

    //////////////////////////////////////////////////////////////


    public Skin(int skin, String nom) {
        this.skin = skin;
        this.nom = nom;
    }

    public Skin() {
    }

    ///////////////////////////////////////////////////////////////


    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
