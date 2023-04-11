package Folie2.HomeExercises;

public class Fibonacci {
    public static void main(String[] args) {
            //wir Deklarieren und Initialisieren mal die ersten Variablen
            int davor = 0;
            int aktuell = 1;
            for (int i = 0; i < 20; i++) {
                //Hier geben wir immer die aktuelle Zahl aus
                System.out.print(aktuell + " ");
                //es ist OK die Variable naechste hier zu deklarieren, da sie nur innerhalb der Schleife verwendet wird
                //Nun werden davor und aktuell als Summe in naechste verspeichert
                int naechste = davor + aktuell;
                //die Variable davor uebernimmt den Wert von aktuell
                davor = aktuell;
                //und aktuell uebernimmt die Summe der beiden also naechste
                aktuell = naechste;
            }
        }
    }

