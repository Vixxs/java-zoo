package com.company.classes.zoo;

import com.company.classes.animaux.Animal;
import com.company.classes.employes.Employe;
import com.company.classes.enclos.Enclos;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Zoo{
    private String nom;
    private Employe employe;
    private int nombreEnclosMax;
    private List<Enclos> listeEnclos;

    public Zoo(String nom, Employe employe, int nombreEnclosMax, List<Enclos> listeEnclos) {
        this.nom = nom;
        this.employe = employe;
        this.nombreEnclosMax = nombreEnclosMax;
        this.listeEnclos = listeEnclos;
    }

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

    public void start() {
        Runnable runnable = new Runnable() {
            public void run() {
                // task to run goes here
                System.out.println("Hello !!");
            }
        };
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 10, TimeUnit.SECONDS);
    }
}
