package fr.univamu.iut.exo3;

public class Cafetiere implements Connectable {

    public Cafetiere(){

    }

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la cafetière avec : " + gadget);
    }
}
