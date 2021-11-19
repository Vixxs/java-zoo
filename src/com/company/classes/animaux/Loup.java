package com.company.classes.animaux;

import com.company.interfaces.Vagabond;

public class Loup extends Mammifere implements Vagabond {
    public static final String nomEspece = "Loup";
    public static final int tempGestation = 60 ; // en jours
    public Loup(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void mettreBas() {
        System.out.println("Donne naissance à " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Aouuuuuhh");
    }

    @Override
    public void vagabonder() {
        System.out.println("Vagabonde");
    }
}
