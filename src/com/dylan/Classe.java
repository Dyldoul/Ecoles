package com.dylan;


public class Classe{

    private String nomClasse;
    private int choixClasse;
    private boolean classeCreer = false;

    public Classe() {
    }

    public String getNomClasse() {

        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {

        this.nomClasse = nomClasse;
    }


    public void setChoixClasse(int choixClasse) {
        this.choixClasse = choixClasse;
    }

    public int getChoixClasse() {
        return choixClasse;
    }

    public boolean isClasseCreer() {
        return classeCreer;
    }

    public void setClasseCreer(boolean classeCreer) {
        this.classeCreer = classeCreer;
    }
}

