package com.dylan;

import java.util.Scanner;

public class Ecoles {

    private String nom;
    private String adresse;
    Scanner scan = new Scanner(System.in);

    //Constructeur


    public Ecoles() {
    }

    public Ecoles(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }


    //Getters et Setters


    public String getNom() {

        return nom;
    }

    private void setNom(String nom) {

        this.nom = nom;
    }

    public String getAdresse() {

        return adresse;
    }

    private void setAdresse(String adresse) {

        this.adresse = adresse;
    }


    //Méthodes

    /**
     * Créer une nouvelle école
     */
    public void creerEcole(){
        System.out.println("Quel est le nom de votre Ecole ?");
        setNom(scan.nextLine());
        System.out.println("Quel est l'adresse de votre Ecole ?");
        setAdresse(scan.nextLine());
        System.out.println("Votre école : "+getNom()+" a l'adresse : "+getAdresse()+" a bien été créer !");
    }

    /**
     * Affiche les détails de votre écoles
     */
    public void voirEcoles(){
        System.out.println("Votre école "+getNom()+", se trouve a l'adresse suivante : "+getAdresse());
    }


}
