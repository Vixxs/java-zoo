package com.company.classes.animals;

import com.company.interfaces.Volant;

public class Aigle extends Ovovivipare implements Volant {
    public Aigle(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
