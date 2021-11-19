package com.company.classes;

import com.company.classes.animaux.Animal;

import java.util.List;

public class Enclos {
    private String nom;
    private double superficie;
    private int capacite;
    private int population;
    private Proprete proprete ;
    private List<Animal> listeAnimaux;


    public Enclos(String nom, double superficie, int capacite, int population) {
        this.nom = nom;
        this.superficie = superficie;
        this.capacite = capacite;
        this.population = population;
        this.proprete = Proprete.BON;
    }


    public List<Animal> getListeAnimaux() {
        return this.listeAnimaux;
    }

    public String getNom() {
        return nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getPopulation() {
        return population;
    }

    public void ajouterAnimal(Animal animal) {
        this.listeAnimaux.add(animal);
        this.population += 1 ;
    }

    public void supprimerAnimal(Animal animal) {
        this.listeAnimaux.remove(animal);
        this.population -= 1 ;
    }

    public Proprete nettoyerEnclos() {
        if (this.population == 0 && this.proprete == Proprete.MAUVAIS){
            this.proprete = Proprete.BON;
        }
        return Proprete.BON;
    }

    public void nourrirAnimaux() {
        for (Animal animal: this.listeAnimaux) {
            animal.manger();
        }
    }
}
