package com.company.classes.animals;

import com.company.classes.animals.Mammifere;
import com.company.interfaces.Vagabond;

public class Ours extends Mammifere implements Vagabond {
    public Ours(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
