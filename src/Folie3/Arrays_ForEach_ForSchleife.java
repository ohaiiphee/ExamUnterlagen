package Folie3;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ForEach_ForSchleife {
    public static void main(String[] args) {
        einfuehrung(); //Einfuehrung in Arrays, Beispiele aus den ersten Folien dieses Parts
        arrayDynamisch(); //Die groesse eines Arrays dynamisch waehrend Programmablauf mitgeben
        kurzschreibweise(); //Befuellen von Arrays und For:each-Schleife
    }

    public static void einfuehrung(){

        String[] name; //Deklaration
        name = new String[15]; //Initialisierung

        //Initialisierung der einzelnen Elemennte an den jeweiligen Stellen
        name[0] = "Myla"; //Element an der ersten Stelle [0] hat nun den Wert Myla
        name[1] = "Cheda"; //Element an der zweiten Stelle [1] hat nun den Wert Cheda
        name[2] = "Teresa"; //...
        name[3] = "Victoria";
        name[4] = "Aurelie";
        name[5] = "Jasmine";

        //Ausgabe der einzelnen Werte
        System.out.println("Wert an der Stelle 0: "+name[0]);
        System.out.println("Wert an der Stelle 5: "+name[4]);  //Achtung: Stelle 5 = Element 4 - da Java mit 0 beginnt!

        //Das gesamte Array als String ausgeben
        System.out.println(Arrays.toString(name));

        //Was passiert wenn wir ein Element haben wollen was es nicht gibt?
        //System.out.println("Wert an der Stelle 35: "+name[34]); //das Array hat nur 15 Stelelen -> Fehler!
    }

    public static void arrayDynamisch(){
        //Die Array-Groesse dynamisch erstellen, indem der Benutzer sagt wie viele Daten er eingeben moechte
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eingeben wie gross das Array werden soll: ");
        int arrayGroesse = scanner.nextInt();

        //Array mit der Groesse erzeugen, die uns der Benutzer in der Konsole eingibt
        String[] name = new String[arrayGroesse];

        //Befuellen wir das array durch den Benutzer
        for (int i=0; i<name.length; i++){
            System.out.println("Bitte Name "+i+" eingeben: ");
            name[i] = scanner.next();
        }
        System.out.println(name.length);

        //Ausgabe des gesamten Arrays als String
        System.out.println(Arrays.toString(name));
    }

    public static void kurzschreibweise(){
        //Das kennen wir bereits - Deklarieren, Initialisieren und befuellen

        //Die bekannte Schreibweise
        String[] name1 = new String[3];
        name1[0] = "Aurelie";
        name1[1] = "jana";
        name1[2] = "Michelle";

        //Kurzschreibweise bei der Befuellung von Arrays ware
        String name2[] = {"Aurelie", "Jana", "Michelle"};


        //Strings als ganzes reinhauen
        String temp1 = "Ksenija";
        String temp2 = "Veronika";

        String name3[] = {"Aurelie", temp1, "Sofia", temp2, "Myla"};

        //Ausgabe aller Versionen
        System.out.println(Arrays.toString(name1));
        System.out.println(Arrays.toString(name2));
        System.out.println(Arrays.toString(name3));

        System.out.println("---- ab hier die bekannte For-Schleife ----");

        //Das kennen wir bereits - einfache For-Schleife die uns was ausgibt
        for(int i=0; i<name3.length; i++){
            System.out.println(name3[i]);
        }

        System.out.println("---- ab hier die for:each Schleife ----");

        //Kurzschreibweise der Schleife fuer ARRAYS -> for : each
        for(String nameElement : name3){ //Sie sagen hier folgendes: gehe jedes Element vom Array name3 einzeln durch
            // und initialisiere die Variable nameElement in jeder Iteration mit dem naechsten Wert aus Array name3
            // D.h.: Die For:each-Schleife geht jedes Elemnt im Array name3 einzeln durch und speichert es in nameElement

            System.out.println(nameElement); //Gibt nun in jeder Iteration den aktuellen Wert aus nameElement aus
        }
    }
}
