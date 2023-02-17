package com.example.a3xwars2.objetos;

import com.example.a3xwars2.R;

import java.net.URI;

public class Usuario {
    public String nom;

    public int fotoo= (R.drawable.iconoperfil);

    public Usuario(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFotoo() {
        return fotoo;
    }

    public void setFotoo(int fotoo) {
        this.fotoo = fotoo;
    }
}
