package fr.univamu.iut.exo3;

public class Radio implements Connectable {

    public Radio(){

    }

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la radio avec : " + gadget);
    }
}
