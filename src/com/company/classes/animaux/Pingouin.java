package com.company.classes.animaux;

import com.company.interfaces.Marin;
import com.company.interfaces.Vagabond;
import com.company.interfaces.Volant;

public class Pingouin extends Ovovivipare implements Volant, Vagabond, Marin {
    public static final String nomEspece = "Pingouin";
    public static final int tempGestation = 35 ; // en jours
    public Pingouin(String sexe, int weight, int age) {
        super(nomEspece, sexe, weight, age);
    }

    @Override
    public void pondre() {
        System.out.println("Pond un oeuf de " + nomEspece);
    }

    @Override
    public void rugir() {
        System.out.println("Cui cui");
    }

    @Override
    public void nager() {
        System.out.println("Nage");
    }

    @Override
    public void vagabonder() {
        System.out.println("Vagabonde");
    }

    @Override
    public void voler() {
        System.out.println("Vole");
    }
}
