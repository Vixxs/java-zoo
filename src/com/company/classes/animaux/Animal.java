package com.company.classes.animaux;

public abstract class Animal {


    private String nomEspece;
    private String sexe;
    private int poid;
    private int age;
    private int faim;
    private boolean sommeil;
    private int vie;// Indicateur sur 100 point

    public Animal(String nomEspece, String sexe, int poid, int age) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poid = poid;
        this.age = age;
        this.faim = 100;
        this.sommeil = false;
        this.vie = 100;
    }

    public String toString() {
        String newLine = System.getProperty("line.separator");
        return "Nom espece : " + this.nomEspece + newLine +
                "Sexe : " + this.sexe + newLine +
                "Poid : " + this.poid + " Kg" + newLine +
                "Age : " + this.age + " ans" + newLine   ;
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
