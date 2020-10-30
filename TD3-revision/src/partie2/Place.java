package partie2;

public class Place {
    private Vehicule vehiculeGare;
    private boolean estLibre = true;
    private double coutJour;
    private double capacite;
    public Place(double cp, double cj) {
        capacite = cp;
        coutJour = cj;
    }
    public boolean estLibre() {
        return estLibre;
    }
    public void affecterVehicule(Vehicule v){
        vehiculeGare = v;
        estLibre = false;
    }
    public double getCoutJour() {
        return coutJour;
    }
    public double getCapacite() {
        return capacite;
    }
    public Vehicule getVehiculeGare() {
        return vehiculeGare;
    }
}