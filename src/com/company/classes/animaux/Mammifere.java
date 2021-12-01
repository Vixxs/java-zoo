package com.company.classes.animaux;

public abstract class Mammifere extends Animal {

    public Mammifere(String nomEspece, String nom, String sexe, int poid, int age) {
        super(nomEspece,nom, sexe, poid, age);
    }
    public abstract void mettreBas();
}
