package partie3;

public class Main {
    public static void main(String[] args) {
        AgenceEspionnage agenceEspionnage = new AgenceEspionnage();
        MagasinSport magasinSport = new MagasinSport();

        Bracelet bracelet = new Bracelet();
        bracelet.attacher(agenceEspionnage);
        bracelet.attacher(magasinSport);

        Montre montre = new Montre();
        montre.attacher(agenceEspionnage);
        montre.attacher(magasinSport);

        Smartphone smartphone = new Smartphone();
        smartphone.attacher(agenceEspionnage);

        bracelet.setMessage("Message Bracelet 1");
        montre.setMessage("Message Montre 1");
        smartphone.setMessage("Message Smartphone 1");
        bracelet.setMessage("Message Bracelet 2");
        montre.setMessage("Message Montre 2");
        smartphone.setMessage("Message Smartphone 2");
    }
}
