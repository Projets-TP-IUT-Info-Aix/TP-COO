package partie3;

public class Bracelet extends ObjetConnecte{
    @Override
    public void attacher(Partenaire partenaire) {
        mesPartenaires.add(partenaire);
    }

    @Override
    public void detacher(Partenaire partenaire) {
        mesPartenaires.remove(partenaire);
    }

    @Override
    public void notifierPartenaires(String message, ObjetConnecte objet) {
        for(Partenaire partenaire : mesPartenaires){
            partenaire.mettreAJour(message, objet);
        }
    }

    @Override
    public void setMessage(String message) {
        System.out.println("Le Bracelet exécute l'activité correspondante au message : " + message);
        notifierPartenaires(message, this);
    }
}
