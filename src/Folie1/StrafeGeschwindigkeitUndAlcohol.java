package Folie1;

import java.util.Scanner;

public class StrafeGeschwindigkeitUndAlcohol {
    public static void main(String[] args) {
        //Hier speichern wir den Rueckgabewert von der Methode strafe() in die Variable double strafe um sie weiter zu verwenden
        double strafe = strafe();
        //Hier geben wir nun die Strafe in der Main-Methode aus
        System.out.println("Strafe aus der MAIN-Methode: "+strafe);

        //Hier passiert das gleiche wie oben bei strafe nur bekommen wir hier nun die endgueltige Strafe retour, nach Abzug des Rabatts
        double endgueltigeStrafe = rabatt(strafe); //Achtung, unbedingt den uebergabeparameter strafe mitanfuehren
        System.out.println("Endgueltige Strafe = "+endgueltigeStrafe);
    }

    public static double strafe(){
        Scanner scanner = new Scanner(System.in);
        //Eingabe der gefahrenen Geschwindigkeit
        System.out.print("Bitte jetzt die gemessene Geschwindigkeit eingeben: ");

        int geschwindigkeit = scanner.nextInt(); //die eingabe in die Variable geschwindigkeit speichern

        // Berechnung der Überschreitung - es herrscht 50 km/h im Ortsgebiet also ziehen wir das einfach mal ab
        int ueberschreitung = geschwindigkeit - 50;

        // Strafe Berechnen mit Variable -> Schritt 2 aus Angabe
        double strafe = 0;

        //pruefen wir mal mit einpaar IF-Anweisungen wo wir aktuell mit der Ueberschreitung stehen
        if(ueberschreitung <= 0){
            System.out.println("Es gibt keine Ueberschreitung, die Geschwindigketi war: "+geschwindigkeit+" km/h");
        } else if(ueberschreitung <= 10) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es bleibt bei einer Verwarnung");
        } else if (ueberschreitung <= 20) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es werden 30 EUR faellig");
            strafe += 30; //ist das gleiche we strafe = strafe + 30;
            //Achtung: strafe++ wuerde die Variable nur um den Wert 1 erhoehen!
        } else if (ueberschreitung <= 30) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es werden 50 EUR faellig");
            strafe = strafe + 50;
        } else if (ueberschreitung <= 50) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es werden 100 EUR faellig");
            strafe = strafe + 100;
        } else if (ueberschreitung <= 100) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es werden 500 EUR faellig");
            strafe = strafe + 500;
        } else if (ueberschreitung > 100) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + " km/h - es werden 1500 EUR faellig");
            strafe = strafe + 1500;
        }

        //Alkoholpegel pruefen und auch hier Strafen
        System.out.print("Bitte jetzt den gemessenen Alkoholpegel eingeben: ");
        double alko = scanner.nextDouble(); //Eingabe des Benutzers in die Variable alko speichern

        if(alko <= 0.5){
            System.out.println("Der Alkoholpegel betraegt " + alko + " Promille - alles in Ordnung");
        } else if (alko <= 1.0) {
            System.out.println("Der Alkoholpegel betraegt " + alko + " Promille - es werden 50 EUR faellig");
            strafe = strafe + 50;
        } else if (alko <= 2.0) {
            System.out.println("Der Alkoholpegel betraegt " + alko + " Promille - es werden 150 EUR faellig");
            strafe = strafe + 150;
        } else if (alko > 2.0) {
            System.out.println("Der Alkoholpegel betraegt " + alko + " Promille - es werden 2500 EUR faellig");
            strafe = strafe + 2500;
        }

        //gibt uns die aktuell errechnete Strafe dorthin zurueck, wo wir die Methode strafe() aufgerufen haben -> in diesem Fall also zur main-Methode
        return strafe;
    }

    //Achtung: Hier haben wir einen Uebergabeparameter, d.h. vonirgendwoher kommt schon der Wert der Strafe mit
    public static double rabatt(double strafe){
        Scanner scanner = new Scanner(System.in);
        //Welchen Monat haben wir aktuell um Rabatte zu vergeben?
        System.out.print("Bitte den aktuellen Monat eingeben - Info 1) immer ausgeschrieben | info 2) keine umlaute: ");
        String monat = scanner.next(); //User gibt November ein

        //wir achten nun auf Groß/Kleinschreiben -> Daher muesen die Daten nunnormalisiert werden
        monat = monat.toLowerCase(); //ACHTUNG: Unbedingt die Variable monat mit den veraenderten Werten ueberschreiben...
        //.. der alleinige Aufruf von monat.toLowerCase(); bringt sich ansonst nichts! es muss in die Variable verspeichert werden

        //ACHTUNG: Wenn sie oben alle Monate toLowerCase() machen, dann muessen hier auch alle abfragen klein geschrieben werden
        //wenn Sie hier jetzt auf November mit grossem Anfangsbuchstaben pruefen, dann wird das FALSE sein ;)
        switch (monat){ // monat = November
            case "jaenner":
            case "februar":
                System.out.println("Gerade mal "+monat+" -> Leider kein Rabatt moeglich");
                break; //Das break ist unbedingt notwendig, sonst werden alle nachfolgenden Sachen auch ausgefuehrt!
                //Das ist dieser Fall-Through-Prinzip, wenn wir einmal reinfallen irgendwo, dann wird der Rest des
                //Codes auch ausgefuehrt .. daher koennen wir auch jaenner leer lassen, da bei Jaenner und februar
                //..der gleiche Rabatt vergeben wird, koennen wir bei jaenner reinfallen es wird aber trdm. der Code
                //..unter februar auch mitausgefuehrt, da kein break oben ist
            case "maerz":
            case "april":
                System.out.println("Schon "+monat+" -> 10% Rabatt vergeben");
                strafe = strafe * 0.9;
                break;
            case "mai":
            case "juni":
                System.out.println("Schon "+monat+" -> 15% Rabatt vergeben");
                strafe = strafe * 0.85;
                break;
            case "juli":
            case "august":
                System.out.println("Die Zeit vergeht, wir haben ja schon "+monat+" -> 20% Rabatt vergeben");
                strafe = strafe * 0.8;
                break;
            case "september":
            case "oktober":
                System.out.println("Nun schon "+monat+" -> 25% Rabatt vergeben");
                strafe = strafe * 0.75;
                break;
            case "november":
            case "dezember":
                System.out.println("Im "+monat+" ist es wohl die beste Zeit um Strafen zu machen -> 30% Rabatt vergeben");
                strafe = strafe * 0.7;
                break;
            default: //Sie koennen ein default aufsetzen, quasi falls niergends reingegangen dann fangen sie es hier ab, ist aber kein muss
                System.out.println("Sie haben den Monat wohl falsch geschrieben, daher gibt es heute keine Rabatte fuer Sie!");
        }


        //Ausgabe der finalen Strafe
        if(strafe >= 0){
            System.out.println("Die finale Strafe betraegt: "+strafe);
        } else {
            System.out.println("Alles war in bester Ordnung, es wird nicht gestraft - weiterfahren");
        }
        //Nun geben wir die finale Strafe dorthin zurueck wo die Methode rabatt() eben aufgerufen wurde -> in diesem Fall zurueck zur main-Methode
        return strafe;
    }
}
