package com.company;

import com.company.classes.employes.Employe;
import com.company.classes.enclos.Enclos;
import com.company.classes.animaux.PoissonRouge;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Enclos enclos = new Enclos("Maison",200,20);
        PoissonRouge poissonRouge = new PoissonRouge("Bob","femme",120,12);
        poissonRouge.crier();
        enclos.ajouterAnimal(poissonRouge);

        Employe employe = new Employe("Boris","homme", 21);
        employe.examinerEnclos(enclos);




        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Zoo");
    }
}
