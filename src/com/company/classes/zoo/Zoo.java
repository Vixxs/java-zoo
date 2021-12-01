package com.company.classes.zoo;

import com.company.classes.animaux.Animal;
import com.company.classes.employes.Employe;
import com.company.classes.enclos.Enclos;

import java.util.List;

public class Zoo {
    private String nom;
    private Employe employe;
    private int nombreEnclosMax;
    private List<Enclos> listeEnclos;

    public void afficherNombreAnimaux(){
        int populationTotal = 0;
        for (Enclos enclos : listeEnclos) {
           populationTotal += enclos.getPopulation();
        }
        System.out.println("Il y a " + populationTotal + " animaux dans le zoo");
    }
    public void afficherEnclos(){
        for (Enclos enclos : listeEnclos) {
            enclos.infoEnclos();
        }
    }
    public void run(){

    }
}
