package com.dylan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecoles {

    private String nom;
    private String adresse;
    private List<String> listClasses = new ArrayList<String>();
    private int nbrClasses = 0;
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

    public List<String> voirListeClasse() {
        return listClasses;
    }

    public void combienDeClasses() {
        System.out.println("Vous avez en ce moment : "+nbrClasses+" classe dans l'école "+getNom());
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

    /**
     * Créer une nouvelle classe
     */
    public void creerClasse(){


        Classe c = new Classe();

        //Choix de la classe
        System.out.println("Quel classe voulez-vous créer ? (taper chiffre correspondant)");
        System.out.println("1 - 6ème");
        System.out.println("2 - 5ème");
        System.out.println("3 - 4ème");
        System.out.println("4 - 3ème");
        System.out.println("5 - 2nd");
        System.out.println("6 - 1ère");
        System.out.println("7 - Terminal");
        System.out.println("");

        c.setChoixClasse(scan.nextInt());

        //Intégration du nom de la classe

        switch (c.getChoixClasse()){
            case 1 :
                System.out.println("Vous avez créer une de 6ème");
                c.setNomClasse("6ème");
                break;
            case 2 :
                System.out.println("Vous avez créer une de 5ème");
                c.setNomClasse("5ème");
                break;
            case 3 :
                System.out.println("Vous avez créer une de 4ème");
                c.setNomClasse("4ème");
                break;
            case 4 :
                System.out.println("Vous avez créer une de 3ème");
                c.setNomClasse("3ème");
                break;
            case 5 :
                System.out.println("Vous avez créer une de 2nd");
                c.setNomClasse("2nd");
                break;
            case 6 :
                System.out.println("Vous avez créer une de 1ère");
                c.setNomClasse("1ère");
                break;
            case 7 :
                System.out.println("Vous avez créer une de Terminal");
                c.setNomClasse("Terminal");
                break;
        }

        listClasses.add(c.getNomClasse());//Ajout du nom de la classe dans la list
        nbrClasses++;//Instancier de 1 le nombre de classe
    }


}
