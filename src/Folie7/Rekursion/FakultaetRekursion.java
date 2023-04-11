package Folie7.Rekursion;

public class FakultaetRekursion {
    public static void main(String[] args) {
        double zahl = 100; // Die Zahl, von der die Fakultaet berechnet werden soll

        //Erstmaliger Rekursionsaufruf
        double fakultaet = berechneFakultaet(zahl);

        //Ausgabe des abschliessenden Return-Values der Fakultaet
        System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
    }

    public static double berechneFakultaet(double n) {
        //Abbruchbedingung
        if (n == 0) {
            return 1;
        } else {
            //Rueckgabe falls noch nicht bei 0 angekommen
            return n * berechneFakultaet(n - 1);
        }
    }

    //Schrittweise Erklaerung wie die Funktion funktioniert:
    //Wenn der Startwert n = 5 ist

//    berechneFakultaet(5) wird aufgerufen.
//    Da n (5) nicht gleich 0 ist, wird 5 * berechneFakultaet(4) zurückgegeben.
//    berechneFakultaet(4) wird aufgerufen.
//    Da n (4) nicht gleich 0 ist, wird 4 * berechneFakultaet(3) zurückgegeben.
//    berechneFakultaet(3) wird aufgerufen.
//    Da n (3) nicht gleich 0 ist, wird 3 * berechneFakultaet(2) zurückgegeben.
//    berechneFakultaet(2) wird aufgerufen.
//    Da n (2) nicht gleich 0 ist, wird 2 * berechneFakultaet(1) zurückgegeben.
//    berechneFakultaet(1) wird aufgerufen.
//    Da n (1) nicht gleich 0 ist, wird 1 * berechneFakultaet(0) zurückgegeben.
//    berechneFakultaet(0) wird aufgerufen.
//    Da n (0) gleich 0 ist, wird 1 zurückgegeben.
//    Die Rückgabe der Funktion wird nun aufgelöst:
//            1 * (1 * (2 * (3 * (4 * (5 * 1)))))  dies führt zum Endergebnis von 120
}
