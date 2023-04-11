package Folie3.Arrays.HomeExercises;

public class ForSchleife_BiggestElementInArray {
    public static void main(String[] args) {
        //Ein Array vom Typen Double erzeugen und mit 5 Gleitkommazahlen befuellen
        double[] zahlen = {2.5, 6.8, 3.2, 9.7, 5.1};
        //Hilfsvariable um das groesste Element zu finden, wird ueblicherweise mit dem ersten Wert des Arrays defaultmaessig initialisiert
        double max = zahlen[0];
        //Schleife um den groessten Wert zu finden
        for (int i = 1; i < zahlen.length; i++) {
            //Falls zahl an Stelle i > als die bisher angenommene groesste Zahl -> Dann geh in die If hinein
            if (zahlen[i] > max) {
                //Wir wissen nun das zahl an Stelle i groesser ist als max also nimmt max den Wert von Zahl an Stelle i an
                max = zahlen[i];
            }
        }
        //Ausgabe der groessten Zahl im Array
        System.out.println("Das größte Element im Array ist " + max);
    }
}

