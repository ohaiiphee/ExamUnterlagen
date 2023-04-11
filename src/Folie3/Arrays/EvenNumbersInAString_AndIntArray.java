package Folie3.Arrays;

import java.util.Arrays;

public class EvenNumbersInAString_AndIntArray {
    public static void main(String[] args) {
        //Diese Uebung hat zwei sehr naheliegende moegliche Loesungen
        uebung01StringArray(); //Mit einem String-Array loesen
        uebung01IntArray(); //Mit einem int-Array loesen
    }

    public static void uebung01StringArray(){
        //Array mit passender groeße erstellen
        String[] test = new String[100];
        int geradeZahl = 2;
        int counter = 0;
        //Schleife zum Befuellen
        for (int i=0; i<=99; i++){ //Achtung: Hier nicht 100 sondern 99 -> sonst haben wir eine OutOfBound-Exception

            //Option 1 -> wir machen in jeder Runde, bei der Uebergabe an test[i] einen String aus geradezahl
            test[i] = Integer.toString(i);

            //Die Variable geradeZahl um 2 erhoehen
            geradeZahl = geradeZahl+2;
        }

        //Ausgabe des gesamten Arrays als String
        System.out.println(Arrays.toString(test));
    }

    public static void uebung01IntArray(){
        //Array mit passender groeße erstellen
        int[] test = new int[100];
        int geradeZahl = 2;

        //Schleife zum Befuellen
        for (int i=0; i<=99; i++){ //Achtung: Hier nicht 100 sondern 99 -> sonst haben wir eine OutOfBound-Exception
            //Option 2 -> wir machen aus geradeZahl ein int-Array
            test[i] = geradeZahl;

            //Die Variable geradeZahl um 2 erhoehen
            geradeZahl = geradeZahl + 2;
        }

        //Ausgabe des gesamten Arrays als String
        System.out.println(Arrays.toString(test));
    }
}
