package partie2;

import java.util.ArrayList;

public class CritereCapacite implements Critere{
    @Override
    public Place getPlace(ArrayList<Place> places) {
        Place plusGrande = null;
        for(Place place : places){
            if(plusGrande == null || (place.estLibre() && place.getCapacite() < plusGrande.getCapacite()))
                plusGrande = place;
        }
        return plusGrande;
    }
}
