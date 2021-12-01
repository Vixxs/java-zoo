package com.company.classes.enclos;

import com.company.classes.Proprete;
import com.company.classes.animaux.Animal;
import com.company.interfaces.Vagabond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Enclos {
    protected String nom;
    protected double superficie;
    protected int capacite;
    protected int population;
    protected Proprete proprete ;
    protected List<Animal> listeAnimaux;


    public Enclos(String nom, double superficie, int capacite) {
        this.nom = nom;
        this.superficie = superficie;
        this.capacite = capacite;
        this.population = 0 ;
        this.listeAnimaux = new ArrayList<>();
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

    public void ajouterAnimal(Animal...animaux) {
        try{
            for (Animal animal : animaux){
                if (animal instanceof Vagabond){
                    this.listeAnimaux.add(animal);
                    animal.setEnclos(this);
                    this.population += 1 ;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void supprimerAnimal(Animal...animaux) {
        for (Animal animal : animaux){
            this.listeAnimaux.remove(animal);
            animal.setEnclos(null);
            this.population -= 1 ;
        }
    }

    public boolean nettoyerEnclos() {
        if (this.population == 0 && this.proprete == Proprete.MAUVAIS){
            this.proprete = Proprete.BON;
            return true;
        }
        return false;
    }

    public void nourrirAnimaux() {
        System.out.println("Nourris les animaux");
        for (Animal animal: this.listeAnimaux) {
            animal.manger();
        }
    }

    public void infoEnclos(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Capacité : " +this.capacite);
        System.out.println("Population : " +this.population);
        System.out.println("Superficie : " +this.superficie);
        System.out.println("Animaux : " +this.listeAnimaux);
    }

    @Override
    public String toString() {
        return "Enclos{" +
                "nom='" + nom + '\'' +
                ", superficie=" + superficie +
                ", capacite=" + capacite +
                ", population=" + population +
                ", proprete=" + proprete +
                ", listeAnimaux=" + listeAnimaux +
                '}';
    }
}