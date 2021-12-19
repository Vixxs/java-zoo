package com.company.classes.employes;

import com.company.classes.animaux.Animal;
import com.company.classes.enclos.Enclos;

public class Employe {
    protected String nom;
    protected String sexe;
    protected int age;

    public Employe(String name, String sexe, int age) {
        this.nom = name;
        this.sexe = sexe;
        this.age = age;
    }
    public void examinerEnclos(Enclos enclos){
        enclos.infoEnclos();
    }
    public void nettoyerEnclos(Enclos enclos){
        enclos.nettoyerEnclos();
        System.out.println();
    }
    public void nourrirAnimaux(Enclos enclos){
        enclos.nourrirAnimaux();
    }
    public void transfererAnimal(Animal animal, Enclos enclos){
        Enclos tmpEnclos = animal.getEnclos();
        tmpEnclos.supprimerAnimal(animal);
        enclos.ajouterAnimal(animal);
        System.out.println(animal.getNom() + " à bien été transferé");
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNom() {
        return nom;
    }
}
