package com.company.classes.animaux;

import com.company.interfaces.Volant;

public class Aigle extends Ovovivipare implements Volant {
    public static final String nomEspece = "Aigle";
    public static final int tempGestation = 35 ; // en jours
    public Aigle(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void rugir() {
        System.out.println("Cui cui");
    }

    @Override
    public void voler() {
        System.out.println("Vole");
    }

    @Override
    public void pondre() {
        System.out.println("Pond un oeuf de " + nomEspece);
    }
}
