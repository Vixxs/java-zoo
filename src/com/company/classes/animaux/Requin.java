package com.company.classes.animaux;

import com.company.interfaces.Marin;

public class Requin extends Ovovivipare implements Marin {
    public static final String nomEspece = "Requin";
    public static final int tempGestation = 300 ; // en jours

    public Requin(String nom, String sexe, int poid, int age) {
        super(nomEspece, nom, sexe, poid, age);
    }

    @Override
    public void pondre() {
        System.out.println("Pond un oeuf de " + nomEspece);
    }

    @Override
    public void crier() {
        System.out.println("Shrrrr");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }
}
