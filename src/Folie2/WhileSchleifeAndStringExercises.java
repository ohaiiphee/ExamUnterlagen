import java.util.Scanner;

public class WhileSchleifeAndStringExercises {
    public static void main(String[] args) {
        schleifenStart();
        nextNextLine(); //Siehe Beschreibung bei der Methode
        stringZusatz(); //Siehe Beschreibung bei der Methode
    }

    //Der Einstieg in Schleifen, hier sind die Themen der ersten Folienseiten
    public static void schleifenStart() {
        //Problemstellung - wir wollen einen Zaehler bis 10
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

        //Bessere Loesung - Kopfgesteuerte Schleife
        boolean zaehler = true;
        int zahl = 1;
        while (zaehler) { //Solange der  Zaehler auf TRUE geh rein
            System.out.println("Nummer: " + zahl);
            if (zahl == 10) {
                zaehler = false; //Sobald 10 erreicht, geh auf false
            }
            zahl++;
        }
        //--> PROBLEM: was wenn wir bei der Zahl 11 starten wuerden?
        //Wenn wir die IF-Abfrage so abaendern sollte es passen:(zahl >= 10) .. dann ists egal was daherkommt


        //Bessere Loesung - Kopfgesteuerte Schleife
        int dauer = 0; //Oder wir nutzen es so
        while (dauer <= 10) { //while TRUE geh rein, falls false, geh nicht rein
            System.out.println(dauer);
            dauer++;
        }

        //Leichter zu verstehen mit Boolean-Werten
        dauer = 1;
        boolean aktiv = true;
        while (aktiv) { //es geht auch aktiv == true - das ist nur die Kurzform
            System.out.println(dauer + " - zweite while-Schleife");
            dauer++;
            if (dauer > 10) {
                aktiv = false;
            }
        }
    }

    //Auf die Frage hin, wo der Unterschied zwischen .next() und .nextLine() und .hasNext() liegt
    public static void nextNextLine(){
        String text = " Programmierer lieben Jave!\n"
                + "Es ist einfach einen Code zu schreiben\n"
                + "wenn man die Syntax kennt\n";
        Scanner scanner = new Scanner(text);

        //Unterschied bei next() --> Gibt nur einzelne Woerter aus
        System.out.println("next: "+scanner.next()); //Nach jedem .next() verringert sich der String um das ausgegebene Wort
        System.out.println("next: "+scanner.next());
        System.out.println("next: "+scanner.next());

        //----------
        String text2 = "Programmierer lieben Jave!\n"
                + "Es ist einfach einen Code zu schreiben\n"
                + "wenn man die Syntax kennt\n";
        Scanner scanner2 = new Scanner(text2);

        //Unterschied bei nextLine() --> Gibt die gesamte Zeile aus
        System.out.println("Erster Aufruf: "+scanner2.nextLine());//Nach jedem .nextLine() verringert sich der String um die ausgegebene Zeile
        System.out.println("Zweiter Aufruf: "+scanner2.nextLine());
        System.out.println("Dritter Aufruf: "+scanner2.nextLine());

        //-- hasnext() --> Fragt nur ab ob es noch ein naechstes Wort gibt welches wir einlesen koennten
        String text3 = "Hallo Welt Heute ist ein schoener Tag";
        Scanner scanner3 = new Scanner(text3);

        int counter = 0; //Hilfsvariable um die Woerter zu zaehlen
        while(scanner3.hasNext()){ //Falls scanner3 noch einen nächsten Text zum einlesen hat gehen wir hinein
            System.out.println(scanner3.next()); //Nach jedem .next() verringert sich der String um das ausgegebene Wort
            System.out.println("Ausgabe hasNext(): "+scanner3.hasNext());
            counter++;
        }
        System.out.println("Es gab insgesamt "+counter+" Woerter in diesem String"); //Gibt mir die Gesamtanzahl an Woertern aus
    }

    //WICHTIG: Wie vergleiche ich STRINGS richtig? Denn String == String wird immer false zurueckgeben, egal obs passt ;)
    public static void stringZusatz(){
        //System.in steht dafuer dass wir explizit über die Konsole was eingeben muessen
        Scanner scanner = new Scanner(System.in);
        boolean bool; //Hilfsvariable fuer weiter unten

        System.out.print("Bitte geben Sie Ihren VORNAMEN ein: "); //Hier weissen wir den User nur auf die Eingabe hin, nicht mehr
        String vorname = scanner.next(); //Erst hier holen wir uns die Eingabe des Users aus der Konsole und speichern Sie in vorname

        System.out.print("Bitte geben Sie Ihren NACHNAMEN ein: ");
        String nachname = scanner.next();

        System.out.println("Bitte geben Sie Ihr Alter an: ");
        int alter = scanner.nextInt(); //ACHTUNG: hier .nextInt() verwenden und nicht .next() -> denn das waere nur fuer Strings

        //2 Optionen um Strings zu verbinden
        //Option 1: String name = vorname + " " + nachname; //Vorname Nachname
        //Option 2: nachfolgend
        String name = vorname.concat(" "+nachname); //Vorname Nachname

        //Pruefen ob der Name Max die silben ax beinhaltet -> Gibt TRUE oder False zurueck
        System.out.println("Contains Max - ax?: "+name.contains("ax"));

        //Pruefen ob der Name gleich dem Namen Max ist
        System.out.println("Ist der eingegebene Name gleich Max? "+vorname.equals("Max")); //Achtung auch Gross- und Kleinschreibung!

        //Ist der Inhalt der Variable > 10?
        bool = name.length() > 10;
        System.out.println("Die Laenge ist groesser 10: "+bool+" und die exakte Laenge ist: "+name.length());
        name = name.toUpperCase();
        System.out.println("Willkommen "+name);
    }
}
