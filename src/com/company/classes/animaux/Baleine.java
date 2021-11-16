package com.company.classes.animaux;

import com.company.interfaces.Marin;

public class Baleine extends Mammifere implements Marin {
    public static final String nomEspece = "Baleine";
    public static final int tempGestation = 330 ; // en jours
    public Baleine(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void rugir() {
        System.out.println("Mmmmmhh");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }
}
