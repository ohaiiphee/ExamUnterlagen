package Folie6;

import Folie6.MethodenUeberladung.Auto;
import Folie6.MethodenUeberladung.Mathe;

public class Part6ZusatzAusUnterricht {
    public static void main(String[] args) {
        referenzNullKontante();
        methodenUeberladungAuto();
        System.out.println("\n----Trennstrich zur naechsten Methode----\n");
        methodenUeberladungMathe();
    }

    public static void referenzNullKontante(){
        //Null Variablen
        String x = null;
        //System.out.println("x: "+x);

        //Konstanten
        final String y = "name";
        //y = "andererName";
        System.out.println("y: "+y);
    }

    public static void methodenUeberladungAuto(){
        //Wir erstellen das Objekt a1 mit allen notwendigen Angaben
        Auto a1 = new Auto("BMW", "G30", 220);
        //System.out.println("Die Marke des Objektes ist: "+a1.getMarke());

        //Nun haben wir beim naechetn Auto nicht alle Details bei der Hand, werden es jedoch trdm erstellen
        Auto a2 = new Auto("Mini", "Cooper"); //Obwohlwir nicht alle geforderten Parameter uebergeben, geht es trotzdem,
        //.. das ist nur dem zweiten gleichnahmigen Konstrukotr zu verdanken!

        //Was ist wenn wir ein Autoobjekt erzeugen wollen, jedoch keine Daten haben? - macht nicht viel Sinn aber versuchen wir es
        Auto a3 = new Auto(); //Auch moeglich -> Weil ich einen zusaetzlichen leeren Konstruktor habe auf den Java zugreift!
        //Setzen Wir fuer das Objekt a3 neue Werte
        a3.setMarke("VW");
        a3.setTyp("Golf");
        a3.setPs(60);
        //Erneut die Daten aendern - zu komplett gleichen Daten wie in Objekt 1
        a3.setMarke(a1.getMarke());


        //Wuerde das nachfolgende auch funktionieren?
        Auto a4 = new Auto("Audi"); // -- Kommentar

        //Geben wir nun mit der Funktion autoInformationen() die wichtigsten Daten aus
        a1.autoInformationen();
        a2.autoInformationen();
        a3.autoInformationen();
        a4.autoInformationen();
    }

    public static void methodenUeberladungMathe(){
        Mathe m1 = new Mathe();

        //Gib mir die kleinere Zahl zurueck
        System.out.println("Das ist die kleinere int-Zahl: "+m1.minimumBerechnen(100,20));

        //ANDERER DATENTYP --> Gib mir die kleinere double Zahl zurueck
        double minZahld = m1.minimumBerechnen(100.89,100.12);
        System.out.println("Das ist die kleinere double-Zahl: "+minZahld);

        //ZUSAETZLICHE VARIABLE --> Gib mir aus 3 Variablen die kleinste zurueck
        double minZahlz = m1.minimumBerechnen(10.453, 98, 90.5);
        System.out.println("Das ist die kleineste Zahl aus den drei Paramteren: "+minZahlz);

        //Noch eine Methode wo ich String uebergebe
        System.out.println("Das ist ein STring: "+m1.minimumBerechnen("Hallo"));

    }
}
