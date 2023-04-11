package Folie2.HomeExercises;

import java.util.Scanner;

public class CheckIfUsernameAndPasswordChecksOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String benutzername;
        String passwort;
        int versuche = 0;
        //Hier wurde eine konstante Variable definiert
        final int MAX_VERSUCHE = 3;
        //Hier empfiehlt sich eine Do-While-Schleife, da wir sie einmal durchlaufen muessen bevor wir die Bedingungen pruefen
        do {
            //Benutzername mittels scanner aus der Konsole einlesen und speichern
            System.out.print("Benutzername eingeben: ");
            benutzername = input.nextLine();
            //Passwort mittels scanner aus der Konsole einlesen und speichern
            System.out.print("Passwort eingeben: ");
            passwort = input.nextLine();
            //Versuche um 1 hochzaehlen
            versuche++;
            //Ich pruefe das zuerst, damit es im Falle einer Versuchsueberschreitung garnicht erst zur Eingabe der Daten kommt
            if (versuche >= MAX_VERSUCHE) {
                System.out.println("Maximale Anzahl von Versuchen erreicht. Programm wird beendet.");
                //Beendet das ganze Programm mit dem Status 0
                System.exit(0);
            }
            //Pruefen ob benutzername ODER passwort FALSCH sind -> Falls eines false zurückgibt springen wir in das IF wegen dem !
            //kurz die nachfolgende Zeile fuer Sie uebersetzt: IF benutzername equals NICHT user123 ODER IF passwort equals NICHT password123 -> dann geh in die IF hinein
            if (!benutzername.equals("user123") ||
                    !passwort.equals("password123")) {
                System.out.println("Falscher Benutzername oder falsches Passwort. Bitte erneut versuchen.");
            }
            //Hier beim While ist die gleiche Bedingung wie oben beim IF - falls eines der beiden NICHT passt, dann geh in die Schleife erneut hinein und spring zum do
        } while (!benutzername.equals("user123") ||
                !passwort.equals("password123"));
        System.out.println("Login erfolgreich.");
    }
}