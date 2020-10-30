package fr.univamu.iut.partie1;

public class NoeudInterne extends Expression implements Visitable{
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

    @Override
    public void accepter(Visiteur visiteur) {
        if(premierOperande != null)
            premierOperande.accepter(visiteur);
        visiteur.getTexte(operateurBinaire);
        if(deuxiemeOperande != null)
            deuxiemeOperande.accepter(visiteur);
    }

    @Override
    public String toString() {
        return String.valueOf(operateurBinaire);
    }
}
