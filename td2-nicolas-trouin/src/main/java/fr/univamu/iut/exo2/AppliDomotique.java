package fr.univamu.iut.exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

    public static void main(String[] args) {
        String type = "0";
        type = menu();
        while (!type.equals("0")) {
            connecter(type);
            type = menu();
        }
        System.out.println(objets);
    }
}
