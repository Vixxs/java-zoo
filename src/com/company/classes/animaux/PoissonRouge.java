package com.company.classes.animaux;

import com.company.interfaces.Marin;

public class PoissonRouge extends Ovovivipare implements Marin {
    public static final String nomEspece = "PoissonRouge";
    public static final int tempGestation = 4 ; // en jours
    public PoissonRouge(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void pondre() {
        System.out.println("Pond un oeuf de " + nomEspece);
    }

    @Override
    public void rugir() {
        System.out.println("Blblblbl");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }
}
