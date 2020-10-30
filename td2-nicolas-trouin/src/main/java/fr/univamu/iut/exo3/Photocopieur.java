package fr.univamu.iut.exo3;

public class Photocopieur extends ImprimanteDecorateur {

    public Photocopieur(Imprimante imprimante){
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        this.imprimante.imprimer();
        System.out.println("La fonction Photocopie est activée");
    }
}
