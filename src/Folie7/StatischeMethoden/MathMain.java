package Folie7.StatischeMethoden;

import Folie7.StatischeMethoden.MatheRechner;

public class MathMain {
    public static void main(String[] args) {
        //Hilfsvariablen als Uebergabeparameter
        int a = 10;
        int b = 5;

        //Aufruf der einzelnen Methoden OHNE Instanzierung bzw. Objekterzeugung & speichern in eine Variable zum spaeteren Ausgeben
        int additionResult = MatheRechner.add(a, b);
        int subtractionResult = MatheRechner.subtract(a, b);
        int multiplicationResult = MatheRechner.multiply(a, b);
        double divisionResult = MatheRechner.divide(a, b);

        //Ausgabe aller gespeicherten Rueckgabewerte der Methoden
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraktion: " + subtractionResult);
        System.out.println("Multiplikation: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
