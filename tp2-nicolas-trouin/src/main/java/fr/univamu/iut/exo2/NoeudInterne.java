package fr.univamu.iut.exo2;

public class NoeudInterne extends Expression {
    private char operateurBinaire;
    private Expression premierOperande;
    private Expression deuxiemeOperande;

    public NoeudInterne(char operateurBinaire, Expression premierOperande, Expression deuxiemeOperande) {
        this.operateurBinaire = operateurBinaire;
        this.premierOperande = premierOperande;
        this.deuxiemeOperande = deuxiemeOperande;
    }

    @Override
    public double calculerValeur() {
        switch (operateurBinaire){
            case '+':
                return premierOperande.calculerValeur() + deuxiemeOperande.calculerValeur();
            case '-':
                return premierOperande.calculerValeur() - deuxiemeOperande.calculerValeur();
            case '*':
                return premierOperande.calculerValeur() * deuxiemeOperande.calculerValeur();
            case '/':
                return premierOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
            case '%':
                return premierOperande.calculerValeur() % deuxiemeOperande.calculerValeur();
            default:
                return 0;
        }
    }
}
