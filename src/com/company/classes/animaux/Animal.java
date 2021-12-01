package com.company.classes.animaux;

import com.company.classes.enclos.Enclos;

public abstract class Animal {


    protected String nomEspece;
    protected String nom;
    protected String sexe;
    protected Enclos enclos;
    protected int poid;
    protected int age;
    protected int faim;
    protected boolean sommeil;
    protected int vie;// Indicateur sur 100 point

    public Animal(String nomEspece, String nom, String sexe, int poid, int age) {
        this.nomEspece = nomEspece;
        this.nom = nom;
        this.sexe = sexe;
        this.poid = poid;
        this.age = age;
        this.faim = 100;
        this.sommeil = false;
        this.vie = 100;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nomEspece='" + nomEspece + '\'' +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", poid=" + poid +
                ", age=" + age +
                '}';
    }

    public String getNomEspece() {
        return nomEspece;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getPoid() {
        return poid;
    }

    public int getAge() {
        return age;
    }

    public int isHungry() {
        return faim;
    }

    public boolean isSleep() {
        return sommeil;
    }

    public int getVie() {
        return vie;
    }

    public Enclos getEnclos() {
        return enclos;
    }

    public void setEnclos(Enclos enclos) {
        this.enclos = enclos;
    }

    public void manger(){

        if (!sommeil){
            System.out.println("Mange...");
        }else {
            System.out.println("Ne peut pas manger maintenant");
        }
    }

    public abstract void crier();

    public void soigner(){
        System.out.println("Soigné");
    }

    public void dormir(){
        if (!sommeil){
            System.out.println("S'endort");
            this.sommeil = true;
        }else {
            System.out.println("Se réveil");
            this.sommeil = false;
        }
    }


}
