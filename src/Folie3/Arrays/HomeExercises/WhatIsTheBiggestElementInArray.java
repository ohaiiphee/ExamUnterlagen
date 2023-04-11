package Folie3.Arrays.HomeExercises;

import java.util.Scanner;

public class WhatIsTheBiggestElementInArray {
    public static void main(String[] args) {
        //Benutzereingabe und Variablen vorbereiten
        Scanner input = new Scanner(System.in);
        int[] zahlen = new int[10];
        //Hierzu gibt es eine kurze Beschreibung im Loesungs-Dokument
        //Hier wird der kleinstmoegliche Integer-Wert zugewiesen weil wir keinen Wert im Array haben um mit dem einen Default-Wert zuzuweisen
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < zahlen.length; i++) {
            //Benutzereingabe um das Array mit 10 Elementen zu fuellen
            System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
            zahlen[i] = input.nextInt();
            //gleich mitpruefen ob die eingegebene Zahl die groesste bis jetzt ist
            if (zahlen[i] > max) {
                max = zahlen[i]; //Falls TRUE, dann Variable max mit der aktuellen Zahl setzen
            }
        }
        System.out.println("Das größte Element des Arrays ist: " + max);
    }
}

