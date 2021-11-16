package com.company.classes.animaux;

public abstract class Mammifere extends Animal {

    public Mammifere(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
    public abstract void mettreBas();
}
