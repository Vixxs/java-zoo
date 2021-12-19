package com.company.classes.enclos;

import com.company.classes.Proprete;
import com.company.classes.animaux.Animal;
import com.company.interfaces.Vagabond;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.clearScreen;

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
        if (this.proprete == Proprete.MAUVAIS){
            System.out.println(getNom() + " est tout propre !");
            this.proprete = Proprete.BON;
            return true;
        }
        System.out.println(getNom() + " n'est pas sale");
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

    public Animal afficherAnimaux() {
        Scanner scanner = new Scanner(System.in);

        int index = 1;
        System.out.println("Choissisez un animal");
        for (Animal animal : listeAnimaux){
            System.out.println(index + " - " + animal.getNom());
            ++index ;
        }
        int tmp = scanner.nextInt();
        return listeAnimaux.get(tmp - 1);

    }

    public void setProprete(Proprete proprete) {
        this.proprete = proprete;
    }
}
