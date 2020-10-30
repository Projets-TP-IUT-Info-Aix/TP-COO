package fr.univamu.iut.exo4;

public class Radiateur implements Connectable {
    public Radiateur(){}

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe le radiateur avec : " + gadget);
    }

    @Override
    public void demarrer() {
        System.out.println("Le radiateur démarre");
    }
}
