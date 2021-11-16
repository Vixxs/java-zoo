package com.company.classes.animaux;

public abstract class Ovovivipare extends Animal {
    public Ovovivipare(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
    public abstract void pondre();
}
