package com.company.classes.animals;

import com.company.classes.animals.Mammifere;
import com.company.interfaces.Vagabond;

public class Tigre extends Mammifere implements Vagabond {
    public Tigre(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
