package Folie3.Arrays.HomeExercises;

import java.util.Random;

public class ArrayWithRandomNumbers {
    public static void main(String[] args) {
        //Ein int-Array mit der fixen Groesse 15 erstellen aber noch keine Werte den Elementen zuweisen
        int[] zahlen = new int[15];
        //ACHTUNG: Sie muessen ganz oben ein import java.util.Random; einbauen!
        Random random = new Random(); //erzeugt uns ein Objekt des Typs Random um spaeter Zufallszahlen zu erzeugen
        for (int i = 0; i < zahlen.length; i++) {
            //Hier weissen wir dem Element im Array zahlen an der Stelle i eine Zufaellige Zahl zwischen 1 und 100 zu
            zahlen[i] = random.nextInt(100) + 1;
        }
        //Hier geben wir nun jedes einzelne Element fuer Element in der Konsole aus
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}

