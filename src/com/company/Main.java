package com.company;

import com.company.classes.employes.Employe;
import com.company.classes.enclos.Enclos;
import com.company.classes.animaux.PoissonRouge;
import com.company.classes.zoo.Zoo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Enclos enclos = new Enclos("Maison",200,20);
        PoissonRouge poissonRouge = new PoissonRouge("Bob","femme",120,12);
        poissonRouge.crier();
        enclos.ajouterAnimal(poissonRouge);

        Employe employe = new Employe("Boris","homme", 21);
        employe.examinerEnclos(enclos);
        List<Enclos> employeList = new ArrayList<>();
        employeList.add(enclos);
        Zoo zoo = new Zoo("Zoo",employe,3,employeList);
        zoo.start();




        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("Zoo");
    }
}
