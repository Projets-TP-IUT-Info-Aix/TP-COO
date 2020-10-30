package fr.univamu.iut.exo2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArbreBinaire<T> implements Iterable<ArbreBinaire<T>>{
    private ArbreBinaire pere = null;
    private ArbreBinaire filsGauche;
    private ArbreBinaire filsDroite;
    private T valeur;

    public ArbreBinaire(ArbreBinaire filsGauche, ArbreBinaire filsDroite, T valeur) {
        setParent(filsGauche);
        this.filsGauche = filsGauche;
        setParent(filsDroite);
        this.filsDroite = filsDroite;
        this.valeur = valeur;
    }

    private void setParent(ArbreBinaire<T> fils) {
        if (fils != null) {
            if(fils.pere != null){
                System.out.println("invalide");
            }
            fils.pere = this;
        }
    }

    public T getValeur() {
        return valeur;
    }

    public ArbreBinaire getFilsGauche() {
        return filsGauche;
    }

    public ArbreBinaire getFilsDroite() {
        return filsDroite;
    }

    public ArbreBinaire getPere() {
        return pere;
    }

    class IterateurConcret implements Iterator<ArbreBinaire<T>>{

        private ArbreBinaire<T> next;

        public IterateurConcret() {
            init();
        }

        public void init(){
            next = ArbreBinaire.this;
            if(next == null)
                return;

            while (next.getFilsGauche() != null)
                next = next.getFilsGauche();
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public ArbreBinaire<T> next() {
            if(!hasNext()) throw new NoSuchElementException();
            ArbreBinaire<T> r = next;

            if(next.getFilsDroite() != null) {
                next = next.getFilsDroite();
                while (next.getFilsGauche() != null)
                    next = next.getFilsGauche();
                return r;
            }

            while(true) {
                if(next.getPere() == null) {
                    next = null;
                    return r;
                }
                if(next.getPere().getFilsGauche() == next) {
                    next = next.getPere();
                    return r;
                }
                next = next.getPere();
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public IterateurConcret iterator() {
        return new IterateurConcret();
    }

    @Override
    public String toString() {
        /*return "ArbreBinaire{" +
                "valeur=" + valeur +
                '}';
        */
        return valeur.toString();
    }
}