package fr.univamu.iut.exo1;

public class Radio implements Connectable{

    public Radio(){

    }

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la radio avec : " + gadget);
    }
}
