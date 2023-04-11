package Folie4.HomeExercises;

import java.util.Arrays;

public class Verschachtelte_ForEach_And_ForSchleife {
    public static void main(String[] args) {
        //Array deklarieren und mit Werten für die Elemente initialisieren
        double[][] array = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};
        //Hilfsvariable, wo ich die Summe verspeichere - muss natuerlich auch vom Typ double sein !
        double sum = 0;
        //OPTION 1: Verschachtelte For-Schleife -> Weil 2 Dimensionen, daher 2 Schleifen !
        for (int i = 0; i < array.length; i++) { //hier gehe ich das erste Array durch, welches in diesem Fall 4 weitere Arrays als Elemente hat
            for (int j = 0; j < array[i].length; j++) { //Hier ist es wichtig die Laenge der einzelnen Arrays zu nehmen diese kann zwischen 1 und 6 varieren,
                // ..ansonsten gibt es eine OutOfBoundException, wenn ich das hier nicht so mache
                //und nun zaehlen wir einfach die Werte zusammen, mehr ist nicht dahinter :)
                sum += array[i][j]; //ist das gleiche wie wenn ich sum = sum +array[i][j] schreiben wuerde
            }
        }
        System.out.println("NORMAL FOR-SCHLEIFE --> The sum of all values in this 2D array is " + sum);

        System.out.println("---------Trennstrich fuer OPTION 2 mit For:each--------");
        //Hilfsvarialbe sum2 fuer die zweite Option
        double sum2 = 0;
        //OPTION 2: Verschachtelte For:each-Schleife
        for (double[] firstDimension : array) { //hier gibt es mir nur die einzelnen Arrays aus also die erste Dimension also isgesamt 4 Mal
            //zum veranschaulichen was er mir hier retourgibt
            System.out.print(Arrays.toString(firstDimension)); //Hier bekommen wir die einzelnen Arrays, noch KEINE einzelonen Werte !
            System.out.println();
            for (double element : firstDimension) { // hier gibt er mir nun die einzelnen Werte aller einzelnenDimensions Arrays
                //zum veranschaulichen was er mir hier retourgibt
                System.out.print(element); //das ist kein Array mehr! Hier bekommen wir endlich die einzelnen Werte
                sum2 += element;
            }
        }
        //Ausgabe der Summe
        System.out.println("FOR-EACH SCHLEIFE --> The sum of all values in this 2D array is " + sum2);
    }
}

