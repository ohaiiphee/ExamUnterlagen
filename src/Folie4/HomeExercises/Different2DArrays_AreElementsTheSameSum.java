package Folie4.HomeExercises;

public class Different2DArrays_AreElementsTheSameSum {
    public static void main(String[] args) {
        //Arrays deklarieren und die Elemente mit Werten initialisieren
        int[][] arrayOption = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};
        //Zum testen des anderen einfach die Zeile entKommentieren und die oben in Kommentline setzen
        //int[][] arrayOption = {{2, 4, 3, 2}, {6, 3, 2}, {2, 10}, {2, 2, 2, 6}};
        int[] summArray = new int[arrayOption.length]; //hier speichern wir die einzelnen Summen der 4 Arrays - die Laenge dieses sumArrays haengt vom arrayOption ab
        int counter = 0; //damit wir alle Felder von sumArray durchgehen koennen
        //Berechnung und Vergleich der Summen - hier gibt es keinen Unterschied ob Option 1 oder 2 außer der Variablenname den wir waehlen
        for (int[] arrayEindimensional : arrayOption) {
            int hilfsvariableSum = 0; //diese immer neu initialisieren, diese zaehlt dadurch dann immer nur die einzelnen eindimensionalen Arrays und nicht alles!
            for (int einzelneWerte : arrayEindimensional) { //jetzt alle einzelnen Werte meiner einzelnen eindimensionaeln Arrays holen und zusammenzahlen
                hilfsvariableSum += einzelneWerte;
            }
            summArray[counter] = hilfsvariableSum;
            counter++;
        }
        //Pruefung und Ausgabe des Outputs
        if (summArray[0] == summArray[1] && summArray[0] == summArray[2] &&
                summArray[0] == summArray[3]) {
            System.out.println("OK - In diesem zweidimensionalen Array besitzen alle eindimensionalen Arrays die gleiche Summe");
        } else {
            System.out.println("X - In diesem zweidimensionalen Array besitzen NICHT alle eindimensionalen Arrays die gleiche Summe");
        }
    }
}

