package com.company.classes.animaux;

import com.company.classes.enclos.Enclos;

public abstract class Animal {


    protected String nomEspece;
    protected String nom;
    protected String sexe;
    protected Enclos enclos;
    protected int poid;
    protected int age;
    protected boolean faim;
    protected boolean sommeil;
    protected int vie;// Indicateur sur 100 point

    public Animal(String nomEspece, String nom, String sexe, int poid, int age) {
        this.nomEspece = nomEspece;
        this.nom = nom;
        this.sexe = sexe;
        this.poid = poid;
        this.age = age;
        this.faim = false;
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

    public void infoAnimal(){
        System.out.println("Espece : " + getNomEspece());
        System.out.println("Nom : " + getNom());
        System.out.println("Sexe : " + getSexe());
        System.out.println("Poid : " + getPoid());
        System.out.println("Age : " + getAge());
        System.out.println("Vie : " + getVie());
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

    public boolean isHungry() {
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

        if (faim){
            System.out.println(getNom() + " mange ...");
        }else {
            System.out.println( getNom() + " n'a pas faim");
        }
    }

    public abstract void crier();

    public void soigner(){
        System.out.println(getNom() +" est soigné");
    }

    public void dormir(){
        if (!sommeil){
            System.out.println(getNom() +" s'endort");
            this.sommeil = true;
        }else {
            System.out.println(getNom() + " se réveil");
            this.sommeil = false;
        }
    }

    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
