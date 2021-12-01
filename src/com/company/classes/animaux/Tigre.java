package com.company.classes.animaux;

import com.company.interfaces.Vagabond;

public class Tigre extends Mammifere implements Vagabond {
    public static final String nomEspece = "Tigre";
    public static final int tempGestation = 104 ; // en jours

    public Tigre(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }

    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Roarrrr");
    }

    @Override
    public void vagabonder() {
        System.out.println("Vagabonde");
    }
}
