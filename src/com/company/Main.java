//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import com.company.classes.animaux.*;
import com.company.classes.employes.Employe;
import com.company.classes.enclos.Aquarium;
import com.company.classes.enclos.Enclos;
import com.company.classes.enclos.Voliere;
import com.company.classes.zoo.Zoo;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    private Zoo zoo ;
    private Employe employe;

    public Main() {
    }

    public void action(){
        clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue "+ this.employe.getNom());
        this.zoo.afficherNombreAnimaux();
        int tmp = 0;
        while (tmp != 1 && tmp != 2 &&  tmp != 3 ){
            System.out.println("Quel enclos voulez vous voir ?");
            zoo.afficherEnclos();
            tmp = scanner.nextInt();
        }
        List<Enclos> listEnclos = zoo.getListeEnclos();
        Enclos enclos = listEnclos.get(tmp - 1);
        clearScreen();
        actionEnclos(enclos);
    }

    public void actionAnimal(Animal animal){
        Scanner scanner = new Scanner(System.in);

        System.out.println(animal.getNom());
        System.out.println("0 - Retour");
        System.out.println("1 - Carreser");
        System.out.println("2 - Endormir");
        System.out.println("3 - Soigner");
        System.out.println("4 - Informations");
        int tmp = scanner.nextInt();
        switch (tmp){
            case 0:
                action();
            case 1:
                clearScreen();
                animal.crier();
                actionAnimal(animal);
                break;
            case 2:
                clearScreen();
                animal.dormir();
                actionAnimal(animal);
                break;
            case 3:
                clearScreen();
                animal.soigner();
                actionAnimal(animal);
                break;
            case 4:
                clearScreen();
                animal.infoAnimal();
                actionAnimal(animal);
                break;
            default:
                clearScreen();
                actionAnimal(animal);
                break;
        }
    }

    public void actionEnclos(Enclos enclos){
        Scanner scanner = new Scanner(System.in);

        System.out.println(enclos.getNom());
        System.out.println("0 - Retour");
        System.out.println("1 - Examiner l'enclos");
        System.out.println("2 - Nettoyer l'enclos");
        System.out.println("3 - Nourrir les animaux");
        System.out.println("4 - Liste des animaux");
        int tmp = scanner.nextInt();
        switch (tmp) {
            case 0 -> action();
            case 1 -> {
                clearScreen();
                this.employe.examinerEnclos(enclos);
                actionEnclos(enclos);
            }
            case 2 -> {
                clearScreen();
                this.employe.nettoyerEnclos(enclos);
                actionEnclos(enclos);
            }
            case 3 -> {
                clearScreen();
                this.employe.nourrirAnimaux(enclos);
                actionEnclos(enclos);
            }
            case 4 -> {
                clearScreen();
                Animal animal = enclos.afficherAnimaux();
                clearScreen();
                actionAnimal(animal);
            }
            default ->{
                clearScreen();
                actionEnclos(enclos);
            }
        }
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("--------------");
        System.out.println("░M░Y░ ░Z░O░O░");
        System.out.println("--------------");
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        clearScreen();

        System.out.println("Entrez les informations demandées");
        System.out.println("Votre nom :");
        String nomEmploye = scanner.nextLine();

        this.employe = new Employe(nomEmploye,"homme",20);

        Enclos enclos = new Enclos("Enclos",200,5);
        enclos.ajouterAnimal(new Tigre("Tigrou","homme",43,5),new Ours("Bouba","femme",70,13),new Loup("Graou","homme",40,8));
        Aquarium aquarium = new Aquarium("Aquarium",100,3);
        aquarium.ajouterAnimal(new PoissonRouge("Boris","femme",1,1),new Requin("Sharky","homme",13,13),new Baleine("Laboon","femme",120,30));
        Voliere voliere = new Voliere("Voliere",50,2);
        voliere.ajouterAnimal(new Aigle("Aigle","homme",10,5),new Pingouin("Pingu","femme",5,3));
        List<Enclos> listeEnclos = new ArrayList<>();
        listeEnclos.add(enclos);
        listeEnclos.add(aquarium);
        listeEnclos.add(voliere);

        this.zoo = new Zoo("MyZoo",employe,3,listeEnclos);
        this.zoo.start();

        action();

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
