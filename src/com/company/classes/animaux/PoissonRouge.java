package com.company.classes.animaux;

import com.company.interfaces.Marin;

public class PoissonRouge extends Ovovivipare implements Marin {
    public static final String nomEspece = "PoissonRouge";
    public static final int tempGestation = 4 ; // en jours

    public PoissonRouge(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }


    @Override
    public void pondre() {
        System.out.println("Pond un oeuf de " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Blblblbl");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }
}
