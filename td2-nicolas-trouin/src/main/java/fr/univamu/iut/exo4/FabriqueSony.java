package fr.univamu.iut.exo4;

public class FabriqueSony extends FabriqueAbstraiteConnectable {

    @Override
    public Connectable creer(String objet) throws ClassNotFoundException {
        switch (objet.toLowerCase()){
            case "radio":
                return new Radio();
            case "cafetiere":
                return new Cafetiere();
            case "radiateur":
                return new Radiateur();
            default:
                throw new ClassNotFoundException();
        }
    }

    @Override
    public void equiper(String gadget) {

    }
}
