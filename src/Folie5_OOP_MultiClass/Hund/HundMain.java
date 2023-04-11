package Folie5_OOP_MultiClass.Hund;

import java.util.Scanner;

public class HundMain {
    public static void main(String[] args) {
        Hund hund = new Hund("Foxi", 2, "Schaeferhund", "Braun");

        //User fragen ob der Hund das Stoeckchen bringen kann und Funktion aufrufen
        Scanner input = new Scanner(System.in); //Scannerobjekt erzeugen um Konsoleninput lesen zu koennen
        System.out.print("Kann der Hund das Stoeckhen bringen? (bitte nur true oder false, kleingeschrieben, eingeben): ");
        hund.stoeckchenBringen(input.nextBoolean()); //Die Usereingabe gleich direkt im Parameter des Methodenaufrufs einbinden

        //Nun ein Bellen ausgeben
        hund.bellen();
    }
}
