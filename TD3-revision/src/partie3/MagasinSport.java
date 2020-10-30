package partie3;

public class MagasinSport implements Partenaire{
    @Override
    public void mettreAJour(String message, ObjetConnecte objet) {
        System.out.println("Message aux vendeurs, l’objet connecté " + objet + " a reçu le message : \"" + message +"\"");
        System.out.println("Préparez un produit correspondant dans votre magasin");
    }
}
