package com.company.classes.animals;

import com.company.classes.animals.Ovovivipare;
import com.company.interfaces.Marin;
import com.company.interfaces.Vagabond;
import com.company.interfaces.Volant;

public class Pingouin extends Ovovivipare implements Volant, Vagabond, Marin {
    public Pingouin(String speciesName, String sexe, int weight, int age) {
        super(speciesName, sexe, weight, age);
    }
}
