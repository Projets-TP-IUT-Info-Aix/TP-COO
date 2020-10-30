package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
        Expression expression = new NoeudInterne('+', new NoeudInterne('*',new Nombre(2), new Nombre(3)), new Nombre(5));
        System.out.println(expression.calculerValeur());
    }
}
