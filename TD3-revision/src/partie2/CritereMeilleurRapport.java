package partie2;

import java.util.ArrayList;

public class CritereMeilleurRapport implements Critere{
    private double capacite;

    public CritereMeilleurRapport(double d){
        capacite = d;
    }

    @Override
    public Place getPlace(ArrayList<Place> places) {
        Place meilleurRapport = null;
        for(Place place : places){
            if(place.getCapacite() == capacite && (meilleurRapport == null || (place.estLibre() && place.getCoutJour() < meilleurRapport.getCoutJour())))
                meilleurRapport = place;
        }
        return meilleurRapport;
    }
}
