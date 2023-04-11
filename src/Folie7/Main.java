package Folie7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        statischeMethoden();
        statischeVariablen();
        //Zusatzinof ueber private Methoden - wir haben es theoretisch einmal besprochen, hier ist aber auch ein
        //..Beispiel dazu wie wir auf private Methoden zugreifen koennten
        privateMethoden();
        rekursion(10);

        //Methode welch
        arrayUebergabe();
    }

    public static void statischeMethoden(){
        //Aufruf einer statischen Methode OHNE Instanz/Objekt
        Mathe.maximumBerechnen(12, 155);

        //Objekterzeugung bzw. Instanzerzeugung der Klasse Mathe
        Mathe m1 = new Mathe();

        //Normale "nicht-static-Methoden" aufrufe durch Instanz -> m1
        m1.minimumBerechnen(12,155);
        m1.maximumBerechnen(12,155);


        //statische methoden kann man auch direkt - also auch OHNE Objekterzeugung bzw. Insanzerzeugung - nutzen
        Mathe.maximumBerechnen(12, 155); //Ich greife hier NICHT ueber das Objekt m1. zu!
        //..sondern der ZUgriff erfolg DIREKT ueber die Klasse

        //Weitere Statisceh Methode in klasse auto
        Auto.fahren(); //Aufruf moeglich, obwohl keine Instanz erzeugt! - weil die Methode static ist

        //Nun kann man die Main-Methode verstehen: public static void main(String[] args)
        //public = oeffentlich sichtbar
        //static = auch ohne Objekterzeugung bzw. Instanzierung startbar
        //void = Kein Rueckgabewert
        //main = ist nur der Methodenname
        //(String[] args) = Im Parameter wird ein String-Array uebergeben

        //Static Methode die auf Variablen eines Objektes zugreift
        Auto.gibMirMarkeAus();
    }

    public static void statischeVariablen(){
        //auf statische Variable ccm aus Klasse Auto zugreifen
        Auto.ccm = 2000; //Initialisiert mit 2000 Kubik
        System.out.println("Die statische Variable ccm hat: "+Auto.ccm+" Kubik!");

        //Erzeugen wir nun ein Objekt der Klasse Auto
        Auto a1 = new Auto("BMW", "5.er", 260);
        //Geben wir mal die Stammdaten + die ccm-Anzahl aus
        System.out.println("Es handelt sich um einen "+a1.getMarke()+" "+a1.getTyp()+" mit "+a1.ccm+" Kubik!");

        //Erzeugen wir noch ein Objekt mit anderen Daten
        Auto a2 = new Auto("Audi", "A4", 160);

        System.out.println("\n---Ab hier CCM neu gesetzt fuer Instanz a2---\n");
        a2.ccm = 1400; //der Audi hat weniger ccm als der BMW
        //Geben wir mal die Stammdaten + die ccm-Anzahl aus
        System.out.println("Es handelt sich um einen "+a2.getMarke()+" "+a2.getTyp()+" mit "+a2.ccm+" Kubik!");
        System.out.println("Es handelt sich um einen "+a1.getMarke()+" "+a1.getTyp()+" mit "+a1.ccm+" Kubik!");
        System.out.printf("Nur die Statische Variable ccm: "+Auto.ccm);
        System.out.println("Wie viele Autos heute erstellt: "+Auto.counterAuto);
    }

    public static void privateMethoden(){
        System.out.println("\n\n---Ab Hier private Methoden Beispiel---\n");
        Auto a = new Auto("BMW", "3.er",190);
        //Die Methode tanken (welche sich in Klasse Auto befindet) ist private und daher nur in der Klasse Auto aufrufbar
        a.autoFahren(); //Wir rufen allerdings die Methode autoFahren() auf welche dann die private Methode tanken aufruft
    }

    //Der uebergebene counter gibt an wie oft die Rekursion aufgerufen werden soll
    public static void rekursion(int counter){
        //Abbruchbedingung unbedingt anfuehren
        if(counter == 0){
            System.out.println("-- Wir sind hier fertig, der Counter hat den Wert "+counter+" erreicht! ---");
            return;
        }

        //Logik der Rekursion - das was damit bezweckt werden soll
        System.out.println("Der Countdown lauft, nur noch t-"+counter+" Sekunden");

        //Wert fuer Abbruchbedingung veraendern
        counter = counter -1; //counter --;

        //Selbstaufruf der Rekursion mit veraendertem Wert
        rekursion(counter); //Man koennte auch hier den counter direkt abaendern zB. rekursion(counter-1);         - dann darf oben aber nichts stehen!
    }

    public static void arrayUebergabe(){
        //Neues INT-MultiArray erzeugen
        int[][] arr = {{1, 2, 3},{4,5,6}};
        //Neus INT-Array erzeugen
        int[] arrEindimensional = {1,2,3};

        //MultiArray an Methode ueber Parameter uebergeben und gleichzeitig ein neues MultiArray arrZurueck mit der..
        //..Rueckgabe von der Methode testArray befuellen und initialisieren
        int[][] arrZurueck = Mathe.testArray(arr);

        System.out.println("---MultiArray ausgabe---");
        //MultiArray arrZurueck ausgeben -> Muss mit Schleife passieren, da wir an der 2.ten Dimension interessiert sind!
        for(int[] x : arrZurueck){
            System.out.println(Arrays.toString(x));
        }

        System.out.println("\n---Eindimensionale ausgabe---");
        //Eindimensionales Array ausgeben -> Hier ist keine Schleife notwendig, da das Array nur eine Dimension hat!
        System.out.println(Arrays.toString(Mathe.testArray(arrEindimensional)));

    }
}
