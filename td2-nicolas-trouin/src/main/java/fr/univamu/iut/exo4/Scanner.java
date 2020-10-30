package fr.univamu.iut.exo4;

public class Scanner extends ImprimanteDecorateur {

    public Scanner(Imprimante imprimante){
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        this.imprimante.imprimer();
        System.out.println("La fonction Scanner est activée");
    }
}
