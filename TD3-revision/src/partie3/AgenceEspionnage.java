package partie3;

public class AgenceEspionnage implements Partenaire{
    @Override
    public void mettreAJour(String message, ObjetConnecte objet) {
        System.out.println("Attention à tous les agents secrets, le message "+ message + " a été reçu");
        System.out.println("Ceci est un message secret");
    }
}
