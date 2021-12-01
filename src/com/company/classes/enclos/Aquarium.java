package com.company.classes.enclos;

import com.company.classes.animaux.Animal;
import com.company.interfaces.Marin;
import com.company.interfaces.Vagabond;
import com.company.interfaces.Volant;

public class Aquarium extends Enclos {
    public Aquarium(String nom, double superficie, int capacite) {
        super(nom, superficie, capacite);
    }

    @Override
    public void ajouterAnimal(Animal... animaux) {
        try{
            for (Animal animal : animaux){
                if (animal instanceof Marin){
                    this.listeAnimaux.add(animal);
                    this.population += 1 ;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
