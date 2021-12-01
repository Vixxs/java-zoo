package com.company.classes.animaux;

import com.company.interfaces.Volant;

public class Aigle extends Ovovivipare implements Volant {
    public static final String nomEspece = "Aigle";
    public static final int tempGestation = 35 ; // en jours

    public Aigle(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }

    @Override
    public void crier() {
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
