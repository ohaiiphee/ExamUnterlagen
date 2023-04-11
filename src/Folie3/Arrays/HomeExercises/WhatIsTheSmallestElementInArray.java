package Folie3.Arrays.HomeExercises;

public class WhatIsTheSmallestElementInArray {
    public static void main(String[] args) {
        //Array mit 5 Zahlen erzeugen
        int[] zahlen = {10, 5, 8, 20, 15, 25};
        //Hier haben wir die Zahlen schon im Array, da reicht es mit einer der Zahlen aus dem Array als Default-Wert zuzuweisen
        int kleinsteZahl = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < kleinsteZahl) {
                kleinsteZahl = zahlen[i];
            }
        }
        System.out.println("Die kleinste Zahl im Array ist: " +
                kleinsteZahl);
    }
}

