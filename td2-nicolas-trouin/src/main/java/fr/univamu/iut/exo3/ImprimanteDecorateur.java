package fr.univamu.iut.exo3;

public abstract class ImprimanteDecorateur extends Imprimante {
    protected Imprimante imprimante;

    public abstract void imprimer();
}
