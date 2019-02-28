package com.dylan;

import java.util.*;

public class Ecoles {

    private String nom;
    private String adresse;
    private List<String> listClasses = new ArrayList<String>();
    private Map<String, String> listEleves = new HashMap<String, String>();
    private int nbrClasses = 0;
    private int nbrEleves = 0;
    private boolean ecoleCreer = false;
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

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getAdresse() {

        return adresse;
    }

    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }

    public List<String> voirListeClasse() {
        return listClasses;
    }

    public boolean isEcoleCreer() {
        return ecoleCreer;
    }

    public void setEcoleCreer(boolean ecoleCreer) {
        this.ecoleCreer = ecoleCreer;
    }

    //Méthodes

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

        if (isEcoleCreer()){

            Classe classe = new Classe();

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

            classe.setChoixClasse(scan.nextInt());

            //Intégration du nom de la classe

            switch (classe.getChoixClasse()){
                case 1 :
                    System.out.println("Vous avez créer une de 6ème");
                    classe.setNomClasse("6ème");
                    break;
                case 2 :
                    System.out.println("Vous avez créer une de 5ème");
                    classe.setNomClasse("5ème");
                    break;
                case 3 :
                    System.out.println("Vous avez créer une de 4ème");
                    classe.setNomClasse("4ème");
                    break;
                case 4 :
                    System.out.println("Vous avez créer une de 3ème");
                    classe.setNomClasse("3ème");
                    break;
                case 5 :
                    System.out.println("Vous avez créer une de 2nd");
                    classe.setNomClasse("2nd");
                    break;
                case 6 :
                    System.out.println("Vous avez créer une de 1ère");
                    classe.setNomClasse("1ère");
                    break;
                case 7 :
                    System.out.println("Vous avez créer une de Terminal");
                    classe.setNomClasse("Terminal");
                    break;
            }

            listClasses.add(classe.getNomClasse());//Ajout du nom de la classe dans la list
            nbrClasses++;//Instancier de 1 le nombre de classe
        } else {
            System.out.println("Vous n'avez pas créer d'école ! Veuillez en créer une !");
        }

    /**
     * Affiche le nombre de classe créer
     */
    public void combienDeClasses() {
        System.out.println("Vous avez en ce moment : "+nbrClasses+" classe dans l'école "+getNom());
    }

    public void creerEleve(){

        Eleve eleve = new Eleve();

        System.out.println("Quel est le nom de votre nouvel élève ?");
        eleve.setNomEleve(scan.nextLine());

        int i;
        System.out.println("Dans quel classe est votre élève ?");
        System.out.println("1 - 6ème");
        System.out.println("2 - 5ème");
        System.out.println("3 - 4ème");
        System.out.println("4 - 3ème");
        System.out.println("5 - 2nd");
        System.out.println("6 - 1ère");
        System.out.println("7 - Terminal");
        System.out.println("");
        i = scan.nextInt();
        switch (i){
            case 1 :
                System.out.println("Vous avez créer une de 6ème");
                eleve.setClasseEleve("6ème");
                break;
            case 2 :
                System.out.println("Vous avez créer une de 5ème");
                eleve.setClasseEleve("5ème");
                break;
            case 3 :
                System.out.println("Vous avez créer une de 4ème");
                eleve.setClasseEleve("4ème");
                break;
            case 4 :
                System.out.println("Vous avez créer une de 3ème");
                eleve.setClasseEleve("3ème");
                break;
            case 5 :
                System.out.println("Vous avez créer une de 2nd");
                eleve.setClasseEleve("2nd");
                break;
            case 6 :
                System.out.println("Vous avez créer une de 1ère");
                eleve.setClasseEleve("1ère");
                break;
            case 7 :
                System.out.println("Vous avez créer une de Terminal");
                eleve.setClasseEleve("Terminal");
                break;
        }
        System.out.println("------------------------------------------");
        System.out.println("Votre élève "+eleve.getNomEleve()+" est bien inscrit dans la classe : "+eleve.getClasseEleve());
        nbrEleves++;
        listEleves.put(eleve.getNomEleve(),eleve.getClasseEleve());

    }



}
