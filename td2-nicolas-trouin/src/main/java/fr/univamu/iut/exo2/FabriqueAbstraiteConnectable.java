package fr.univamu.iut.exo2;

public abstract class FabriqueAbstraiteConnectable {
    public abstract Connectable  creer(String objet) throws ClassNotFoundException;
    public abstract void  equiper(String gadget);

}
