package fr.univamu.iut.exo2;

public class Client {

    static ArbreBinaire<String> feuille(String mot){
        return new ArbreBinaire<>(null,null, mot);
    }

    static ArbreBinaire<String> noeudInterne(ArbreBinaire a1, String mot, ArbreBinaire a2){
        return new ArbreBinaire<>(a1,a2, mot);
    }

    public static void main(String[] args) {
        /*
        ArbreBinaire arbre = noeudInterne(feuille("fils gauche"),"père",feuille("fils droit"));


        System.out.println(arbre.getValeur());
        System.out.println(arbre.getFilsGauche().getValeur());
        System.out.println(arbre.getFilsDroite().getValeur());
        System.out.println();
        System.out.println();

        ArbreBinaire a = feuille("a");
        ArbreBinaire b = feuille("b");
        ArbreBinaire c = feuille("c");

        ArbreBinaire plus = noeudInterne(a,"+",b);
        ArbreBinaire fois = noeudInterne(plus,"*",c);

        System.out.println(fois.getFilsGauche().getFilsGauche().getValeur());
        System.out.println(fois.getFilsGauche().getValeur());
        System.out.println(fois.getFilsGauche().getFilsDroite().getValeur());
        System.out.println(fois.getValeur());
        System.out.println(fois.getFilsDroite().getValeur());
        */

        ArbreBinaire a = feuille("a");
        ArbreBinaire c = feuille("c");
        ArbreBinaire e = feuille("e");
        ArbreBinaire g = feuille("g");

        ArbreBinaire<String> abc = noeudInterne(a,"b",c);
        ArbreBinaire<String> efg = noeudInterne(e,"f",g);
        ArbreBinaire<String> abcdefg = noeudInterne(abc,"d",efg);

        ArbreBinaire i = feuille("i");
        ArbreBinaire k = feuille("k");
        ArbreBinaire m = feuille("m");
        ArbreBinaire o = feuille("o");

        ArbreBinaire<String> ijk = noeudInterne(i,"j",k);
        ArbreBinaire<String> mno = noeudInterne(m,"n",o);
        ArbreBinaire<String> ijklmno = noeudInterne(ijk,"l",mno);

        ArbreBinaire<String> abcdefghijklmno = noeudInterne(abcdefg,"h",ijklmno);

        for(ArbreBinaire<String> arbreString : abcdefghijklmno){
            System.out.println(arbreString);
        }

        //ArbreBinaire<String> arbreBinaire = new ArbreBinaire<>()

    }
}
