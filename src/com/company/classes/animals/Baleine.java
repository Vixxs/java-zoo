package com.company.classes.animals;

import com.company.interfaces.Marin;

public class Baleine extends Mammifere implements Marin {
    public Baleine(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
