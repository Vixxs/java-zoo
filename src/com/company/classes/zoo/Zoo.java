package com.company.classes.zoo;

import com.company.classes.Proprete;
import com.company.classes.animaux.Animal;
import com.company.classes.employes.Employe;
import com.company.classes.enclos.Enclos;
import com.sun.tools.jconsole.JConsoleContext;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Random;
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
        int index = 1;
        for (Enclos enclos : listeEnclos) {
            System.out.println(index + " - "+ enclos.getNom());
            ++index;
        }
    }

    public void modifEtatAnimaux(){
        for (Enclos enclos : listeEnclos) {
            List<Animal> animaux = enclos.getListeAnimaux();
            for (Animal animal: animaux) {
                int min = 1;
                int max = 3;

                Random random = new Random();

                int value = random.nextInt(max + min) + min;

                switch (value){
                    case 1:
                        animal.dormir();
                        break;
                    case 2:
                        animal.setFaim(true);
                        break;
                    case 3:
                        break;
                }
                System.out.println(animal.toString());
            }
        }
    }

    public List<Enclos> getListeEnclos() {
        return listeEnclos;
    }

    public void start() {
        Runnable runnable = () -> {
            int min = 1;
            int max = listeEnclos.size();

            Random random = new Random();

            int value = random.nextInt(max + min) + min;

            Enclos enclos = listeEnclos.get(value-1);

            List<Animal> listeAnimaux = enclos.getListeAnimaux();
            Random random2 = new Random();
            int value2 = random2.nextInt(listeAnimaux.size() + 1) + 1;

            Animal animal = listeAnimaux.get(value2-1);
            animal.dormir();

            System.out.println(animal.getNom() + " est tombé malade");
            animal.setVie(50);

            System.out.println(enclos.getNom() + " est sale");
            enclos.setProprete(Proprete.MAUVAIS);

        };
        ScheduledExecutorService service = Executors
                .newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable, 0, 30, TimeUnit.SECONDS);
    }

}

