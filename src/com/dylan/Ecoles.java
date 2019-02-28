package com.dylan;

import java.util.*;

public class Ecoles {

    private String nomEcole = "Inconnu";
    private String adresse = "Quelque part";

    private Map<String, String> listEcoles = new HashMap<String, String>();
    private List<String> listClasses = new ArrayList<String>();
    private Map<String, String> listEleves = new HashMap<String, String>();

    private int nbrClasses = 0;
    private int nbrEleves = 0;
    private boolean ecoleCreer = false;
    private boolean classeCreer = false;
    int choixMenu;

    Scanner scan = new Scanner(System.in);

    //Constructeur


    public Ecoles() {
    }


    //Getters et Setters


    public String getNomEcole() {

        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    public String getAdresse() {

        return adresse;
    }

    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }


    public boolean isEcoleCreer() {
        return ecoleCreer;
    }

    public void setEcoleCreer(boolean ecoleCreer) {
        this.ecoleCreer = ecoleCreer;
    }

    public boolean isClasseCreer() {
        return classeCreer;
    }

    public void setClasseCreer(boolean classeCreer) {
        this.classeCreer = classeCreer;
    }

    //Méthodes


    public void Menu(){

        //Menu de départ a faire au moins une fois
        do {

            System.out.println("BIENVENUE ! Que voulez-vous faire ? (taper numéro correspondant)");
            System.out.println("1 - Créer une école");
            System.out.println("2 - Créer une classe");
            System.out.println("3 - Enregistrer un élève");
            System.out.println("4 - Quitter");
            System.out.println("----------------------------------------------------------------");
            choixMenu=scan.nextInt();


            switch (choixMenu){

                case 1 :
                    modifierEcole();
                    break;

                case 2 :
                    creerClasse();
                    break;

                case 3:
                    creerEleve();
                    break;
            }

        } while (choixMenu != 4);


    }

    /**
     * Créer une nouvelle école
     */
    public void modifierEcole(){
        System.out.println("Quel est le nom de votre Ecole ?");
        System.out.println();
        setNomEcole(scan.nextLine());
        System.out.println();
        System.out.println("Quel est l'adresse de votre Ecole ?");
        System.out.println();
        setAdresse(scan.nextLine());
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Votre école : "+getNomEcole()+" a l'adresse : "+getAdresse()+" a bien été créer !");
        listEcoles.put(getNomEcole(),getAdresse());
        setEcoleCreer(true);
    }


    /**
     * Créer une nouvelle classe
     */
    public void creerClasse() {

        if (isEcoleCreer() == true) {

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

            switch (classe.getChoixClasse()) {
                case 1:
                    System.out.println("Vous avez créer une de 6ème");
                    classe.setNomClasse("6ème");
                    break;
                case 2:
                    System.out.println("Vous avez créer une de 5ème");
                    classe.setNomClasse("5ème");
                    break;
                case 3:
                    System.out.println("Vous avez créer une de 4ème");
                    classe.setNomClasse("4ème");
                    break;
                case 4:
                    System.out.println("Vous avez créer une de 3ème");
                    classe.setNomClasse("3ème");
                    break;
                case 5:
                    System.out.println("Vous avez créer une de 2nd");
                    classe.setNomClasse("2nd");
                    break;
                case 6:
                    System.out.println("Vous avez créer une de 1ère");
                    classe.setNomClasse("1ère");
                    break;
                case 7:
                    System.out.println("Vous avez créer une de Terminal");
                    classe.setNomClasse("Terminal");
                    break;
            }

            listClasses.add(classe.getNomClasse());//Ajout du nom de la classe dans la list
            nbrClasses++;//Instancier de 1 le nombre de classe
            setClasseCreer(true);
        } else if (isEcoleCreer()==false){
            System.out.println("Vous n'avez pas créer d'école ! Veuillez en créer une !");
            System.out.println("----------------------------------------------------------------");
        }

    }



    public void creerEleve() {

        if (isEcoleCreer() == true && isClasseCreer() == true) {


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
            switch (i) {
                case 1:
                    System.out.println("Vous avez créer une de 6ème");
                    eleve.setClasseEleve("6ème");
                    break;
                case 2:
                    System.out.println("Vous avez créer une de 5ème");
                    eleve.setClasseEleve("5ème");
                    break;
                case 3:
                    System.out.println("Vous avez créer une de 4ème");
                    eleve.setClasseEleve("4ème");
                    break;
                case 4:
                    System.out.println("Vous avez créer une de 3ème");
                    eleve.setClasseEleve("3ème");
                    break;
                case 5:
                    System.out.println("Vous avez créer une de 2nd");
                    eleve.setClasseEleve("2nd");
                    break;
                case 6:
                    System.out.println("Vous avez créer une de 1ère");
                    eleve.setClasseEleve("1ère");
                    break;
                case 7:
                    System.out.println("Vous avez créer une de Terminal");
                    eleve.setClasseEleve("Terminal");
                    break;
            }
            System.out.println("------------------------------------------");
            System.out.println("Votre élève " + eleve.getNomEleve() + " est bien inscrit dans la classe : " + eleve.getClasseEleve());
            nbrEleves++;
            listEleves.put(eleve.getNomEleve(), eleve.getClasseEleve());

        } else if (isEcoleCreer() == true && isClasseCreer() == false){
            System.out.println("Vous avez créer une école mais pas de classe !(Veuillez en créer une)");
            System.out.println("----------------------------------------------------------------");
        }else if (isClasseCreer() == false && isEcoleCreer() == false){
            System.out.println("Vous n'avez ni d'école ni de classe de créer ! (Veuillez en créer !)");
            System.out.println("----------------------------------------------------------------");
        }
    }

    /**
     * Affiche les détails de votre écoles
     */
    public void voirEcoles(){
        System.out.println("Votre école "+getNomEcole()+", se trouve a l'adresse suivante : "+getAdresse());
    }

    /**
     * Affiche le nombre de classe créer
     */
    public void combienDeClasses(){
        System.out.println("Vous avez en ce moment : "+nbrClasses+" classe dans l'école "+getNomEcole());
    }



}
