package com.dylan;

public class Eleve {
    private String nomEleve;
    private String classeEleve;
    private boolean eleveCreer = false;

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getClasseEleve() {
        return classeEleve;
    }

    public void setClasseEleve(String classeEleve) {
        this.classeEleve = classeEleve;
    }

    public boolean isEleveCreer() {
        return eleveCreer;
    }

    public void setEleveCreer(boolean eleveCreer) {
        this.eleveCreer = eleveCreer;
    }
}
