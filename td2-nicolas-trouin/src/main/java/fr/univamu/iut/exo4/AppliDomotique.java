package fr.univamu.iut.exo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static String menu() {
        String choix = "";
        System.out.println("Taper le nom de l'objet à créer (Radio, Cafetiere, Radiateur)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = in.readLine();
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void connecter(String type) {
        FabriqueAbstraiteConnectable fabrique = new FabriqueSony();
        Connectable objet = null;
        try {
            objet = fabrique.creer(type);
            objet.equiper("wololo");
            objets.add(objet);
        } catch (ClassNotFoundException e) {
            System.out.println(type + " n'est pas pris en compte");
        }
    }

    public static void activer(Demarreur demarreur){
        for (Connectable objet : objets){
            String choix = "";
            while (!choix.equals("y") && !choix.equals("n")) {
                System.out.println("L'objet " + objet.getClass().getSimpleName() + " doit-il être activé ? (y/n)");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                try {
                    choix = in.readLine();
                } catch (IOException e) {
                    System.out.println("Problème de saisie");
                }
                if(!choix.equals("y") && !choix.equals("n")){
                    System.out.println("Erreur de saisie");
                }
            }

            switch (choix.toLowerCase()){
                case "y":
                    demarreur.attacher(objet);
                    System.out.println("Objet " + objet.getClass().getSimpleName() + " activé");
                    break;
                default:
                    break;

            }
        }
    }

    public static void desactiver(Demarreur demarreur){
        /*
        for (Connectable objet : demarreur.getMesObjetsActives()){
            String choix = "";
            while (!choix.equals("y") && !choix.equals("n")) {
                System.out.println("L'objet " + objet.getClass().getSimpleName() + " doit-il être désactivé ? (y/n)");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                try {
                    choix = in.readLine();
                } catch (IOException e) {
                    System.out.println("Problème de saisie");
                }
                if(!choix.equals("y") && !choix.equals("n")){
                    System.out.println("Erreur de saisie");
                }
            }

            switch (choix.toLowerCase()){
                case "y":
                    demarreur.detacher(objet);
                    System.out.println("Objet " + objet.getClass().getSimpleName() + " désactivé");
                    break;
                default:
                    break;

            }
        }
         */
        Iterator<Connectable> iterator = demarreur.getMesObjetsActives().iterator();
        Connectable objet = iterator.next();
        while (iterator.hasNext()){
            String choix = "";
            while (!choix.equals("y") && !choix.equals("n")) {
                System.out.println("L'objet " + objet.getClass().getSimpleName() + " doit-il être désactivé ? (y/n)");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                try {
                    choix = in.readLine();
                } catch (IOException e) {
                    System.out.println("Problème de saisie");
                }
                if(!choix.equals("y") && !choix.equals("n")){
                    System.out.println("Erreur de saisie");
                }
            }

            switch (choix.toLowerCase()){
                case "y":
                    iterator.remove();
                    System.out.println("Objet " + objet.getClass().getSimpleName() + " désactivé");
                    break;
                default:
                    break;

            }
            objet = iterator.next();
        }
    }

    public static void main(String[] args) {


        // Création et impression d'une imprimante locale scanner
        Imprimante i1 = new ImprimanteLocale();
        i1 = new Scanner(i1);
        i1.imprimer();
        // Création et impression d'une imprimante réseau fax et photocopieur
        Imprimante i2 = new ImprimanteReseau();
        i2 = new Fax(i2);
        i2 = new Photocopieur(i2);
        i2.imprimer();

        String type = "0";
        type = menu();
        while (!type.equals("0")) {
            connecter(type);
            type = menu();
        }
        System.out.println(objets);

        Demarreur demarreur = new Demarreur();

        activer(demarreur);
        demarreur.demarrerLesActives();

        desactiver(demarreur);
        demarreur.demarrerLesActives();
    }
}
