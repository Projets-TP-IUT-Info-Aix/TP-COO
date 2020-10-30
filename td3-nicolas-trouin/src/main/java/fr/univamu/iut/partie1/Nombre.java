package fr.univamu.iut.partie1;

public class Nombre extends Expression implements Visitable{
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public double calculerValeur() {
        return valeur;
    }

    @Override
    public void accepter(Visiteur visiteur) {
        visiteur.getTexte(this);
    }

    @Override
    public String toString() {
        return String.valueOf(valeur);
    }
}
