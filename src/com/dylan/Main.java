package com.dylan;

public class Main {

    public static void main(String[] args) {

        Ecoles e = new Ecoles();
        e.creerEcole();
        System.out.println("---------------------------------");
        e.voirEcoles();
        System.out.println("---------------------------------");
        e.creerClasse();
        System.out.println("---------------------------------");
        e.combienDeClasses();

    }
}
