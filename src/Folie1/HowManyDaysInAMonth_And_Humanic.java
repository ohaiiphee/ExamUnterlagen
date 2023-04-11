package Folie1;

import java.util.Scanner;

public class HowManyDaysInAMonth_And_Humanic {
    public static void main(String[] args) {
        //Hier speichern wir uns den Rueckgabewert der Methode monatstage() in die Variable tage um sie gleich unten zu verwenden
        int tage = monatstage();

        //Hier rufen wir nun die Methode humanic auf - Beispiell zur veranschaulichung von SWITCH - war kein uebungsbeispiel
        humanic();
    }

    public static int monatstage(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Monat an: ");
        String monat = scanner.next();
        int tage = 0;

        monat = monat.toLowerCase();

        //sehr aufwaendig mit IF-Anweisungen
        if(monat.equals("januar") || monat.equals("maerz") || monat.equals("mai") || monat.equals("juli") || monat.equals("august") || monat.equals("oktober") || monat.equals("dezember")){
            System.out.println("Der Monat "+monat+" hat insgesamt 31 Tage (mit IF)");
            tage = 31;
        } else if(monat.equals("februar")){
            System.out.println("Der Monat "+monat+" hat insgesamt 28 Tage (mit IF)");
            tage = 28;
        } else {
            System.out.println("Der Monat "+monat+" hat insgesamt 30 Tage (mit IF)");
            tage = 30;
        }

        //Nun etwas leichter mit SWITCH
        //toLowerCase damit die Groß- und Kleinschreibung egal ist -> Actung, meine Cases muessen nun immer klein sein!
        switch(monat.toLowerCase()){ //vorher Maerz -> jetzt maerz
            case "januar":
            case "maerz":
            case "mai":
            case "juli":
            case "august":
            case "oktober":
            case "dezember":
                System.out.println("Der Monat "+monat+" hat insgesamt 31 Tage (mit SWITCH)");
                tage = 31;
                break;
            case "februar":
                System.out.println("Der Monat "+monat+" hat insgesamt 28 Tage (mit SWITCH)");
                tage = 28;
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                System.out.println("Der Monat "+monat+" hat insgesamt 30 Tage (mit SWITCH)");
                tage = 30;
                //Hier benoeting wir eig kein Break, da wir schon am Ende der Ausfuehrung sind
        }
        return tage;
    }

    public static void humanic(){
        //Humanic Rabatte fuer alle zwischen 25 und 30 Jahren
        int alter = 26; //Jahre
        double einkauf = 100; //Euro
        switch (alter){
            case 25:
                einkauf = einkauf * 0.75;
                break;
            case 26:
                einkauf = einkauf * 0.74;
                break;
            case 27:
                einkauf = einkauf * 0.73;
                break;
            case 28:
                einkauf = einkauf * 0.72;
                break;
            case 29:
                einkauf = einkauf * 0.71;
                break;
            case 30:
                einkauf = einkauf * 0.70;
                break;
            default:
                System.out.println("Sie liegen leider außerhalb der Aktion - Kein Rabatt für Sie");
        }
        System.out.println("Ihre Gesamtrechnung bei HUMANIC betraegt: "+einkauf);
    }
}
