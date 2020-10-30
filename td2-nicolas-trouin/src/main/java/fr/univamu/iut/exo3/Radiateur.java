package fr.univamu.iut.exo3;

public class Radiateur implements Connectable {
    public Radiateur(){}

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe le radiateur avec : " + gadget);
    }
}
