package com.company.classes.animals;

public abstract class Animal {


    private String nomEspece;
    private String sexe;
    private int poid;
    private int age;
    private int faim;
    private boolean sommeil;
    private int vie;// Indicateur sur 100 point

    public Animal(String speciesName, String sexe, int weight, int age) {
        this.nomEspece = speciesName;
        this.sexe = sexe;
        this.poid = weight;
        this.age = age;
        this.faim = 100;
        this.sommeil = 100;
        this.vie = 100;
    }

    public String getNomEspece() {
        return nomEspece;
    }

    public void setNomEspece(String nomEspece) {
        this.nomEspece = nomEspece;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void eat(){

        if (!sommeil){
            System.out.println("Mange...");
        }else {
            System.out.println("Ne peut pas manger maintenant");
        }
    }

    public void roar(){
        System.out.println("Roarr !");
    }
    public void heal(){
        System.out.println("Soigné");
    }

    public void sleep(){
        if (!sommeil){
            System.out.println("S'endort");
            this.sommeil = true;
        }else {
            System.out.println("Se réveil");
            this.sommeil = false;
        }
    }


}
