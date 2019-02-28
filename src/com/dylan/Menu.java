package com.dylan;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    char choix;
    Scanner scan = new Scanner(System.in);
    private Map<String, String> listEcoles = new HashMap<String, String>();

    public void runMenu(){
        do {

            System.out.println("BIENVENUE ! Que voulez-vous faire ? (taper numéro correspondant)");
            System.out.println("1 - Créer une école");
            System.out.println("2 - Créer une classe");
            System.out.println("3 - Enregistrer un élève");
            System.out.println("Q - Quitter");
            choix=scan.nextLine().charAt(0);

        } while (choix != 'Q');


    }

    /**
     * Créer une nouvelle école
     */
    public void creerEcole(){
        Ecoles ecole = new Ecoles();
        System.out.println("Quel est le nom de votre Ecole ?");
        ecole.setNom(scan.nextLine());
        System.out.println("Quel est l'adresse de votre Ecole ?");
        ecole.setAdresse(scan.nextLine());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Votre école : "+ecole.getNom()+" a l'adresse : "+ecole.getAdresse()+" a bien été créer !");
        listEcoles.put(ecole.getNom(),ecole.getAdresse());
        ecole.setEcoleCreer(true);
    }
}
