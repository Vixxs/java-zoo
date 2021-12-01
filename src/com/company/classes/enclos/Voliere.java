package com.company.classes.enclos;

import com.company.classes.animaux.Animal;
import com.company.interfaces.Vagabond;
import com.company.interfaces.Volant;

public class Voliere extends Enclos {
    private int hauteur;

    public Voliere(String nom, double superficie, int capacite) {
        super(nom, superficie, capacite);
    }

    @Override
    public void ajouterAnimal(Animal... animaux) {
        try{
            for (Animal animal : animaux){
                if (animal instanceof Volant){
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
