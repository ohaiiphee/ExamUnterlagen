package Folie3.Arrays.HomeExercises;
public class AverageValueOfAllArrayElements {
    public static void main(String[] args) {
        //Erzeugen des Arrays
        double[] zahlen = {3.5, 4.2, 6.7, 8.9, 9.3, 10.1, 12.5, 13.8, 15.2};
        double summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        //Berechnung und Ausgabe des Durschnitts -> Nicht in der Schleife, das kommt erst am Ende!
        double durchschnitt = summe / zahlen.length;
        System.out.println("Der Durchschnitt der Zahlen im Array beträgt: " +
                durchschnitt);
    }
}

