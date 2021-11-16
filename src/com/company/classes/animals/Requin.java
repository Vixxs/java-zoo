package com.company.classes.animals;

import com.company.interfaces.Marin;

public class Requin extends Ovovivipare implements Marin {
    public Requin(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
