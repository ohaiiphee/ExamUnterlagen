package Folie2;

import java.util.Scanner;

public class TriangleOfStars {
    public static void main(String[] args) {
        //Lassen wir den User soviele Reihen eingeben wie er moechte -> Mittels Scanner Reihenanzahl einlesen
        Scanner userInput = new Scanner(System.in);
        System.out.print("Bitte eingeben wie viele Zeilen sie haben moechten: "); //User auf Eingabe hinweisen
        int rows = userInput.nextInt(); //Hier nextInt() da es sich um einen Int-Wert handelt! .next() nur bei String ;)

        //Nun zur eigentlichen Logik -> Verschachtelte For-Schleife
        for(int i=1; i<= rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* "); //Hier nur ein print -> kein Println, da er sonst bei jeder Ausgabe in die naechste Zeile huepft
            }
            System.out.println(); //Hier ein println -> print Line um in die naechste Zeile zu springen
        }
    }
}
