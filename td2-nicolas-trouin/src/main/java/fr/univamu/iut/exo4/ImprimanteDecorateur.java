package fr.univamu.iut.exo4;

public abstract class ImprimanteDecorateur extends Imprimante {
    protected Imprimante imprimante;

    public abstract void imprimer();
}
