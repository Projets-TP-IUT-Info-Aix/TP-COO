package fr.univamu.iut.partie1;

import java.util.ArrayList;

public class Traducteur implements Visiteur {
    private ArrayList<Object> expr = new ArrayList<>();
    private String langue;

    public Traducteur(String langue, Expression expression) {
        this.langue = langue;
        expression.accepter(this);
    }

    public String getTraduction(){
        String traduction = "Expression " + langue + " :";
        String mot;
        for(Object object : expr){
            switch (langue){
                case "fr":
                    switch (object.toString()){
                        case "0":
                            mot = "zéro";
                            break;
                        case "1":
                            mot = "un";
                            break;
                        case "2":
                            mot = "deux";
                            break;
                        case "3":
                            mot = "trois";
                            break;
                        case "4":
                            mot = "quatre";
                            break;
                        case "5":
                            mot = "cinq";
                            break;
                        case "6":
                            mot = "six";
                            break;
                        case "7":
                            mot = "sept";
                            break;
                        case "8":
                            mot = "huit";
                            break;
                        case "9":
                            mot = "neuf";
                            break;
                        case "+":
                            mot = "plus";
                            break;
                        case "-":
                            mot = "moins";
                            break;
                        case "*":
                            mot = "fois";
                            break;
                        case "/":
                            mot = "divisé par";
                            break;
                        case "%":
                            mot = "modulo";
                            break;
                        default:
                            mot = "erreur";
                    }
                    break;
                case "en":
                    switch (object.toString()){
                        case "0":
                            mot = "zero";
                            break;
                        case "1":
                            mot = "one";
                            break;
                        case "2":
                            mot = "two";
                            break;
                        case "3":
                            mot = "three";
                            break;
                        case "4":
                            mot = "four";
                            break;
                        case "5":
                            mot = "five";
                            break;
                        case "6":
                            mot = "six";
                            break;
                        case "7":
                            mot = "seven";
                            break;
                        case "8":
                            mot = "eight";
                            break;
                        case "9":
                            mot = "nine";
                            break;
                        case "+":
                            mot = "plus";
                            break;
                        case "-":
                            mot = "minus";
                            break;
                        case "*":
                            mot = "times";
                            break;
                        case "/":
                            mot = "divided by";
                            break;
                        case "%":
                            mot = "modulo";
                            break;
                        default:
                            mot = "error";
                    }
                    break;
                default:
                    mot = "erreur de langue";
            }
            traduction += " " + mot;
        }
        return traduction;
    }

    @Override
    public void getTexte(Object object) {
        expr.add(object);
    }
}
