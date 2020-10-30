package partie2;

import java.util.ArrayList;

public class CriterePrix implements Critere{
    @Override
    public Place getPlace(ArrayList<Place> places) {
        Place moinsChere = null;
        for(Place place : places){
            if(moinsChere == null || ( place.estLibre() && place.getCoutJour() < moinsChere.getCoutJour()))
                moinsChere = place;
        }
        return moinsChere;
    }
}
