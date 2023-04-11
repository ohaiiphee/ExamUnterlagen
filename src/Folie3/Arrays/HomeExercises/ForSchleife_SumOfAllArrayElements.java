package Folie3.Arrays.HomeExercises;

public class ForSchleife_SumOfAllArrayElements {
    public static void main(String[] args) {
        //Ein int-Array mit 12 Ganzzahlen erzeugen und die Werte zuweisen
        int[] zahlen = {5, 8, 2, 10, 3, 9, 7, 1, 6, 4, 12, 11};
        //Hilfsvariable erzeugen um die Summe zu speichern
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            //Summe berechnen
            summe += zahlen[i]; //ist gleich wei summe = summe + zahl[i}
        }
        System.out.println("Die Summe aller Elemente im Array ist " + summe);
    }
}

