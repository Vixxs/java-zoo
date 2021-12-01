package com.company.classes.animaux;

import com.company.interfaces.Marin;

public class Baleine extends Mammifere implements Marin {
    public static final String nomEspece = "Baleine";
    public static final int tempGestation = 330 ; // en jours

    public Baleine(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }

    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Mmmmmhh");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }
}
