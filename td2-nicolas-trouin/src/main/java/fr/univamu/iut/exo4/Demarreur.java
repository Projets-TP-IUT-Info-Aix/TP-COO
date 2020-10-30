package fr.univamu.iut.exo4;

import java.util.ArrayList;
import java.util.Collection;

public class Demarreur {
    private Collection<Connectable> mesObjetsActives = new ArrayList<>();

    public Collection<Connectable> getMesObjetsActives() {
        return mesObjetsActives;
    }

    public void demarrerLesActives(){
        for(Connectable objet : mesObjetsActives){
            objet.demarrer();
        }
    }

    public void attacher(Connectable objet){
        mesObjetsActives.add(objet);
    }

    public void detacher(Connectable objet){
        mesObjetsActives.remove(objet);
    }
}
