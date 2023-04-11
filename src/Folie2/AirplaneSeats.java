package Folie2;

public class AirplaneSeats {
    public static void main(String[] args) {
        boolean isA380 = false; // Setzen Sie dies auf "false", wenn es sich nicht um ein A380-Flugzeug handelt

        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue; // überspringe die Reihen 13 und 17
            }

            //Ausgabe der aktuellen Reihe
            System.out.println("Reihe " + i);

            if (!isA380 && i == 19) {
                break; // beende die Schleife bei 19 für Nicht-A380-Flugzeuge
            }
        }
    }
}
