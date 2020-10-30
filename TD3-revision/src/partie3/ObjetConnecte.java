package partie3;

import java.util.ArrayList;

public abstract class ObjetConnecte {
    protected ArrayList<Partenaire> mesPartenaires = new ArrayList<>();

    public abstract void attacher(Partenaire partenaire);

    public abstract void detacher(Partenaire partenaire);

    public abstract void notifierPartenaires(String message, ObjetConnecte objet);

    public abstract void setMessage(String message);
}
