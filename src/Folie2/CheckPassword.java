package Folie2;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Passwort festlegen auf welches spaeter geprueft wird
        String password = "geheim";

        //Variable deklarieren in welche die Benutzereingabe gespeichert wird, zur besseren Uebersicht
        String inputPassword;

        boolean erstesMal = true; //Ich moechte den Sat "Geben Sie das PW ein" nur einmal anzeigen, bei jedem weiteren Versuch soll ein neuer Satz stehen..
        //.. dafuer helfe ich mir mit der hilfsvariable erstesMal etwas aus
        do {
            if(erstesMal){ //es reicht wenn ich so abfrage, ist das gleiche wie: (erstesMall == true)
                System.out.print("Geben Sie das Passwort ein: "); //Den User darauf hinweisen etwas einzugeben
                erstesMal = false; //danach gleich auf false umsetzen, sodass ich hier nie wieder rein komme
            } else {
                System.out.print("Das Passwort war leider falsch, bitte versuchen Sie es erneut: ");
            }
            inputPassword = scanner.nextLine(); //Passwort in die Variable speichern
        } while (!inputPassword.equals(password)); //Solange eingegebenes Passwort NICHT gleich dem Inhalt der Variable passwort -> zurueck in die Schleife

        //Wenn wir es aus der Schleife scahffen, dann muss das Passwort korrekt sein
        System.out.println("Das Passwort ist korrekt.");
    }
}
