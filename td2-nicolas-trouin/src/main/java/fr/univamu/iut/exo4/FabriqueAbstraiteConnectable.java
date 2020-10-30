package fr.univamu.iut.exo4;

public abstract class FabriqueAbstraiteConnectable {
    public abstract Connectable creer(String objet) throws ClassNotFoundException;
    public abstract void  equiper(String gadget);

}
