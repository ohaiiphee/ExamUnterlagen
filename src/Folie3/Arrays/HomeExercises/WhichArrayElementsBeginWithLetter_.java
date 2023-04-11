package Folie3.Arrays.HomeExercises;

public class WhichArrayElementsBeginWithLetter_ {
    public static void main(String[] args) {

        //String-Array mit 10 Woertern erstellen
        String[] woerter = {"Auto", "Apfel", "Birne", "Banane", "Blume", "Computer", "Delfin", "Ente", "Erdbeere", "Fisch"};
        //Den bestimmten Buchstaben auswaehlen
        char startBuchstabe = 'B';
        for (int i = 0; i < woerter.length; i++) {
            //Pruefen ob der ine Buchstabe an der ersten Stelle also 0, dem startBuchstaben entspricht
            if (woerter[i].charAt(0) == startBuchstabe) {
                //Falls TRUE, dann ausgeben
                System.out.println(woerter[i] + " beginnt mit dem Buchstaben" + startBuchstabe);
            }
        }
    }
}
