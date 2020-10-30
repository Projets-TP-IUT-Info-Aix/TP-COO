/*package fr.univamu.iut.exo2;

public class ArbreBinaire<T>{
    private T valeur = null;
    private ArbreBinaire<T> arbreBinaireGauche = null;
    private ArbreBinaire<T> arbreBinaireDroite = null;
    private ArbreBinaire<T> arbreBinairePere = null;

    public ArbreBinaire(T valeur) {
        this.valeur = valeur;
    }

    public ArbreBinaire<T> getArbreBinaireGauche() {
        return arbreBinaireGauche;
    }

    public void setArbreBinaireGauche(ArbreBinaire<T> arbreBinaireGauche) {
        this.arbreBinaireGauche = arbreBinaireGauche;
    }

    public ArbreBinaire<T> getArbreBinaireDroite() {
        return arbreBinaireDroite;
    }

    public void setArbreBinaireDroite(ArbreBinaire<T> arbreBinaireDroite) {
        this.arbreBinaireDroite = arbreBinaireDroite;
    }

    public ArbreBinaire<T> getArbreBinairePere() {
        return arbreBinairePere;
    }

    public void setArbreBinairePere(ArbreBinaire<T> arbreBinairePere) {
        this.arbreBinairePere = arbreBinairePere;
    }

    public void afficherArbre(){
        if(this.getArbreBinaireGauche() != null) this.getArbreBinaireGauche().afficherArbre();
        System.out.flush();
        System.out.println(this);
        System.out.flush();
        if(this.getArbreBinaireDroite() != null) this.getArbreBinaireDroite().afficherArbre();
    }

    public void add(T valeur){
        if(this.getArbreBinaireGauche() == null){
            ArbreBinaire<T> arbreTemp = new ArbreBinaire<>(valeur);
            this.setArbreBinaireGauche(arbreTemp);
            arbreTemp.setArbreBinairePere(this);
        }
        else if (this.getArbreBinaireDroite() == null){
            ArbreBinaire<T> arbreTemp = new ArbreBinaire<>(valeur);
            this.setArbreBinaireDroite(arbreTemp);
            arbreTemp.setArbreBinairePere(this);
        }
        else{
            if(Math.random() <= 0.5){
                this.getArbreBinaireDroite().add(valeur);
            }
            else{
                this.getArbreBinaireGauche().add(valeur);
            }
        }

    }


    @Override
    public String toString() {
        return "ArbreBinaire{" +
                "valeur=" + valeur +
                '}';
    }

}
*/
