package Folie5_OOP_MultiClass.Katze;

import Folie5_OOP_MultiClass.Hund.Hund;

public class Katze {
    private String name;
    private int alter;
    private String rasse;

    public Katze(String name, int alter, String rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
    }

    public void knurren(){
        System.out.println("knurr");
    }

    public void hundWeglaufen(){
        //Ich kann auch hier neue Objekte erzeugen und nutze somit die Logik der Klasse Hund in dieser Methode
        Hund hund1 = new Hund("Foxi", 2, "Schaeferhund", "Braun");
        Hund hund2 = new Hund("Rex", 2, "Schaeferhund", "Schwarz");

        //Test des GOOD-CASE
        if (hund1.getName().equals("Foxi")){
            System.out.println("Alles gut, "+hund1.getName()+" ist mein Freund!");
        } else {
            System.out.println(hund1.getName()+" kenne ich nicht, weglaufen!");
        }

        //Gegenteste
        if (hund2.getName().equals("Foxi")){
            System.out.println("Alles gut, "+hund2.getName()+" ist mein Freund!");
        } else {
            System.out.println(hund2.getName()+" kenne ich nicht, weglaufen!");
        }
    }

    //Ab hier alle Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
}
