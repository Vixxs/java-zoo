package com.company;

public enum Proprete {
    MAUVAIS("bad"),CORRECT("ok"),BON("good");
    private String statut;

    public String getStatut() {
        return statut;
    }

    private Proprete(String statut) {
        this.statut = statut;
    }
}
