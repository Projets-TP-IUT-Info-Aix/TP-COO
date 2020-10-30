package partie2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Parking implements Iterable<Vehicule>{
    private ArrayList<Place> places;
    public Parking() {
        places = new ArrayList<Place>();
    }
    public void ajouter(Place place) {
        places.add(place);
    }

    public void garerVehicule(Vehicule vehicule, Critere critere){
        Place placeChoisie = critere.getPlace(places);
        if(placeChoisie == null){
            System.out.println("Pas de place dans le parking");
            return;
        }
        placeChoisie.affecterVehicule(vehicule);
    }

    class IterateurConcret implements Iterator<Vehicule>{

        private ArrayList<Vehicule> vehicules;
        private Vehicule next;

        public IterateurConcret(){
            init();
        }

        public void init(){
            ArrayList<Vehicule> vehicules = new ArrayList<>();
            for(Place place : places){
                if(!place.estLibre())
                    vehicules.add(place.getVehiculeGare());
            }
            this.vehicules = vehicules;
            for(Vehicule vehicule : vehicules){
                if(next == null || vehicule.getDateArrivee().isBefore(next.getDateArrivee()))
                    next = vehicule;
            }
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Vehicule next() {
            if(hasNext()){
                Vehicule current = next;
                Vehicule future_next = null;
                for(Vehicule vehicule : vehicules){
                    if(vehicule.getDateArrivee().isAfter(current.getDateArrivee()) && (future_next == null || vehicule.getDateArrivee().isBefore(future_next.getDateArrivee())))
                        future_next = vehicule;
                }
                next = future_next;
                return current;
            }
            return null;
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public IterateurConcret iterator() {
        return new IterateurConcret();
    }

}
