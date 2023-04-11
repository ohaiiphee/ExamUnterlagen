package Folie2;

import java.nio.file.Paths;
import java.util.Scanner;

public class FaustExercise {
    public static void main(String[] args) throws Exception {
        //NUR DEN PFAD zur TXT-Datei, welche wir unten brauchen, in die String-Variable namens file speichern
        String file = "C:\\Users\\b51491\\OneDrive - CAMPUS 02 Fachhochschule der Wirtschaft GmbH\\Documents\\"
                +"02_PR1_&_LV_IT-Labor_ZAM_23_SS\\PR1\\Übungsbeispiele_NEU\\Wörter-in-Buch-Zählen\\faust.txt";

        //Mittels Scanner und der Option "Paths.get(PFAD)" den Inhalt der dort befindlichen Datei auslesen
        Scanner BuchText = new Scanner(Paths.get(file));


        //Counter fuer die zu zahelenden Woerter anlegen
        int countWort = 0;

        //Benutzer fragen, welches Wort er/sie gerne gezaehlt haben moechte
        System.out.print("Geben Sie bitte das Wort ein, welches gezaehlt werden soll (Gross- & Kleinschreibung ist egal): ");

        //Eigenen System.in Scanner erstellen um die Eingabe auf der Konsole abzufangen und zu speichern
        Scanner input = new Scanner(System.in);
        String gesuchtesWort = input.next(); //Die Benutzereingabe von der Konsole in die Variable gesuchtesWord speichern
        gesuchtesWort = gesuchtesWort.toLowerCase(); //Damit Benutzer nicht daran denken muss wie er es schreibt
        String word;

        //Einfache While-Schleife, die solange durchlaufen wird, solange es etwas auszulesen gibt
        while (BuchText.hasNext()) {
            //Das einzelne naechste Wort auslesen -> Daher next() und nicht nextLine() !
            word = BuchText.next();

            //Das Wort klein schreiben lassen, damit wir nicht auf Gross- und Kleinschreibung achten muessen
            word = word.toLowerCase();

            //Mittels einer einfachen IF-Anweisung evaluieren ob es eins der gesuchten Woerter ist und den Counter um 1 erhoehen falls True
            if (word.equals(gesuchtesWort)) {
                countWort++;
            }

            //System.out.print(word+" "); //OPTIONAL: Den gesamten Text der Datei in die Konsole ausgeben

        }
        //Finale Ausgabe der gezaehlten Ergebnisse
        System.out.println("Das Wort '"+gesuchtesWort+"' wurde: "+countWort+" mal in diesem Dokument gefunden.");
    }
}
