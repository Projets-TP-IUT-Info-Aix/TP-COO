package fr.univamu.iut.partie1;

public abstract class Expression implements Visitable{
    public abstract double calculerValeur();
    public abstract void accepter(Visiteur visiteur);
}
