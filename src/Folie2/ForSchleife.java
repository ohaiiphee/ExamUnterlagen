package Folie2;

public class ForSchleife {
    public static void main(String[] args) {
        aufgabe01(); //Aufruf der Methode
        System.out.println("\n---Trennstrich zur Unterscheidung---\n");
        aufgabe02(); //Aufruf der Methode
    }

    public static void aufgabe01(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); //Nun werden alle Zahlen von 1 - 10 ausgegeben
        }
    }

    public static void aufgabe02(){
        for (int i = 0; i <= 30; i = i + 2) {  //oder i += 2 als kuerzere Schreibweise
            System.out.println(i); //Nun werden alle geraden Zahlen von 0 - 30 ausgegeben
        }
    }
}
