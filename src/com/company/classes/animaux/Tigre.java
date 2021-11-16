package com.company.classes.animaux;

import com.company.interfaces.Vagabond;

public class Tigre extends Mammifere implements Vagabond {
    public static final String nomEspece = "Tigre";
    public static final int tempGestation = 104 ; // en jours
    public Tigre(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void rugir() {
        System.out.println("Roarrrr");
    }

    @Override
    public void vagabonder() {
        System.out.println("Vagabonde");
    }
}
