package fr.univamu.iut.exo4;

public class Fax extends ImprimanteDecorateur {

    public Fax(Imprimante imprimante){
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        this.imprimante.imprimer();
        System.out.println("La fonction Fax est activée");
    }
}
