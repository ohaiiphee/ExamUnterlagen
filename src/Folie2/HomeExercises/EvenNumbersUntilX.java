package Folie2.HomeExercises;

import java.util.Scanner;

public class EvenNumbersUntilX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte eine positive ganze Zahl eingeben: ");
        int eingabe = input.nextInt();
        for (int i = 1; i <= eingabe; i++) {
            //Ist die Zahl ungerade? -> hier das != 0 verwenden anstatt dem == ;)
            if (i % 2 != 0) {
                //Falls ungerade, nur dann ausgeben und ein Leerzeichcen dazu, damit die naechste Zahl gleich daneben
                // hinkommt da wir hier ein print nutzen -> ein println waere natuerlich ebenfalls richtig
                System.out.print(i + " ");
            }
        }
    }
}

