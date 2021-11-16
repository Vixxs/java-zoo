package com.company.classes.animals;

import com.company.interfaces.Vagabond;

public class Loup extends Mammifere implements Vagabond {
    public Loup(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
