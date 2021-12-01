package com.company.classes.animaux;

import com.company.interfaces.Vagabond;

public class Ours extends Mammifere implements Vagabond {
    public static final String nomEspece = "Ours";
    public static final int tempGestation = 150 ; // en jours

    public Ours(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }


    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Grrrr !");
    }

    @Override
    public void vagabonder() {
        System.out.println("Vagabonde");
    }
}
