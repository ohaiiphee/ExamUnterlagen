package Folie5_OOP_MultiClass.Katze;

import Folie5_OOP_MultiClass.Katze.Katze;


public class KatzeMain {
    public static void main(String[] args) {
        Katze katze = new Katze("Pezi", 4, "Katzenrasse");

        //Funktion des Knurrens testen
        katze.knurren();

        //Funktion des Weglaufens testen
        katze.hundWeglaufen();
    }
}
