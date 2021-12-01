package com.company.classes.animaux;

public abstract class Ovovivipare extends Animal {

    public Ovovivipare(String nomEspece, String nom, String sexe, int poid, int age) {
        super(nomEspece,nom, sexe, poid, age);
    }
    public abstract void pondre();
}
