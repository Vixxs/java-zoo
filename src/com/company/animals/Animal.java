package com.company.animals;

public class Animal {


    private String speciesName;
    private String sexe;
    private int weight;
    private int age;
    private boolean hungry;
    private boolean sleep;
    private int health ;// Indicateur sur 100 point

    public Animal(String speciesName, String sexe, int weight, int age) {
        this.speciesName = speciesName;
        this.sexe = sexe;
        this.weight = weight;
        this.age = age;
        this.hungry = false;
        this.sleep = false;
        this.health = 100;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public boolean isSleep() {
        return sleep;
    }

    public int getHealth() {
        return health;
    }

    public void eat(){

    }

    public void roar(){

    }
    public void heal(){

    }

    public void sleep(){
    }


}
