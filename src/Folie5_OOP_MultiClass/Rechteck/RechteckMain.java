package Folie5_OOP_MultiClass.Rechteck;

import Folie5_OOP_MultiClass.Rechteck.Rechteck;

import java.util.Scanner;

public class RechteckMain {
    public static void main(String[] args) {
        //2 neue Objekte der Klasse Rechteck erstellen
        Rechteck r1 = new Rechteck(23.4, 49.0);
        Rechteck r2 = new Rechteck(25, 87.26);

        //Berechnen und Ausgeben des Umfangs von Objekt-1 und der Flache von Objekt-2
        System.out.println("Das erste Objekt hat einen Umfang von: "+r1.getPerimeter());
        System.out.println("Das zweite Objekt hat eine Flaeche von: "+r2.getArea());

        //Die einzelnen Werte von Width und Height anfordern
        System.out.println("Das erste Objekt hat bisher eine Width von "+r1.getWidth()+" und eine Height von "+r1.getHeight());
        System.out.println("Das zweite Objekt hat bisher eine Width von "+r2.getWidth()+" und eine Height von "+r2.getHeight());

        //Manipulieren wir die Werte bzw. setzen  wir neue Werte für Objekt-2
        r2.setWidth(256);
        r2.setHeight(984);

        //Berechnen und geben wir im gleichen Schritt nun erneut Flachec und Umfang von Objekt-2 aus
        System.out.println("Objekt 2 hat nun eine Flaeche von "+r2.getArea()+"m2 und einen Umfang von "+r2.getPerimeter());
        System.out.println("Dabei wurden folgende Werte zur Berechnung genutzt -> Width: "+r2.getWidth()+" und Height: "+r2.getHeight());

        //Holen Sie sich von eine User ueber die Konsole die naechsten 2 Werte und veraendern Sie auch Objekt-1
        Scanner input = new Scanner(System.in); //Dafuer muessen wir erst ein Scanner-Objekt erstellen -> Fuer die Eingabe
        System.out.print("Bitte Hoehe eingeben: "); //User zur Eingabe auffordern
        r1.setHeight(input.nextDouble()); //direkt die Usereingabe in den Methodenparameter ubergeben
        System.out.print("Bitte Breite eingeben: ");
        r1.setWidth(input.nextDouble());

        //Berechnen und geben wir im gleichen Schritt nun erneut Flachec und Umfang von Objekt-2 aus
        System.out.println("Objekt 2 hat nun eine Flaeche von "+r1.getArea()+"m2 und einen Umfang von "+r1.getPerimeter());
        System.out.println("Dabei wurden folgende Werte zur Berechnung genutzt -> Width: "+r1.getWidth()+" und Height: "+r1.getHeight());

    }
}
