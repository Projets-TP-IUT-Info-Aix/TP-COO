package partie2;

import java.time.LocalDate;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Parking monParking = new Parking();
        // On cree des places de parking avec des capacites
        // et des prix aleatoires
        for (int i = 0; i < 100; i++) {
            double capacite = new Random().nextDouble() * 10;
            double cout = new Random().nextDouble() * 25;
            monParking.ajouter(new Place(capacite, cout));
        }
        Vehicule v1,v2,v3,v4;
        v1 = new Vehicule(LocalDate.now(), "PP-989-KK");
        v2 = new Vehicule(LocalDate.of(2017, 3, 11),"BZ-201-CA");
        v3 = new Vehicule(LocalDate.of(2016, 4, 6), "AO-167-DP");
        v4 = new Vehicule(LocalDate.of(2017, 1, 1), "PP-989-KK");

        monParking.garerVehicule(v1,new CritereCapacite());
        monParking.garerVehicule(v2,new CriterePrix());
        monParking.garerVehicule(v3,new CritereCapacite());
        monParking.garerVehicule(v4,new CritereMeilleurRapport(0));

        afficherEtatParking(monParking);
    }
    public static void afficherEtatParking(Parking p){
        for (Vehicule v : p)
            System.out.println(v);
    }
}